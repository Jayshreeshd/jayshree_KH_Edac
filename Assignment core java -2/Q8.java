import java.util.Scanner;
public class Q8
{ 
public static void main(String args[])
   {
	int counter, i=0, j=0, temp;
	int number[] = new int[100];
	Scanner sc = new Scanner(System.in);
	System.out.print("How many elements you want to enter: ");
	counter = sc.nextInt();
        for(i=0; i<counter; i++)
	{
	    System.out.print("Enter Array Element"+(i+1)+": ");
	    number[i] = sc.nextInt();
	}
        j = i - 1;     
	i = 0;         
	sc.close();
	while(i<j)
	{
  	   temp = number[i];
	   number[i] = number[j];
	   number[j] = temp;
	   i++;
	   j--;
	}

	System.out.print("Reversed array: ");
	for(i=0; i<counter; i++)
	{
	   System.out.print(number[i]+ "  ");
	}       
   }
}