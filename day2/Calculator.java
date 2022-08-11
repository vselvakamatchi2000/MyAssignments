package week1.day2;

public class Calculator {
	public int addition(int X, int Y) 
	{
		return(X+Y);
	}
	public int subtraction(int X,int Y) 
	{
		return(X-Y);
	}
	public int multiplication(int X, int Y)
	{
		return(X*Y);
	}
	public int division(int X, int Y)
	{
		return(X/Y);
	}
	
public static void main(String[] args) {
	Calculator cal =new Calculator();
	System.out.println(cal.addition(10,10));
	System.out.println(cal.subtraction(9,5));
	System.out.println(cal.multiplication(2,5));
	System.out.println(cal.division(4,2));
}


}
