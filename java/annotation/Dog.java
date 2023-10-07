package annotation;

public class Dog extends Animal{
	String color="black";
	void printcolor() {
		System.out.println(color);
	
		System.out.println(super.color);
	}

}

