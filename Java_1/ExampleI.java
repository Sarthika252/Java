interface Sports {
void set(int marks);
}
class Student {
private int rollNo;
public Student(int rollNo) {
this.rollNo = rollNo;
}
public int getRollNo() {
return rollNo;
}
public void setRollNo(int rollNo) {
this.rollNo = rollNo;
}
}
class Test extends Student {
private int sub1;
private int sub2;
public Test(int rollNo, int sub1, int sub2) {
super(rollNo);
this.sub1 = sub1;
this.sub2 = sub2;
}
public int[] getMarks() {
return new int[]{sub1, sub2};
}public void setMarks(int sub1, int sub2) {
this.sub1 = sub1;
this.sub2 = sub2;
}
}
class Result extends Test implements Sports {
private int sportsMarks;
public Result(int rollNo, int sub1, int sub2, int sportsMarks) {
super(rollNo, sub1, sub2);
this.sportsMarks = sportsMarks;
}

public void set(int marks) {
sportsMarks = marks;
}
public void display() {
System.out.println("Roll Number: " + getRollNo());
int[] marks = getMarks();
System.out.println("Subject 1 Marks: " + marks[0]);
System.out.println("Subject 2 Marks: " + marks[1]);
System.out.println("Sports Marks: " + sportsMarks);
}
}
class ExampleI{
public static void main(String[] args) {
Result result = new Result(42, 90, 95, 70);result.display();
result.set(95);
System.out.println("\nAfter updating sports marks:");
result.display();
}
}