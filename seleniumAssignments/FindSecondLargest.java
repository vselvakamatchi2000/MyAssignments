 package seleniumAssignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
	
		
				int[] data = {3,2,11,4,6,7,2,3,3,6,7};
				
				Set<Integer> emptyset=new TreeSet<Integer>();
				
				for(int i=0;i<data.length;i++) {
					emptyset.add(data[i]);
				}
				
			   List<Integer> emptylist=new ArrayList<Integer>(emptyset);
			   int i=emptylist.size();
					System.out.println(emptylist.get(i-2));
				
			
	}

}
