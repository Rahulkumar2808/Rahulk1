import java.util.*;
public class Mainm
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
	    Scanner sc=new Scanner(System.in);
	    int input1=sc.nextInt();
	    int k=sc.nextInt();
	    for(int i=1;i<=input1;i++)
	    {
	       
	        for(int n=1;n<k+1;n++)
	        System.out.print(test(n)+" ");
	    }
	    
	   
	}
	static int gcd(int a,int b)
	{
	    if (a == 0)
          return b; 

       return gcd(b % a, a);
	}
	static int test(int n)
	{
        int  result = 1;
       for(int i=2;i<=n;i++)
       {
           if (gcd(i, n) == 1) 

             result+=1;
       }        

      return result;
      
	}
	
}