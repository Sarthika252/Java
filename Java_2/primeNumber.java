import java.util.*;
class primeNumber
{
public static void main (String args[])
{

int count=0;
Scanner sc=new Scanner(System.in);
System.out.print("Enter a number to check it is a prime number or not:");
int num=sc.nextInt();
for(int i=2;i<num;i++)
{
if(num%i==0)
{
count++;
break;
}
}
if(count==0)
{
System.out.println(num+" is a prime number");
}
else
{
System.out.println(num+" is not prime number");
}
}
}