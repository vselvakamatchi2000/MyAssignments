package seleniumAssignments;


import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		
		int[] MissingNO= {1,2,4,6,5,5,8,7,8,9,10};
		Set<Integer> Number=new TreeSet<Integer>();
		for(int i=0;i<MissingNO.length-1;i++) 
		   {
			Number.add(MissingNO[i]);
		   }
		
		for(int j=1;j<=Number.size();j++)
		{
		if(!Number.contains(j))	
		{
			System.out.println("Missing Number: "+j);
		}
		}
	}

}
