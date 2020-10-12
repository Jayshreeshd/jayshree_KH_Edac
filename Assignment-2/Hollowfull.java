class Hollowfull
{
 public static void main(String args[])
{
 int i;
 int j;
 int k;
  for (i=1; i<= 6 ; i++)  
{  
for (j = i; j < 6 ; j++)   
{  
System.out.print(" ");  
}     
for (k = 1; k <= (2*i -1) ;k++)   
{  
if(k==1 || i == 6 || k==(2*i-1))   
{  
System.out.print("*");  
}  
else   
{  
System.out.print(" ");  
}  
}  
System.out.println("");  
}  
}
}