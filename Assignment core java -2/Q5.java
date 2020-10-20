import java.util.Scanner;
class Q5
{
public static void main(String[] args) 
{

int small = 22 , large = 100;

while (small < large)
{
boolean flag = false;     
for(int i = 2; i <= small/2; ++i)  
if(small % i == 0) 
{
flag = true;
break;
}
} 
 
if ( !flag && small != 0 && small != 1)
System.out.print(small + " ");
++small;
}
}
