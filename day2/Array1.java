package week1.day2;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numbers[]= {3,2,11,4,6,7};
		int numbers1[]= {1,2,8,4,9,7};
		System.out.println("Intersection of the two arrays::");
		
		for(int i=0;i<numbers.length;i++) {
			for(int j=0;j<numbers1.length;j++) {
				if (numbers[i]==numbers1[j]) {
					System.out.println(numbers[j]);
				}
			}
		}

}
}