class Pat2
{
public static void main(String arg[])
	{
         
	for(int i=1;i<=9;i++)
		{
		for(int j=9;j>=i;j--)
		{
                 System.out.print(" ");
      		}
                for(int k=1;k<=i;k++)
                {
                System.out.print(k);
                System.out.print(" ");
		}
                System.out.println();
	}
}
}