import java.util.*;
 
public class Variable
{
// static variable
static int j = n();
 
// static block
static {
System.out.println("Inside the static block");
}
 
// static method
static int n() {
System.out.println("Inside Static Method");
return 20;
}
 
// static method(main !!)
public static void main(String[] args)
{
System.out.println("Value of j : "+j);
System.out.println("Inside main method");
}
}