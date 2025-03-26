import java.util.Scanner;
abstract class Shape{
float dim1,dim2;
abstract float area();
}
//Class Rectangle is inherited from class Shape
class Rectangle extends Shape{
float area(){
return (dim1*dim2);
}
}
//Class Triangle is inherited from class shape
class Triangle extends Shape{
//Method overriding
float area(){
return ((dim1*dim2)/2);
}
}
class Abstract{
public static void main(String[] args){
Scanner obj = new Scanner(System.in);
Rectangle r = new Rectangle();
System.out.println("Enter length of rectangle : ");
r.dim1 = obj.nextFloat();
System.out.println("Enter breadth of rectangle : ");r.dim2 = obj.nextFloat();
System.out.println("Area of a rectangle is "+r.area());
Triangle t = new Triangle();
System.out.println("Enter height of triangle : ");
t.dim1 = obj.nextFloat();
System.out.println("Enter base of triangle : ");
t.dim2 = obj.nextFloat();
System.out.println("Area of a triangle is "+t.area());
}
}