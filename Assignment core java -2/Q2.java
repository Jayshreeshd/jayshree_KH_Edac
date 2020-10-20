import java.util.Scanner;
class Q2
{
public static void main(String args[])
{
int reverse = 0;
Scanner sc = new Scanner (System.in);
System.out.println("Enter number:");
int num = sc.nextInt();

while(num != 0)
 {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }
  System.out.println("Number is reverse" + reverse);
}
}
