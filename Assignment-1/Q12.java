import java.util.Scanner;

class Q12
{
public static void main(String args[])
{

float basic_salary,DA,DA1,HRA,HRA1,GrossPayment;

  Scanner sc=new Scanner(System.in);

  System.out.println("Enter Basic Salary Of Employee: ");
  basic_salary=sc.nextFloat();

  System.out.println("Enter Basic DA Of Employee: "); 
  DA1=sc.nextFloat();
 
  System.out.println("Enter Basic HRA Of Employee: ");
  HRA1=sc.nextFloat();

  DA = (DA1 * basic_salary) / 100;
  HRA = (HRA1 * basic_salary) / 100;

  GrossPayment = basic_salary + DA + HRA;

  System.out.println("Gross Salary Of Employee: "+GrossPayment);
  }
}
