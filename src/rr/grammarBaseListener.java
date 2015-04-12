// Generated from grammar.g4 by ANTLR 4.0

package rr;


import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class grammarBaseListener implements grammarListener {
	@Override public void enterExpression(grammarParser.ExpressionContext ctx) { }
	@Override public void exitExpression(grammarParser.ExpressionContext ctx) { }

	@Override public void enterArtmExp(grammarParser.ArtmExpContext ctx) { }
	@Override public void exitArtmExp(grammarParser.ArtmExpContext ctx) { }

	@Override public void enterVar_dec(grammarParser.Var_decContext ctx) { }
	@Override public void exitVar_dec(grammarParser.Var_decContext ctx) { }

	@Override public void enterInvocation(grammarParser.InvocationContext ctx) { }
	@Override public void exitInvocation(grammarParser.InvocationContext ctx) { }

	@Override public void enterExpOp(grammarParser.ExpOpContext ctx) { }
	@Override public void exitExpOp(grammarParser.ExpOpContext ctx) { }

	@Override public void enterType(grammarParser.TypeContext ctx) { }
	@Override public void exitType(grammarParser.TypeContext ctx) { }

	@Override public void enterStatement(grammarParser.StatementContext ctx) { }
	@Override public void exitStatement(grammarParser.StatementContext ctx) { }

	@Override public void enterWriteFunction(grammarParser.WriteFunctionContext ctx) { }
	@Override public void exitWriteFunction(grammarParser.WriteFunctionContext ctx) { }

	@Override public void enterMulExp(grammarParser.MulExpContext ctx) { }
	@Override public void exitMulExp(grammarParser.MulExpContext ctx) { }

	@Override public void enterMull_operator(grammarParser.Mull_operatorContext ctx) { }
	@Override public void exitMull_operator(grammarParser.Mull_operatorContext ctx) { }

	@Override public void enterProgram(grammarParser.ProgramContext ctx) { }
	@Override public void exitProgram(grammarParser.ProgramContext ctx) { }

	@Override public void enterAdd_operator(grammarParser.Add_operatorContext ctx) { }
	@Override public void exitAdd_operator(grammarParser.Add_operatorContext ctx) { }

	@Override public void enterReadFunction(grammarParser.ReadFunctionContext ctx) { }
	@Override public void exitReadFunction(grammarParser.ReadFunctionContext ctx) { }

	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	@Override public void visitTerminal(TerminalNode node) { }
	@Override public void visitErrorNode(ErrorNode node) { }
}