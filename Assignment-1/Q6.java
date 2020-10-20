import java.util.Scanner;

class Q6
{
public static void main(String args[])
{
double pi = 3.14, area;

Scanner sc =new Scanner(System.in);

System.out.println("Enter Radius:");

int R =sc.nextInt();

sc.close();

area = pi * R * R;

System.out.println("Area:" + area);
}
}
