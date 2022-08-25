package stringAssignments;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String S = "We learn java basics as part of java sessions in java week1";
		int count=0;
		String[] split = S.split(" ");
		
		for(int i=0;i<split.length;i++)
		{
			for(int j=i+1;j<split.length;j++)
			{
				if(split[i].equalsIgnoreCase(split[j]))
				{
				count++;
				split[i]="";
				}
			}
		}
		if(count>1)
		{
			for(int r=0;r<split.length;r++)
			{
				System.out.print(split[r]+" ");
			}
		}
		


	}

}
