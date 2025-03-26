package employee;
public class Emp {
public String name;
public int empid;
public String category;
public double bpay;
public double hra;
public double da;
public double npay;
public double pf;
public double grosspay;
public double incometax;
public double allowance;
public void calculateAllowances() {
da = 0.05 * bpay;
hra = 0.09 * bpay;
allowance = 0.1 * bpay;
}
public void calculateNetPay() {
npay = bpay + da + hra + allowance;
pf = 0.11 * bpay;
grosspay = npay - pf;
incometax = 0.1 * grosspay;}
public void displayDetails() {
System.out.println("Employee Name: " + name);
System.out.println("Employee ID: " + empid);
System.out.println("Category: " + category);
System.out.println("Basic Pay: Rs" + bpay);
System.out.println("Dearness Allowance (DA): Rs" + da);
System.out.println("House Rent Allowance (HRA): Rs" + hra);
System.out.println("Allowance: Rs" + allowance);
System.out.println("Net Pay: Rs" + npy);
System.out.println("Provident Fund (PF): Rs" + pf);
System.out.println("Gross Pay: Rs" + grosspay);
System.out.println("Income Tax: Rs" + incometax);
}}