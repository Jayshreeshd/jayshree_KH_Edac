import java.util.Scanner;

class Q11
{
public static void main(String args[])
{

Scanner sc =new Scanner(System.in);
System.out.println("Enter value of x :");
int x =sc.nextInt();
System.out.println("Enter value of y :");
int y =sc.nextInt();
sc.close();

 x = x ^ y;
 y = x ^ y; 
 x = x ^ y; 
 
System.out.println("After swap: x = " + x + ", y = " + y);
}
}