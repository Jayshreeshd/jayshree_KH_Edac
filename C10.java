package Assignment;
import java.util.*;
public class C10 {
	void merge(int arr[], int lb, int mid, int ub)
    {
        int size1=mid-lb+1;
        int size2=ub-mid;
        
        int left[]=new int[size1];
        int right[]=new int[size2];
        
        for(int i=0;i<size1;i++)
            left[i]=arr[lb+i];
        
        for(int j=0;j<size2;j++)
            right[j]=arr[mid+1+j];
        
        int i=0, j=0;
        int k=lb;
        
        while(i<size1 && j<size2)
        {
            if(left[i]<=right[j])
            {
                arr[k]=left[i];
                i++;
            }
            else
            {
                arr[k]=right[j];
                j++;
            }
            k++;
        }
        
        while(i<size1)
        {
            arr[k]=left[i];
            i++;
            k++;
        }
        
        while(j<size2)
        {
            arr[k]=right[j];
            j++;
            k++;
        }
    }
    
    
    void sort(int arr[],int lb, int ub)
    {
        if(lb<ub)
        {
            int mid=(lb+ub)/2;
            
            sort(arr,lb,mid);
             System.out.println("sort of left side called");
            for(int k = lb;k <= mid;k++)
                System.out.print(arr[k]);
            System.out.println();
            
            sort(arr,mid+1,ub);
             System.out.println("sort of right side called");
             for(int k = mid+1;k <= ub;k++)
                System.out.print(arr[k]);
            System.out.println();
            
            merge(arr, lb, mid, ub);
             System.out.println("merge called");
             for(int k = lb;k < ub;k++)
                System.out.print(arr[k]);
            System.out.println();
        }
    }
    
    void print(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Array size: ");
        int size=scan.nextInt();
        
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            System.out.print("Enter element "+(i+1)+": ");
            arr[i]=scan.nextInt();
        }
        
       C10 obj=new C10();
        
        System.out.println("\nArray before Sorting: ");
        obj.print(arr);
        
        obj.sort(arr, 0, arr.length-1);
        
        System.out.println("\nArray after Sorting: ");
        obj.print(arr);
    }
}



