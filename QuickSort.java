import java.util.*;
class QuickSort
{
	public int partition(int[] arr,int low,int high)
	{
		int pivot=arr[high];
		int i=low-1;
		for(int j=low;j<=high-1;j++)
		{
			if(arr[j]<=pivot)
			{
				i++;
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
			}
		}	
		int temp=arr[i+1];
		arr[i+1]=arr[high];
		arr[high]=temp;
		return (i+1);
	}
	public void quickSort(int[] arr,int low,int high)
	{
		if(low<high)
		{
			int p = partition(arr,low,high);
			quickSort(arr,low,p-1);
			quickSort(arr,p+1,high);
		}		
	}
	public static void main(String[] args)
	{
		QuickSort q=new QuickSort();
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number of elements : ");
		int n =Integer.parseInt(sc.nextLine());
		int[] arr=new int[n];
		for(int i=0;i<n;i++)	
		{
			System.out.print("Enter element "+(i+1)+" : ");
			arr[i]=Integer.parseInt(sc.nextLine());
		}
		q.quickSort(arr,0,n-1);
		System.out.print("Sorted array : ");
		for(int i=0;i<n; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}