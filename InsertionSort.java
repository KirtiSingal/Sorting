import java.util.*;
class InsertionSort
{
	int[] arr;
	int i,j,n,key;
	public void input()
	{
		Scanner sc=  new Scanner(System.in);
		System.out.print("Enter number of elements : ");
		n = Integer.parseInt(sc.nextLine());
		arr=new int[n];
		for(i=0;i<n;i++)
		{
			System.out.print("Enter element "+(i+1)+" : ");
			arr[i]=Integer.parseInt(sc.nextLine());
		}		
	}
	public void sort()
	{
		for(i=1;i<n;i++)
		{
			key=arr[i];
			for(j=0;j<i;j++)
			{
				if(key<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;	
				}	
			}
		}
		
	}
	public void display()
	{
		for(i=0;i<n;i++)
		{
			System.out.print(arr[i]+"  ");
		}
	}
	public static void main(String[] args)
	{
		InsertionSort i = new InsertionSort();
		i.input();
		i.sort();
		System.out.print("Sorted array : ");
		i.display();
	}
}