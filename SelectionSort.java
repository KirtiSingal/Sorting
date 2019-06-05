import java.util.*;
class SelectionSort
{
	public static void main(String[] args)
	{
		int i,j,max,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements : ");
		int n= Integer.parseInt(sc.nextLine());
		int arr[]  = new int[n];
		System.out.println("Enter the elements : ");
		for(i=0;i<n;i++)
		{
			arr[i]=Integer.parseInt(sc.nextLine());
		}
		for(i=0;i<(n-1);i++)
		{
			max=i;
			for(j=i+1;j<n;j++)
			{
				if(arr[j]<arr[max])
				{
					max=j;
				}
			}
			temp=arr[max];
			arr[max]=arr[i];
			arr[i]=temp;
		}
		System.out.print("Sorted array : ");
		for(i=0;i<n;i++)
		{
			System.out.print(arr[i]+"\t");
		}
	}
}