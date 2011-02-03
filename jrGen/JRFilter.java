/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;

    public class JRFilter
      extends JRjavadotlangdotObject
      implements Serializable, Cloneable
    {
	static final long serialVersionUID = 0;
	public Cap_ext_ op_filter_voidTovoid;
	public Cap_ext_ JRget_op_filter_voidTovoid() {
		return op_filter_voidTovoid;
	}
	public void JRset_op_filter_voidTovoid(Cap_ext_ op_filter_voidTovoid) {
		this.op_filter_voidTovoid = op_filter_voidTovoid;
	}

	public JRFilter(JRFilter copy)
	{
	this.op_filter_voidTovoid = copy.op_filter_voidTovoid;

	}
	public JRFilter(Object ... opSig)
	{
	this.op_filter_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);

	}
	public JRFilter(boolean dummy)	{
	    super(dummy);
	this.op_filter_voidTovoid = Cap_ext_.noop;

	}
	public Object clone()
	    throws CloneNotSupportedException
	{
	    return super.clone();
	}
	public static Object getNoop()
	{
	    return new JRFilter(true);
	}
    }
