// Generated from lcpn.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.jdom2.JDOMException;
import java.io.IOException;
/**
 * This class provides an empty implementation of {@link lcpnVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class BuildLCPN<T> extends lcpnBaseVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	AutoCPN theLCPN;
	@Override public T visitLcpn(lcpnParser.LcpnContext ctx) { 
		try{
			theLCPN=new AutoCPN();
			visitChildren(ctx); 
			theLCPN.writeCPN(System.out);
		}
		catch(JDOMException j){
			System.out.println("No CPN!!!!!!!!!");
		}
		catch(IOException i){
			System.out.println("No CPN!!!!!!!!!");
		}
		return null;
		}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitRung(lcpnParser.RungContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitLeft(lcpnParser.LeftContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitRight(lcpnParser.RightContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitOpleft(lcpnParser.OpleftContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitOpright(lcpnParser.OprightContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitOperand(lcpnParser.OperandContext ctx) { 
		theLCPN.addPlace(ctx.getText());
		
		return visitChildren(ctx); }
}