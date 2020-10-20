import java.util.Scanner;
class Q3
{
public static void main(String args[])
{
int n;
boolean b=true;
Scanner sc = new Scanner (System.in);
System.out.println("Enter number:");
int num = sc.nextInt();


for(int i=2;i<=num/2;i++)
{
n = num % i;
if(n == 0)
{
b = false;
break;
 }
 }
if(b)
System.out.println(num + " is a Prime Number");
else
System.out.println(num + " is not a Prime Number");
   }
}