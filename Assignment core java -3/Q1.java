import java.util.Arrays;

class Q1
{
public static void main(String args[])
{
int array1[] = {23,60,94,3,102};
int array2[] = {42,16,74};
int res[] = new int[ array1.length + array2.length];
int count = 0;
      for(int i = 0; i < array1.length; i++)
      { 
         res[i] = array1[i];
         count++;
      } 
      for(int j = 0; j < array2.length;j++)
      { 
         res[count++] = array2[j];
      } 
      for(int i = 0;i < res.length;i++) 
    	  System.out.print(res[i]+" ");
   } 
}

