// Generated from grammar.g4 by ANTLR 4.0

package rr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

public interface grammarListener extends ParseTreeListener {
	void enterExpression(grammarParser.ExpressionContext ctx);
	void exitExpression(grammarParser.ExpressionContext ctx);

	void enterArtmExp(grammarParser.ArtmExpContext ctx);
	void exitArtmExp(grammarParser.ArtmExpContext ctx);

	void enterVar_dec(grammarParser.Var_decContext ctx);
	void exitVar_dec(grammarParser.Var_decContext ctx);

	void enterInvocation(grammarParser.InvocationContext ctx);
	void exitInvocation(grammarParser.InvocationContext ctx);

	void enterExpOp(grammarParser.ExpOpContext ctx);
	void exitExpOp(grammarParser.ExpOpContext ctx);

	void enterType(grammarParser.TypeContext ctx);
	void exitType(grammarParser.TypeContext ctx);

	void enterStatement(grammarParser.StatementContext ctx);
	void exitStatement(grammarParser.StatementContext ctx);

	void enterWriteFunction(grammarParser.WriteFunctionContext ctx);
	void exitWriteFunction(grammarParser.WriteFunctionContext ctx);

	void enterMulExp(grammarParser.MulExpContext ctx);
	void exitMulExp(grammarParser.MulExpContext ctx);

	void enterMull_operator(grammarParser.Mull_operatorContext ctx);
	void exitMull_operator(grammarParser.Mull_operatorContext ctx);

	void enterProgram(grammarParser.ProgramContext ctx);
	void exitProgram(grammarParser.ProgramContext ctx);

	void enterAdd_operator(grammarParser.Add_operatorContext ctx);
	void exitAdd_operator(grammarParser.Add_operatorContext ctx);

	void enterReadFunction(grammarParser.ReadFunctionContext ctx);
	void exitReadFunction(grammarParser.ReadFunctionContext ctx);
}