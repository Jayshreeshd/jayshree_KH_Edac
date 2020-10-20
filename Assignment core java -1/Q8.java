import java.util.Scanner;

class Q8
{
public static void main(String args[])
{
float P,R,T,SimpleInterest;

Scanner sc =new Scanner(System.in);
System.out.println("Enter Principal Amount:");
P = sc.nextInt();
System.out.println("Enter Rate of Interest:");
R = sc.nextInt();
System.out.println("Enter Time:");
T = sc.nextInt();
sc.close();

SimpleInterest = (P × R × T)/100;
    
System.out.println("Principal =" + P);
System.out.println("Rate = " + R);
System.out.println("Time = " + T);

}
}

