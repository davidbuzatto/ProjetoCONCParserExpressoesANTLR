// Generated from gramatica/Expressoes.g4 by ANTLR 4.13.1
package parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExpressoesParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExpressoesVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExpressoesParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(ExpressoesParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressoesParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao(ExpressoesParser.ExpressaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressoesParser#termo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermo(ExpressoesParser.TermoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fatorInt}
	 * labeled alternative in {@link ExpressoesParser#fator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFatorInt(ExpressoesParser.FatorIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fatorDec}
	 * labeled alternative in {@link ExpressoesParser#fator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFatorDec(ExpressoesParser.FatorDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fatorParenteses}
	 * labeled alternative in {@link ExpressoesParser#fator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFatorParenteses(ExpressoesParser.FatorParentesesContext ctx);
}