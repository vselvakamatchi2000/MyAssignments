package seleniumAssignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class PrintUniqueCharacter {

	public static void main(String[] args) {
		
		String name="Kamatchi";
		char[] charArray = name.toCharArray();
		Set<Character> Number=new HashSet<Character>();
		for(Character each:charArray)
		{
			Number.add(each);	
		}
		List<Character> list=new ArrayList<Character>(Number);
		for(int i=0;i<list.size();i++)
		{int count=0;
			for(int j=0;j<charArray.length;j++)
			{
				if(list.get(i)==charArray[j])
				{
					count++;
				}
			}
			if(count>1)
			{
				System.out.println(list.get(i));
			}
		}
				
		

	}

}
