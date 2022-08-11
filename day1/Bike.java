package week1.day1;

public class Bike {
	public void adjustMirrors() 
	{
		System.out.println("adjustMirrors");
	}
	
	public void applygear() 
	{
		System.out.println("applygear");
	}

	public static void main(String[] args) 
	{
		Car Toyoto=new Car();
		Toyoto.applyBrake();
		Toyoto.soundHorn();
		
		Bike Honda=new Bike();
		Honda.adjustMirrors();
		Honda.applygear();
		
		
	}
	

}
