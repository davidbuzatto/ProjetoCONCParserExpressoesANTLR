// Generated from gramatica/Expressoes.g4 by ANTLR 4.13.1
package parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExpressoesParser}.
 */
public interface ExpressoesListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExpressoesParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(ExpressoesParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressoesParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(ExpressoesParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressoesParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(ExpressoesParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressoesParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(ExpressoesParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressoesParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(ExpressoesParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressoesParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(ExpressoesParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fatorInt}
	 * labeled alternative in {@link ExpressoesParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFatorInt(ExpressoesParser.FatorIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fatorInt}
	 * labeled alternative in {@link ExpressoesParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFatorInt(ExpressoesParser.FatorIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fatorDec}
	 * labeled alternative in {@link ExpressoesParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFatorDec(ExpressoesParser.FatorDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fatorDec}
	 * labeled alternative in {@link ExpressoesParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFatorDec(ExpressoesParser.FatorDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fatorParenteses}
	 * labeled alternative in {@link ExpressoesParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFatorParenteses(ExpressoesParser.FatorParentesesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fatorParenteses}
	 * labeled alternative in {@link ExpressoesParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFatorParenteses(ExpressoesParser.FatorParentesesContext ctx);
}