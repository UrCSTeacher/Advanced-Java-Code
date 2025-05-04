import java.util.Scanner;

// Base class Employee
class Employee {
    int Eid;
    String Ename;
    double Salary;

    // Constructor for Employee
    Employee(int id, String name, double salary) {
        this.Eid = id;
        this.Ename = name;
        this.Salary = salary;
    }

    // Method to display details (will be overridden)
    void displayDetails() {
        System.out.println("Employee ID: " + Eid);
        System.out.println("Employee Name: " + Ename);
        System.out.println("Employee Salary: " + Salary);
    }
}

// Derived class Teacher (extends Employee)
class Teacher extends Employee {
    String Qualification;

    // Constructor for Teacher (calls Employee's constructor using super)
    Teacher(int id, String name, double salary, String qualification) {
        super(id, name, salary);  // Calls Employee constructor
        this.Qualification = qualification;
    }

    // Overriding displayDetails method
    @Override
    void displayDetails() {
        super.displayDetails(); // Call parent method first
        System.out.println("Teacher Qualification: " + Qualification);
    }
}

// Main class
public class TeacherDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Employee Salary: ");
        double salary = sc.nextDouble();
        sc.nextLine(); // Consume newline
        System.out.print("Enter Teacher Qualification: ");
        String qualification = sc.nextLine();

        // Creating object of Teacher with input values
        Teacher tea = new Teacher(id, name, salary, qualification);

        // Displaying details using overridden method
        System.out.println("\nTeacher Details:");
        tea.displayDetails();
        
        sc.close();
    }
}
