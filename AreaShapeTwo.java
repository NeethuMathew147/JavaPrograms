package areaOfShapes;


public class AreaShapeTwo extends AreaOfShapes {
	
	
	public  void rectangle(int l,int b)
	{
		int r= l;
		int s=b;
		int ar = r*s;
		System.out.println("Area of Square is " + ar);
	}
	public void triangle()
	{
		int r=2;
		int s=8;
		int at =(r*s)/2;
		System.out.println("Area of Square is " + at);
		
	}
	
	public static void main(String arg[])
	{
		 
		 
		 AreaShapeTwo as = new AreaShapeTwo();
		 as.circle();
		 as.square();
		 as.rectangle(5,7);
		 as.triangle();
		
	}


}
