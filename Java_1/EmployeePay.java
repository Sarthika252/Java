import employee.Emp;
public class EmployeePay {
public static void main(String[] args) {
Emp e = new Emp();
e.name = "Priya Patil";
e. empid = 10;
e. category = "Manager";
e.bpay = 70000;
e.calculateAllowances();e.calculateNetPay();
e.displayDetails();
}
}