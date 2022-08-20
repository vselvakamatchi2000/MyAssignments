package Week3.day1Assignment;

public class Calculator {
	public void add(int a,int b, int c) 
	{
		int X=a+b+c;
		System.out.println("Addition of 3 int arg: "+X);
	}
	public void add(int d,int f)
	{
		int Y=d+f;
		System.out.println("Addition of 2 int arg: "+Y);
	}
	public void add(double e,double f)
	{
		double Z=e+f;
		System.out.println("Addition of 2 double: "+Z);
	}
	public void add(double g,int h)
	{
		double I=g+h;
		System.out.println("Addition of doubt and int arg: "+I);
	}
	public static void main(String[] args) {
		Calculator overload=new Calculator();
		overload.add(1,2,3);
		overload.add(11, 12);
		overload.add(3.14, 3.15);
		overload.add(4.11,2);
		
		
	}
	
	

}
