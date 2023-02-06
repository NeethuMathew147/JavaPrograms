package inheritanceProgram;

public class SingleInhertanceChild extends SingleInheritance{

	public void disp()
	{
		System.out.println("Hello Neethu");
	}	
	
	public static void main(String arg[])
	{
		SingleInhertanceChild sic = new SingleInhertanceChild();
		sic.disp();
		sic.display();
		}
	
}
