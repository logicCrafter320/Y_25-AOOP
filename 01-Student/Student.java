// 1. Create three Student objects and display their details.
public class Student {
    private int studentId;
    private String name;
    private int age;

    public Student(int studentId, String name, int age) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name      : " + name);
        System.out.println("Age       : " + age);
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        Student student1 = new Student(101, "Arun", 19);
        Student student2 = new Student(102, "Bala", 20);
        Student student3 = new Student(103, "Charan", 18);

        student1.displayDetails();
        student2.displayDetails();
        student3.displayDetails();
    }
}
