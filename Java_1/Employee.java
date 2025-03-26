import java.util.*;
public class Employee {

    private String firstName;

    private String lastName;

    private double monthlySalary;

   
public Employee(String f, String l, double m){

        firstName = f;

        lastName = l;

        if(m < 0){  

            monthlySalary =0;

        }

   else monthlySalary = m;

    }

  public String getFirstName() {

        return firstName;

    }

  public void setFirstName(String fname) {

        firstName = fname;
    }

    public String getLastName() {

        return lastName;

    }

public void setLastName(String lname) {

        lastName = lname;

    }

public double getMonthlySalary() {

        return monthlySalary;

    }

public void setMonthlySalary(double m) {

        if(m < 0){

            monthlySalary =0;

        }

else monthlySalary = m;

    }
 
    public static void main(String[] args){

        Scanner S = new Scanner(System.in);

        System.out.println("Enter the first name: ");

        String fname = S.next();

System.out.println("Enter the last name: ");

        String lname = S.next();

System.out.println("Enter the Salary: ");

        double sal = S.nextDouble();

        Employee e =new Employee(fname,lname ,sal );

System.out.println("The yearly salary of "+e.getFirstName()+" "+e.getLastName()+" :");

        System.out.println(e.getMonthlySalary()*12);

double newsalary=e.getMonthlySalary()*0.1+e.getMonthlySalary();

        e.setMonthlySalary(newsalary);

System.out.println("The new yearly salary of "+e.getFirstName()+" "+e.getLastName()+" :");

        System.out.println(e.getMonthlySalary()*12);

        e.getMonthlySalary();

    }

}
