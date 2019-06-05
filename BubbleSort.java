import java.util.*;
class BubbleSort
{
	public static void main(String args[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		n=Integer.parseInt(sc.nextLine());
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			System.out.println("Enter element number "+i+" : ");
			arr[i]=Integer.parseInt(sc.nextLine());	
		}	
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<(n-i);j++)
			{
				if(arr[j]<arr[j-1])
				{
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Sorted array : ");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+"\t");
		}
	}
}