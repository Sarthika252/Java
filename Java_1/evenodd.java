import java.util.*;
class evenodd{
public static void main(String arr[])
{
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter a number:");
 int num=sc.nextInt();
 if(num%2 == 0)
  {
    System.out.println("The number is even.");
  }
 else
  {
    System.out.println("The number is odd.");
  }
}
}