class Pat7
{  
public static void main(String[] args)  
{  
int rows=9;  
for (int i= 1; i<=9; i++)  
{  
for (int j=9; j<=i; j++)  
{  
System.out.print("   ");  
}  
for (int k=0; k<=rows-1-i; k++)  
{  
System.out.print(i + " ");  
}  
System.out.println(  );  
}  
}  
}  