// Generated from lcpn.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link lcpnParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface lcpnVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link lcpnParser#lcpn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLcpn(lcpnParser.LcpnContext ctx);
	/**
	 * Visit a parse tree produced by {@link lcpnParser#rung}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRung(lcpnParser.RungContext ctx);
	/**
	 * Visit a parse tree produced by {@link lcpnParser#left}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeft(lcpnParser.LeftContext ctx);
	/**
	 * Visit a parse tree produced by {@link lcpnParser#right}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRight(lcpnParser.RightContext ctx);
	/**
	 * Visit a parse tree produced by {@link lcpnParser#opleft}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpleft(lcpnParser.OpleftContext ctx);
	/**
	 * Visit a parse tree produced by {@link lcpnParser#opright}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpright(lcpnParser.OprightContext ctx);
	/**
	 * Visit a parse tree produced by {@link lcpnParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperand(lcpnParser.OperandContext ctx);
}