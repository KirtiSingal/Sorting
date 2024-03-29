import java.util.*;
class MergeSort{
	void merge(int[] arr,int l,int m,int r)
	{
		int n1=(m+1-l);
		int n2=(r-m);
		int[] L= new int[n1];
		int[] R= new int[n2];
		for(int i=0;i<n1;i++)
		{
			L[i]=arr[l+i];
		}
		for(int j=0;j<n2;j++)
		{
			R[j]=arr[m+j+1];
		}
		int i=0,j=0,k=l;
		while(i<n1&&j<n2)
		{
			if(L[i]<=R[j])
			{
				arr[k]=L[i];
				i++;
			}
			else
			{
				arr[k]=R[j];
				j++;
			}
			k++;
		}	
		while(i<n1)
		{
			arr[k]=L[i];
			i++;
			k++;
		}	
		while(j<n2)
		{
			arr[k]=R[j];
			j++;		
			k++;
		}
	}
	void sort(int[] arr,int l,int r)
	{
		if(l<r){
		int m=(l+r)/2;
		sort(arr,l,m);
		sort(arr,m+1,r);
		merge(arr,l,m,r);
		}	
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		MergeSort m = new MergeSort();
		System.out.println("Enter the number of elements : ");
		int n = Integer.parseInt(sc.nextLine());
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter element "+(i+1)+" : ");
			arr[i]=Integer.parseInt(sc.nextLine());
		}	
		m.sort(arr,0,n-1);
		System.out.println("Sorted array : ");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+"  ");
		}	
	}
}