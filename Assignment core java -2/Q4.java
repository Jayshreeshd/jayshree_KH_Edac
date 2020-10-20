import java.util.Scanner;
class Q4
{
public static void main(String args[])
{
int i,sum=0;
for(i=12;i<=102;i=i+10)
{
System.out.print(i);
if(i<102)
System.out.print("+");
sum = sum + i;
}
System.out.print("\n Sum is : " + sum);
}
}
