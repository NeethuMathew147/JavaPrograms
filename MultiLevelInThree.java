package inheritanceProgram;

public class MultiLevelInThree extends MultiLevelInTwo {
	public void dispThree()
	{
		System.out.println("Hello All");
	}

	public static void main(String arg[])
	{
		MultiLevelInThree m = new MultiLevelInThree();
		m.dispOne();
		m.dispTwo();
		m.dispThree();
	}
}
