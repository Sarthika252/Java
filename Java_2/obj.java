import java.util.*;
class EO{
 public void check(int n)
{
   if(n%2==0)
    {
     System.out.println("Number is even.");
    }
   else
   {
    System.out.println("Number is odd.");
   }
}
}
 class obj{
  public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
  System.out.print("Enter a number: ");
   int n=sc.nextInt();
   EO even=new EO();
   even.check(n);
}
}