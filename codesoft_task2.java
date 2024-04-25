//STUDENT GRADE CALCULATOR

package codesoft_Tasks;
import java.util.Scanner;
public class codesoft_task2
{
  public static void main(String args[])
  {
    Scanner r=new Scanner(System.in);
    System.out.println("Enter The Number Of Subjects ");
    int n=r.nextInt();
    
    int a[]=new int[n];
    System.out.println("Enter The Marks Obtained In Each Subjects: ");
    for(int i=0;i<n;i++)
    {
        a[i]=r.nextInt();
    }
    int total=0;
    for(int i=0;i<n;i++)
    {
        total=total+a[i];
    }
    System.out.println("Total Marks Obtained :"+total);
    
    int avg=total/n;
    System.out.println("Average percentage Obtained :"+avg);
    
    System.out.print("Grade Obtained :");
    if(avg<=100 && avg>=90)
    {
        System.out.println("A+");
    }
    else if(avg<90 && avg>=80)
    {
        System.out.println("A");
    }
    else if(avg<80 && avg>=70)
    {
        System.out.println("B+");
    }
    else if(avg<70 && avg>=60)
    {
        System.out.println("B");
    }
    else if(avg<60 && avg>=40)
    {
        System.out.println("C");
    }
    else
    {
      System.out.println("Fail");
    }
  }
}
