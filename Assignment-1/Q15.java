import java.util.Scanner;
class Q15
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter gender 'm' for Male or 'f' for Female: ");
char ch = sc.next().charAt(0); 
System.out.println("Age:");
int age = sc.nextInt();

if(age >= 21)
{

System.out.println("Male or female both are eligible for marriage ");
}
else if (age >= 18)
{

System.out.println(" Female is eligible for marriage ");
}
else
{

System.out.println(" Age is not valid for marriage ");
}
}
}

 