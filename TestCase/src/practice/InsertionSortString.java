package practice;

public class InsertionSortString 
{

	public static String[] sort(String ar[]) {
		
	for(int i=1;i<ar.length;i++)
	{    
		String key=ar[i];
		int j=i-1;
		while(j>=0 && ar[j].compareTo(key)>0) 
		{
			ar[j+1]=ar[j];
			j--;
		}
		ar[j+1]=key;
	}
		return ar;
		
	}

	
	public static void main(String[] args)
	{
		String ar[]= {"cat","bat","apple","seed","noodles"};
		  String rs[]=sort(ar);
		  for(int i=0;i<rs.length;i++) 
		  {
			 System.out.println(rs[i]);
		  }
		  
	}
}
