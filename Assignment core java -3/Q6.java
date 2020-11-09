class Q6
{
public static void main(String []args) 
{ 
int arr[] = {24,54,31,16,82,45,67};
int n = arr.length; 
thirdLargest(arr, n); 
} 
 

static void thirdLargest(int arr[],int arr_size) 
{ 
    
    if (arr_size < 3) 
    { 
        System.out.printf(" Invalid Input "); 
        return; 
    } 
    int first = arr[0]; 
    for (int i = 1; i < arr_size ; i++) 
        if (arr[i] > first) 
            first = arr[i]; 
  
int second = Integer.MIN_VALUE; 
for (int i = 0;i < arr_size ; i++) 
if (arr[i] > second && arr[i] < first) 
            second = arr[i]; 
  
int third = Integer.MIN_VALUE; 
for (int i = 0; i < arr_size ; i++) 
if (arr[i] > third && arr[i] < second) 
third = arr[i]; 
  
System.out.printf("The third Largest " + "element is %d\n", third); 
} 
}  


















