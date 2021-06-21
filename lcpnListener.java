// Generated from lcpn.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link lcpnParser}.
 */
public interface lcpnListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link lcpnParser#lcpn}.
	 * @param ctx the parse tree
	 */
	void enterLcpn(lcpnParser.LcpnContext ctx);
	/**
	 * Exit a parse tree produced by {@link lcpnParser#lcpn}.
	 * @param ctx the parse tree
	 */
	void exitLcpn(lcpnParser.LcpnContext ctx);
	/**
	 * Enter a parse tree produced by {@link lcpnParser#rung}.
	 * @param ctx the parse tree
	 */
	void enterRung(lcpnParser.RungContext ctx);
	/**
	 * Exit a parse tree produced by {@link lcpnParser#rung}.
	 * @param ctx the parse tree
	 */
	void exitRung(lcpnParser.RungContext ctx);
	/**
	 * Enter a parse tree produced by {@link lcpnParser#left}.
	 * @param ctx the parse tree
	 */
	void enterLeft(lcpnParser.LeftContext ctx);
	/**
	 * Exit a parse tree produced by {@link lcpnParser#left}.
	 * @param ctx the parse tree
	 */
	void exitLeft(lcpnParser.LeftContext ctx);
	/**
	 * Enter a parse tree produced by {@link lcpnParser#right}.
	 * @param ctx the parse tree
	 */
	void enterRight(lcpnParser.RightContext ctx);
	/**
	 * Exit a parse tree produced by {@link lcpnParser#right}.
	 * @param ctx the parse tree
	 */
	void exitRight(lcpnParser.RightContext ctx);
	/**
	 * Enter a parse tree produced by {@link lcpnParser#opleft}.
	 * @param ctx the parse tree
	 */
	void enterOpleft(lcpnParser.OpleftContext ctx);
	/**
	 * Exit a parse tree produced by {@link lcpnParser#opleft}.
	 * @param ctx the parse tree
	 */
	void exitOpleft(lcpnParser.OpleftContext ctx);
	/**
	 * Enter a parse tree produced by {@link lcpnParser#opright}.
	 * @param ctx the parse tree
	 */
	void enterOpright(lcpnParser.OprightContext ctx);
	/**
	 * Exit a parse tree produced by {@link lcpnParser#opright}.
	 * @param ctx the parse tree
	 */
	void exitOpright(lcpnParser.OprightContext ctx);
	/**
	 * Enter a parse tree produced by {@link lcpnParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOperand(lcpnParser.OperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link lcpnParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOperand(lcpnParser.OperandContext ctx);
}