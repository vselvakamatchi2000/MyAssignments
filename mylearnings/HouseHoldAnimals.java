package mylearnings;

public class HouseHoldAnimals extends Animal {
	
	
	public static void main(String[] args) {
		HouseHoldAnimals s = new HouseHoldAnimals();
		s.move();
		s.barke();
		s.name();

	
	}

	public void move() {
		System.out.println("It's movable");
		
	}

	public void barke() {
		System.out.println("Barking");
		
	}


}
