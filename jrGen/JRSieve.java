/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;

    public class JRSieve
      extends JRjavadotlangdotObject
      implements Serializable, Cloneable
    {
	static final long serialVersionUID = 0;
	public Cap_ext_ op_nums_voidTovoid;
	public Cap_ext_ JRget_op_nums_voidTovoid() {
		return op_nums_voidTovoid;
	}
	public void JRset_op_nums_voidTovoid(Cap_ext_ op_nums_voidTovoid) {
		this.op_nums_voidTovoid = op_nums_voidTovoid;
	}

	public Cap_ext_ op_print_voidTovoid;
	public Cap_ext_ JRget_op_print_voidTovoid() {
		return op_print_voidTovoid;
	}
	public void JRset_op_print_voidTovoid(Cap_ext_ op_print_voidTovoid) {
		this.op_print_voidTovoid = op_print_voidTovoid;
	}

	public Cap_ext_ op_output_intTovoid;
	public Cap_ext_ JRget_op_output_intTovoid() {
		return op_output_intTovoid;
	}
	public void JRset_op_output_intTovoid(Cap_ext_ op_output_intTovoid) {
		this.op_output_intTovoid = op_output_intTovoid;
	}

	public JRSieve(JRSieve copy)
	{
	this.op_nums_voidTovoid = copy.op_nums_voidTovoid;
	this.op_print_voidTovoid = copy.op_print_voidTovoid;
	this.op_output_intTovoid = copy.op_output_intTovoid;

	}
	public JRSieve(Object ... opSig)
	{
	this.op_nums_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_print_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);
	this.op_output_intTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[2]);

	}
	public JRSieve(boolean dummy)	{
	    super(dummy);
	this.op_nums_voidTovoid = Cap_ext_.noop;
	this.op_print_voidTovoid = Cap_ext_.noop;
	this.op_output_intTovoid = Cap_ext_.noop;

	}
	public Object clone()
	    throws CloneNotSupportedException
	{
	    return super.clone();
	}
	public static Object getNoop()
	{
	    return new JRSieve(true);
	}
    }
