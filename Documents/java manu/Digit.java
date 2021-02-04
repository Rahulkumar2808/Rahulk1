//write a program to input a number from command line and find the numbers of digits and also find the sum of digits..

class Digit
{
public static void main(String args[])
{ int n,x,sum=0;
n=Integer.parseInt(args[0]);
while(n>0)
{
x=n%10;
count++;
sum=sum+x;
n=n/10;
}
System.out.println("total numbers of digits="+count);
System.out.println("sum of digits ="+sum);
}
}




 