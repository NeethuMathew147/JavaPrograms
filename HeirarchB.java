package inheritanceProgram;

public class HeirarchB extends HeirarchA {
	
	public void dispB()
	{
		System.out.println("I am B");
		
	}
	public static void main(String arg[])
	{
		HeirarchB hb = new HeirarchB();
		hb.dispB();
		hb.dispA();
		HeirarchC hc = new HeirarchC();
		hc.dispC();
		hc.dispA();
	
	}

}
