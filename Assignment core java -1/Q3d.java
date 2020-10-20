class D
{
public static void main(String args[])
{
 boolean x = true;
 boolean y = false;
 boolean z = x && y || ! (x || y) ;

System.out.println(" x : " + x);

System.out.println(" y : " + y);

System.out.println(" z : " + z);
}
}