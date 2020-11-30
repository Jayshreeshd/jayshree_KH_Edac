package Assignment;
import java.util.*;
public class D1 {
	

	    int partition(int arr[], int lb, int ub)
	    {
	       int pivot=arr[ub];
	       int i=(lb-1);
	       
	       for(int j=lb; j<ub; j++)
	       {
	           if(arr[j] <= pivot)
	           {
	                i++;
	                int temp = arr[i];
	                arr[i]=arr[j];
	                arr[j]=temp;
	           }
	       }
	       
	        int temp = arr[i+1]; 
	        arr[i+1] = arr[ub]; 
	        arr[ub] = temp; 
	        
	       return i+1;
	    }
	    
	    
	    void sort(int arr[],int lb, int ub)
	    {
	       if(lb<ub)
	       {
	           int pi=partition(arr,lb,ub);
	           
	           sort(arr,lb,pi-1);
	           sort(arr,pi+1,ub);        
	       }
	    }
	    
	    void print(int arr[])
	    {
	        for(int i=0 ; i<arr.length ; ++i)
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
	        
//	        int arr[] = {10, 7, 8, 9, 1, 5};
	        
	       D1 obj=new D1();
	        
	        System.out.println("\nArray before Sorting: ");
	        obj.print(arr);
	        
	        obj.sort(arr, 0, arr.length-1);
	        
	        System.out.println("\nArray after Sorting: ");
	        obj.print(arr);
	    }
	}


