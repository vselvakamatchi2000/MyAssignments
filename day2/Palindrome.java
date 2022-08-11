package week1.day2;

public class Palindrome{
	public static void main(String[] args) 
	{
	int num=34343,rev=0,temp=num;
	while(num>0) {
		rev=rev*10;
		rev=rev+num%10;
		num=num/10;
		
	}
	if(rev==temp) {
		System.out.println("Palindrome");
	}
	else {
		System.out.println("Not a palindrome");
	}
	


	}
	
	

}
