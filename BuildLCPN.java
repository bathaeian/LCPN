// Generated from lcpn.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.jdom2.JDOMException;
import java.io.IOException;
import java.util.Set;
import java.util.HashSet;

      

    
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
	private int rn;
	AutoCPN theLCPN;
	Set elements;
	@Override public T visitLcpn(lcpnParser.LcpnContext ctx) { 
		rn=0;
		elements = new HashSet();
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
	@Override public T visitRung(lcpnParser.RungContext ctx) { 
		rn++;
		theLCPN.addPlace("r"+rn);
		theLCPN.addPlace("rp"+rn);
		theLCPN.addTrans("t"+rn);
		theLCPN.addTrans("tp"+rn);

		return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitLeft(lcpnParser.LeftContext ctx) { 
		
		return visitChildren(ctx); }
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
	@Override public T visitInput(lcpnParser.InputContext ctx) { 
		if(!elements.contains(ctx.getText())){
        	elements.add(ctx.getText());
			theLCPN.addPlace(ctx.getText());
			if(ctx.COIL()!=null)	theLCPN.addPlace(ctx.getText()+"p");
			if(ctx.BIT()!=null)	theLCPN.addPlace(ctx.getText()+"p");
		}
		
		return visitChildren(ctx); 
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitOutput(lcpnParser.OutputContext ctx) { return visitChildren(ctx); }
}