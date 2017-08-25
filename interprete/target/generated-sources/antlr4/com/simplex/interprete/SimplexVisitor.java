// Generated from com/simplex/interprete/Simplex.g4 by ANTLR 4.5.1
package com.simplex.interprete;



import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SimplexParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SimplexVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SimplexParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(SimplexParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplexParser#other}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOther(SimplexParser.OtherContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplexParser#problem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProblem(SimplexParser.ProblemContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link SimplexParser#variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(SimplexParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplexParser#objective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjective(SimplexParser.ObjectiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Func}
	 * labeled alternative in {@link SimplexParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(SimplexParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplexParser#item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItem(SimplexParser.ItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplexParser#fItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFItem(SimplexParser.FItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplexParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(SimplexParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Res}
	 * labeled alternative in {@link SimplexParser#restric}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRes(SimplexParser.ResContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplexParser#lComparation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLComparation(SimplexParser.LComparationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplexParser#lComp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLComp(SimplexParser.LCompContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplexParser#bounds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBounds(SimplexParser.BoundsContext ctx);
}