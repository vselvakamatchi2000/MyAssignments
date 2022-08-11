package week1.day2;

public class FibonacciSeries {
	int[] i= {0,1,1,2,3,5,8,13};

	public static void main(String[] args) {
		
		int i=8,firstNum=0,SecNum=1;
		System.out.println(firstNum);
		System.out.println(SecNum);
		for(i=2;i<=8;i++) {
		int sum1 = firstNum+SecNum;
		firstNum=SecNum;
		SecNum=sum1;
		System.out.println(sum1);}
				
		
}

}
