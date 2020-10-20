import java.util.Scanner;
class Q10
{
 public static void main(String args[])  
  {  
        int n, sumEven = 0, sumOdd = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in array:");
        n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++)
        {
            if(a[i] % 2 == 0)
            {
                sumEven = sumEven + a[i];
            }
              else
            {
                sumOdd = sumOdd + a[i];
            }
        }
        System.out.println("Sum of Even Numbers:"+sumEven);
        System.out.println("Sum of Odd Numbers:"+sumOdd);
    }
}