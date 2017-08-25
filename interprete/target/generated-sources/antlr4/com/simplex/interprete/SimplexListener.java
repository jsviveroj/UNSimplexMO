// Generated from com/simplex/interprete/Simplex.g4 by ANTLR 4.5.1
package com.simplex.interprete;



import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimplexParser}.
 */
public interface SimplexListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimplexParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SimplexParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplexParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SimplexParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplexParser#other}.
	 * @param ctx the parse tree
	 */
	void enterOther(SimplexParser.OtherContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplexParser#other}.
	 * @param ctx the parse tree
	 */
	void exitOther(SimplexParser.OtherContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplexParser#problem}.
	 * @param ctx the parse tree
	 */
	void enterProblem(SimplexParser.ProblemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplexParser#problem}.
	 * @param ctx the parse tree
	 */
	void exitProblem(SimplexParser.ProblemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link SimplexParser#variables}.
	 * @param ctx the parse tree
	 */
	void enterVariable(SimplexParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link SimplexParser#variables}.
	 * @param ctx the parse tree
	 */
	void exitVariable(SimplexParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplexParser#objective}.
	 * @param ctx the parse tree
	 */
	void enterObjective(SimplexParser.ObjectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplexParser#objective}.
	 * @param ctx the parse tree
	 */
	void exitObjective(SimplexParser.ObjectiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Func}
	 * labeled alternative in {@link SimplexParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunc(SimplexParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Func}
	 * labeled alternative in {@link SimplexParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunc(SimplexParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplexParser#item}.
	 * @param ctx the parse tree
	 */
	void enterItem(SimplexParser.ItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplexParser#item}.
	 * @param ctx the parse tree
	 */
	void exitItem(SimplexParser.ItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplexParser#fItem}.
	 * @param ctx the parse tree
	 */
	void enterFItem(SimplexParser.FItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplexParser#fItem}.
	 * @param ctx the parse tree
	 */
	void exitFItem(SimplexParser.FItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplexParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(SimplexParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplexParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(SimplexParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Res}
	 * labeled alternative in {@link SimplexParser#restric}.
	 * @param ctx the parse tree
	 */
	void enterRes(SimplexParser.ResContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Res}
	 * labeled alternative in {@link SimplexParser#restric}.
	 * @param ctx the parse tree
	 */
	void exitRes(SimplexParser.ResContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplexParser#lComparation}.
	 * @param ctx the parse tree
	 */
	void enterLComparation(SimplexParser.LComparationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplexParser#lComparation}.
	 * @param ctx the parse tree
	 */
	void exitLComparation(SimplexParser.LComparationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplexParser#lComp}.
	 * @param ctx the parse tree
	 */
	void enterLComp(SimplexParser.LCompContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplexParser#lComp}.
	 * @param ctx the parse tree
	 */
	void exitLComp(SimplexParser.LCompContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplexParser#bounds}.
	 * @param ctx the parse tree
	 */
	void enterBounds(SimplexParser.BoundsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplexParser#bounds}.
	 * @param ctx the parse tree
	 */
	void exitBounds(SimplexParser.BoundsContext ctx);
}