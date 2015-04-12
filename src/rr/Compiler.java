package rr;

import org.antlr.v4.runtime.CommonTokenStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Compiler {

    public static class Program {
        private List<Statement> stmts = new ArrayList<Statement>();
        public static Map<String, String> nt = new HashMap<String, String>();

        public Program() {

        }

        public void add(Statement stmt) {
            stmts.add(stmt);
        }

        public String emit() {
            FunctionBlock block = new FunctionBlock();
            block.emit("@.format_str = private unnamed_addr constant [4 x i8] c\"%d\\0A\\00\", align 1\n");
            block.emit("@.strdouble = private unnamed_addr constant [4 x i8] c\"%lf\\00\", align 1\n");
            block.emit("@.strint = private unnamed_addr constant [3 x i8] c\"%d\\00\", align 1\n");
            block.emit("define i32 @main() nounwind {\n");
            for(Statement stmt : stmts) {
                stmt.emit(block);
            }
            block.emit("}\n");
            block.emit("declare i32 @__isoc99_scanf(i8*, ...)\n");
            block.emit("declare i32 @printf(i8*, ...)\n");
            return block.getString();
        }
    }

    public static abstract class Statement {
        public abstract void emit(FunctionBlock block);
    }

    public static class Return extends Statement {
        private final Expression expr;

        public Return(Expression expr) {
            this.expr = expr;
        }

        @Override
        public void emit(FunctionBlock block) {
            block.emit("ret i32 0\n");
        }
    }

    public static class VariableDeclaration extends Statement {
        private final String name;
        private final String type;

        public VariableDeclaration(String name, String type) {
            this.name = name;
            this.type = type;
            Program.nt.put(name, type);
        }

        @Override
        public void emit(FunctionBlock block) {
            if (type == "int") {
                block.emit("%" + name + " = alloca i32, align 4\n");
            }

            else
                block.emit("%" + name + " = alloca double, align 4\n");
        }
    }

    public static class Assignment extends Statement {
        private final String where;
        private final Expression expr;

        public Assignment(String where, Expression expr) {
            this.where = where;
            this.expr = expr;
        }

        @Override
        public void emit(FunctionBlock block) {
            int reg = expr.emit(block);
            if (expr instanceof ArExpressionAll) {
                if(Program.nt.get(where) == "int") {
                       reg = block.getRegister();
                       block.emit("%" + reg + " = fptosi double %" + (reg-1) + " to i32\n");
                       block.emit("store i32 %" + reg);
                }
                    else
                       block.emit("store double %" + (reg-1));
            }
            if(Program.nt.get(where) == "int")
                block.emit(", i32* %" + where + ", align 4\n");
            else
                block.emit(", double* %" + where + ", align 4\n");
        }
    }

    public static class ReadFunction extends Statement{
        private final String name;
        public ReadFunction(String name) {
            this.name = name;
        }

        @Override
        public void emit(FunctionBlock block) {
            if (Program.nt.get(name) == "int") {
                int reg = block.getRegister();
                block.emit("%" + reg + " = call i32 (i8*, ...)* @__isoc99_scanf(i8* getelementptr inbounds ([3 x i8]* @.strint, i32 0, i32 0), i32* %" + name + ")\n");
            }
            else if(Program.nt.get(name) == "double"){
                int reg = block.getRegister();
                block.emit("%" + reg + " = call i32 (i8*, ...)* @__isoc99_scanf(i8* getelementptr inbounds ([4 x i8]* @.strdouble, i32 0, i32 0), double* %" + name + ")\n");
            }
        }
    }

    public static class WriteFunction extends Statement{
        private final String name;
        public WriteFunction(String name) {
            this.name = name;
        }

        @Override
        public void emit(FunctionBlock block) {
            if (Program.nt.get(name) == "int"){
                int reg = block.getRegister();
                block.emit("%" + reg + "= load i32* %" + name + ", align 4\n");
                reg = block.getRegister();
                block.emit("%" + reg + "= call i32 (i8*, ...)* @printf(i8* getelementptr inbounds ([3 x i8]* @.strint, i32 0, i32 0), i32 %" + (reg-1) +")\n");
            }
            else if(Program.nt.get(name) == "double"){

                int reg = block.getRegister();
                block.emit("%" + reg + "= load double* %" + name + ", align 4\n");
                reg = block.getRegister();
                block.emit("%" + reg + "= call i32 (i8*, ...)* @printf(i8* getelementptr inbounds ([4 x i8]* @.strdouble, i32 0, i32 0), double %" + (reg-1) + ")\n");
            }
            else if(name.contains(".") && !name.contains("\"")){
                int reg = block.getRegister();
                double dob = Double.parseDouble(name);
                block.emit("%" + reg + "= call i32 (i8*, ...)* @printf(i8* getelementptr inbounds ([4 x i8]* @.strdouble, i32 0, i32 0), double " + String.format("%E",dob).replace(",",".") + ")\n");
            }
            else if(!name.contains("\"")){
                int reg = block.getRegister();
                block.emit("%" + reg + "= call i32 (i8*, ...)* @printf(i8* getelementptr inbounds ([3 x i8]* @.strint, i32 0, i32 0), i32 " + name +")\n");
            }
        }
    }

    public static class Invocation extends Statement {
        private final String name;
        private List<Expression> params = new ArrayList<Expression>();

        public Invocation(String name) {
            this.name = name;
        }

        public void add(Expression exp) {
            params.add(exp);
        }

        @Override
        public void emit(FunctionBlock block) {

        }
    }

    public static abstract class Expression {
        public abstract int emit(FunctionBlock block);
        public String name;

    }

    public static class IntExpression extends Expression {
        private final int val;

        public IntExpression(String val) {
            this.val = Integer.parseInt(val);
            name = val;
        }

        @Override
        public int emit(FunctionBlock block) {
            //int reg = block.getRegister();
            block.emit("store i32 " + val);
            return 0;
        }

    }

    public static class DoubleExpression extends Expression {
        private final double val;
        public DoubleExpression(String val) {
            this.val = Double.parseDouble(val);
            name = val;
        }


        @Override
        public int emit(FunctionBlock block) {
            //int reg = block.getRegister();
            block.emit("store double " + val);
            return 0;
        }

    }

    static public class ArExpressionAll extends Expression {

        private List<ArExpression> exps = new ArrayList<ArExpression>();
        private List<String> heapArt = new ArrayList<String>();
        public ArExpressionAll(ArExpression first) {
            exps.add(first);
        }

        public void add(ArExpression e, String a) {
            exps.add(e);
            heapArt.add(a);
        }

        @Override
        public int emit(FunctionBlock block) {
            int reg = block.getRegister();
            String operator;
            int reg_max = 0;
            List<Integer> regList = new ArrayList<Integer>();
            List<Integer> numberIndex = new ArrayList<Integer>();
            List<Integer> numberAddDiv = new ArrayList<Integer>();

            for (int j = 0; j < exps.size(); j++) {
                ArExpression ar = exps.get(j);
                if (ar.heapArt.size() != 0) {
                    List<Integer> regTmp = new ArrayList<Integer>();
                    reg_max = reg;
                    //załaduj wszystkie zmienne z każdego iloczynu/ilorazu do rejestru 
                    for (int i = 0; i < ar.exps.size(); i++) {
                        if (ar.exps.get(i) instanceof RefExpression) {
                            numberIndex.add(-1);
                            if(Program.nt.get(ar.exps.get(i).name) == "int") {
                                block.emit("%" + reg + " = load i32* %" + ar.exps.get(i).name + ", align 4" + "\n");
                                reg = block.getRegister();
                                block.emit("%" + reg + " = sitofp i32 %" + (reg-1) + " to double" + "\n");
                            } else {
                                block.emit("%" + reg + " = load double* %" + ar.exps.get(i).name + ", align 8" + "\n");
                            }
                            regTmp.add(reg);
                            reg_max = reg;
                            reg = block.getRegister();
                        }
                        else {
                            reg_max = reg - 1;
                            numberIndex.add(i);
                            regTmp.add(-1);

                        }

                    }

                    operator = checkOperator(ar.heapArt.get(0));
                    
                    //wypisz reprezentacje posrednia operacji mnozenia/dzielenia
                    if(regTmp.get(0) == -1)
                        block.emit("%" + (++reg_max) + " = " + operator + " double " + Double.parseDouble((String)ar.exps.get(numberIndex.get(0)).name) + "e+00, ");
                    else
                        block.emit("%" + (++reg_max) + " = " + operator + " double %" + regTmp.get(0) + ", ");

                    for(int i = 1; i < ar.heapArt.size(); i++) {
                        operator = checkOperator(ar.heapArt.get(i));

                        if(regTmp.get(i) == -1) {
                            block.emit(Double.parseDouble(ar.exps.get(numberIndex.get(i)).name) + "e+00\n");
                            block.emit("%" + (++reg_max) + " = " + operator + " double %" + (reg_max-1) + ", ");
                        }
                        else  {
                            block.emit("%" + regTmp.get(i) + "\n");
                            block.emit("%" + (++reg_max) + " = " + operator + " double %" + (reg_max-1) + ", ");
                        }
                    }

                    if(regTmp.get(ar.heapArt.size()) == -1)
                        block.emit(Double.parseDouble(ar.exps.get(numberIndex.get(ar.heapArt.size())).name) + "e+00\n");
                    else
                        block.emit("%" + regTmp.get(ar.heapArt.size()) + "\n");

                    regList.add(reg_max);
                    numberAddDiv.add(-1);
                    block.setRegister(++reg_max);
                    reg = block.getRegister();
                    numberIndex.clear();
                }
                else {

                    //załaduj do rejestru każdą zmienna operacji sumy/różnicy
                    if (ar.exps.get(0) instanceof RefExpression) {
                        numberAddDiv.add(-1);
                        if(Program.nt.get(ar.exps.get(0).name) == "int") {
                            block.emit("%" + (reg) + " = load i32* %" + ar.exps.get(0).name + ", align 4" + "\n");
                            reg = block.getRegister();
                            block.emit("%" + reg + " = sitofp i32 %" + (reg-1) + " to double" + "\n");
                        } else {
                            block.emit("%" + reg + " = load double* %" + ar.exps.get(0).name + ", align 8" + "\n");
                        }
                        regList.add(reg);
                        reg = block.getRegister();
                    } else {
                        numberAddDiv.add(j);
                        regList.add(-1);
                    }
                }

            }


            if(heapArt.size() != 0) {

                //wypisz reprezentacje posrednia operacji dodawnia/odejmowania
                operator = checkOperator(heapArt.get(0));
                if(regList.get(0) == -1)
                    block.emit("%" + (reg++) + " = " + operator + " double " + Double.parseDouble(exps.get(numberAddDiv.get(0)).exps.get(0).name) + "e+00, ");
                else
                    block.emit("%" + (reg++) + " = " + operator + " double %" + regList.get(0) + ", ");

                for(int i = 1; i < heapArt.size(); i++) {
                    operator = checkOperator(heapArt.get(i));
                    if(regList.get(i) == -1) {
                        block.emit(Double.parseDouble(exps.get(numberAddDiv.get(i)).exps.get(0).name) + "e+00\n");
                        block.emit("%" + (reg++) + " = " + operator + " double %" + (reg-2) + ", ");
                    }
                    else  {
                        block.emit("%" + regList.get(i) + "\n");
                        block.emit("%" + (reg++) + " = " + operator + " double %" + (reg-2) + ", ");
                    }
                }

                if(regList.get(heapArt.size()) == -1)
                    block.emit(Double.parseDouble(exps.get(numberAddDiv.get(heapArt.size())).exps.get(0).name) + "e+00\n");
                else
                    block.emit("%" + regList.get(heapArt.size()) + "\n");

            }

            block.setRegister(reg);
            return reg;
        }

        private String checkOperator(String operator)  {
             if(operator == "*")
                 return "fmul";
             else if(operator == "/")
                 return "fdiv";
             else if (operator == "+")
                 return "fadd";
             else
                 return "fsub";
        }
    }

    static public class ArExpression extends Expression {
        private List<Expression> exps = new ArrayList<Expression>();
        private List<String> heapArt = new ArrayList<String>();
        public ArExpression(Expression first) {
            exps.add(first);
        }

        public void add(Expression e, String a) {
            exps.add(e);
            heapArt.add(a);
        }

        @Override
        public int emit(FunctionBlock block) {
            return 0;
        }


    }



    public static class RefExpression extends Expression {

        public RefExpression(String name) {
            this.name = name;
        }

        @Override
        public int emit(FunctionBlock block) {
            return 0;
        }
    }

    public static class Type  {
        private final String name;

        public Type(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }


    }


    public static void main(String[] args) {
        try {
            grammarLexer lexer = new grammarLexer(new org.antlr.v4.runtime.ANTLRInputStream(new FileReader("test")));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            grammarParser parser = new grammarParser(tokens);
            Program prog = parser.program().ret;
            String str = prog.emit();
            FileWriter writer = new FileWriter("test.ll");
            writer.write(str);
            writer.close();
            System.exit(0);
        } catch (FileNotFoundException e) {
              e.printStackTrace();
              System.exit(1);
        } catch (IOException e) {
              e.printStackTrace();
              System.exit(1);
        }
    }
}
