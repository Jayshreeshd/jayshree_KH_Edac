import java.lang.Math; 
class Q3
{
static void printArr(int arr[], int n) 
{ 
    for (int i = 0; i < n; i++) 
        System.out.print(arr[i] + " "); 
} 
  
static void updateArr(int arr[], int n) 
{ 
    for (int i = 0; i < n; i++) 
    { 
            if ((i + 1) % 2 == 0) 
            arr[i] = (int)Math.pow(arr[i], 2); 
  
        
        else
            arr[i] = (int)Math.pow(arr[i], 3); 
    } 
     printArr(arr, n); 
} 
  
public static void main(String[] args) 
{ 
    int arr[] = { 1,2,3,4,5 }; 
    int n = arr.length; 
  
    updateArr(arr, n); 
} 
} 