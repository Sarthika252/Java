package math_package;
public class Statistics
{
 public static long factorial(int n){
 if(n==0)
{ 
 return 1;
}
else
{
 return n*factorial(n-1);
}
}
public static int cube(int x)
{
 return x*x*x;
}
}