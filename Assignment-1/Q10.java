import java.util.Scanner;

class Q10
{
public static void main(String args[])
{
double cel, fah;
Scanner s = new Scanner(System.in);
System.out.print("Enter temperature in Fahrenheit:");
fah = s.nextDouble();
cel = 5*(fah-32)/9;
System.out.println("Temperature in Celsius:"+cel);        
  
}
}
