// 2. Initialize employee details using a parameterized constructor.
public class Employee {
    private int employeeId;
    private String name;
    private double salary;

    public Employee(int employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name       : " + name);
        System.out.printf("Salary     : %.2f%n", salary);
    }

    public static void main(String[] args) {
        Employee employee = new Employee(501, "Kiran", 45000.00);
        employee.displayDetails();
    }
}
