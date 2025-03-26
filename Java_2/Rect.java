import java.util.*;
class Area{
int length,breadth;
public void setDim(int l,int b)
{
 length=l;
 breadth=b;
}
public int getArea()
{
 int result=length*breadth;
 return result;

}
}
class Rect{
public static void main(String []args)
{
 int l,b;
 Scanner s=new Scanner(System.in);
 System.out.println("Enter length:");
 l=s.nextInt();
 System.out.println("Enter breadth:");
 b=s.nextInt();
 Area a = new Area();
a.setDim(l,b);
System.out.println("Area of rectangle is "+a.getArea());
}
}
