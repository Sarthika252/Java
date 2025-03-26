class Employee {
private String name;
private String address;
private double salary;
private String jobTitle;
public Employee(String name, String address, double salary, String jobTitle) {
this.name = name;
this.address = address;
this.salary = salary;
this.jobTitle = jobTitle;
}
public String getName() {
return name;
}
public String getAddress() {
return address;
}
public double getSalary() {
return salary;
}
public String getJobTitle() {
return jobTitle;
}
public double calculateBonus() {
// Base implementation for bonus calculation (can be overridden in subclasses)
return salary * 0.05; // 5% of salary as a default bonus
}
public String generatePerformanceReport() {
// Base implementation for performance report (can be overridden in subclasses)
return "Performance report for " + name + ": Excellent";
}
public void manageProject() {
// Base implementation for managing projects (can be overridden in subclasses)
System.out.println(name + " is managing a project.");
}
}

class Manager extends Employee {
public Manager(String name, String address, double salary) {
super(name, address, salary, "Manager");
}
//Override
public double calculateBonus() {
return getSalary() * 0.1; // Managers get a higher bonus (10% of salary)
}
// Additional methods specific to Managers can be added here
}
class Developer extends Employee {
public Developer(String name, String address, double salary) {
super(name, address, salary, "Developer");
}
// Additional methods specific to Developers can be added here
}
class Programmer extends Employee {
public Programmer(String name, String address, double salary) {
super(name, address, salary, "Programmer");
}
// Additional methods specific to Programmers can be added here
}
public class Heirarchical {
public static void main(String[] args) {
Manager manager = new Manager("Diya Nale", "123 Main St", 80000);
Developer developer = new Developer("Riya Gurav", "456 Oak Ave", 60000);
Programmer programmer = new Programmer("Nick Sharma", "789 Pine Rd", 50000);
// Example usage:
System.out.println(manager.generatePerformanceReport());
System.out.println("Bonus for " + manager.getName() + ": Rs." +
manager.calculateBonus());
developer.manageProject();
System.out.println("Salary for " + programmer.getName() + ": Rs." +
programmer.getSalary());
}
}