import java.util.Scanner;

class Q7
{
    public static void main(String args[])
    {
         int eng, phy, chem, math, bio; 
         double total, average, percentage;
        Scanner op=new Scanner(System.in);
        
        System.out.println("Enter marks of five subjects:");
        System.out.print("Enter marks of English subjects:");
        eng=op.nextInt();
        System.out.print("Enter marks of physics subjects:");
        phy=op.nextInt();
        System.out.print("Enter marks of chemistry subjects:");
        chem=op.nextInt();
        System.out.print("Enter marks of maths subjects:");
        math=op.nextInt();
        System.out.print("Enter marks of bio subjects:");
        bio=op.nextInt();
    
        
        total = eng + phy + chem + math + bio;
        average = (total / 5.0);
        percentage = (total / 500.0) * 100;
    
       
        System.out.println("Total marks ="+total);
        System.out.println("Average marks = "+average);
        System.out.println("Percentage = "+percentage);
    
       }
    }
    
