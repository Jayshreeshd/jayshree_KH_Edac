class C
{
public static void main(String args[])
{
 int x = 10;
 int y = 20;
 int z = x++ - --y - --x + x++ ;

System.out.println(" x : " + x);

System.out.println(" y : " + y);

System.out.println(" z : " + z);
}
}