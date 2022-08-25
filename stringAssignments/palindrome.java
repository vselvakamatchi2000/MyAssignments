package stringAssignments;

public class palindrome {

	public static void main(String[] args) {
		String word="madam";
		String word2="";
		for(int i=word.length()-1;i>=0;i--)
		{
			word2=word2+word.charAt(i);
		}
		System.out.println(word2);	
		
		if(word.equals(word2))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}


	

}
}
