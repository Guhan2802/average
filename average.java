import java.io.*;
import java.util.*;
class average
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n,i,sum=0;
        float average;
        System.out.println("enter the no of elements");
        n=s.nextInt();
        int a[]=new int[n];
        System.out.println("enter the numbers");
        for(i=0;i<n;i++)
        {
        	a[i]=s.nextInt();
        	sum=sum+a[i];
        }
        	System.out.println("sum:"+sum);
        	average=sum/n;
        	System.out.println("average:"+average);
        
    }
}
