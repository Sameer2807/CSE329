import java.util.Scanner;
class compare
{
	public static void main(String[] args)
	{
	

		int a[]=new int[]{1,2,3,4,5,2,3,4,1};
		int i,j;
		
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[j]==a[i])
				{
					System.out.println(a[j]);
				}
			}
		}
		
		
	}
}
