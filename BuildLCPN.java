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
		theLCPN.addArc(false, "tp"+rn,"rp"+rn,"r");
		theLCPN.addArc(false, "t"+rn,"r"+rn,"r");
		if(rn>1){
			theLCPN.addArc(true, "tp"+(rn-1),"rp"+rn,"r");
			theLCPN.addArc(true, "t"+(rn-1),"r"+rn,"r");
		}
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
		String inp= new String(ctx.getText());
		String inpMirror= new String(inp);
		if(ctx.COIL()!=null || ctx.BIT()!=null){
				inpMirror=inpMirror+"p";
		}
		if(!elements.contains(inp)){
        	elements.add(inp);
			theLCPN.addPlace(inp);
			if(ctx.COIL()!=null || ctx.BIT()!=null){
				theLCPN.addPlace(inpMirror);
			}	
		}
		theLCPN.addArc(false, "tp"+rn,inpMirror,inpMirror);
		theLCPN.addArc(false, "t"+rn,inp,inp);
		return visitChildren(ctx); 		

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitOutput(lcpnParser.OutputContext ctx) { 
		String inp= new String(ctx.getText());
		String inpMirror= new String(inp);
		if(ctx.COIL()!=null || ctx.BIT()!=null){
				inpMirror=inpMirror+"p";
		}
		if(!elements.contains(inp)){
        	elements.add(inp);
			theLCPN.addPlace(inp);
			if(ctx.COIL()!=null || ctx.BIT()!=null){
				theLCPN.addPlace(inpMirror);
			}	
		}
		theLCPN.addArc(true, "tp"+rn,inp,inp);
		theLCPN.addArc(false, "tp"+rn,inp,inp);
		theLCPN.addArc(true, "t"+rn,inpMirror,inpMirror);
		theLCPN.addArc(false, "t"+rn,inpMirror,inpMirror);
		return visitChildren(ctx); }
}