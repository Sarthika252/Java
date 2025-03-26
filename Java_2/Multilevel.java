import java.util.Scanner;
class Student{
int rollno;
public void getr(int rollno){
this.rollno = rollno;
}
}
class Test extends Student{
int sub1;
int sub2;
public void getm(int sub1,int sub2){
this.sub1 = sub1;
this.sub2 = sub2;
}
}
class Result extends Test{
public void display(){
System.out.println("Your roll number is "+rollno);
System.out.println("Subject 1 Marks : "+sub1);
System.out.println("Subject 2 Marks : "+sub2);
System.out.println("Total Marks = "+(sub1+sub2));
}
}
class Multilevel{public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter roll number : ");
int roll_no = sc.nextInt();
System.out.println("Enter Subject 1 marks : ");
int s1 = sc.nextInt();
System.out.println("Enter Subject 2 marks : ");
int s2 = sc.nextInt();
Result r = new Result();
r.getr(roll_no);
r.getm(s1,s2);
r.display();
}
}