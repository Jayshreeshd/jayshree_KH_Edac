import java.util.Scanner;

class Q14
{
public static void main(String args[])
{
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any year:");
        int year = s.nextInt();
        boolean b = false;
        if(year % 400 == 0)
        {
            b = true;
        }
        else if (year % 100 == 0)
        {
            b = false;
        }
        else if(year % 4 == 0)
        {
            b = true;
        }
        else
        {
            b = false;
        }
        if(flag)
        {
            System.out.println("Year "+year+" is a Leap Year");
        }
        else
        {
            System.out.println("Year "+year+" is not a Leap Year");
        }
    }
}