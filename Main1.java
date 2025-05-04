import java.util.Scanner; // Import Scanner for user input

// Base class: Person
class Person {
    int id; // Unique identifier for person
    String name; // Name of person
    
    // Method to get user input for Person details
    void getPerson() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID: ");
        id = sc.nextInt();
        sc.nextLine(); // Consume newline character
        System.out.print("Enter Name: ");
        name = sc.nextLine();
    }
    
    // Method to display Person details
    void showPerson() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

// Subclass: Employee (inherits from Person)
class Employee extends Person {
    double salary; // Employee salary
    
    // Method to get user input for Employee details
    void getEmployee() {
        super.getPerson(); // Call getPerson() from Person class
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Salary: ");
        salary = sc.nextDouble();
    }
    
    // Method to display Employee details
    void showEmployee() {
        super.showPerson(); // Call showPerson() from Person class
        System.out.println("Salary: " + salary);
    }
}

// Subclass: Typist (inherits from Employee)
class Typist extends Employee {
    int typespeed; // Typing speed in words per minute
    
    // Method to get user input for Typist details
    void getTypist() {
        super.getEmployee(); // Call getEmployee() from Employee class
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Typing Speed (words per minute): ");
        typespeed = sc.nextInt();
    }
    
    // Method to display Typist details
    void showTypist() {
        super.showEmployee(); // Call showEmployee() from Employee class
        System.out.println("Typing Speed: " + typespeed + " WPM");
    }
}

// Main class to execute the program
public class Main {
    public static void main(String[] args) {
        Typist t1 = new Typist(); // Create first Typist object
        Typist t2 = new Typist(); // Create second Typist object

        // Get details for first Typist
        System.out.println("\nEnter details for Typist 1:");
        t1.getTypist();
        
        // Get details for second Typist
        System.out.println("\nEnter details for Typist 2:");
        t2.getTypist();

        // Display details for first Typist
        System.out.println("\nDetails of Typist 1:");
        t1.showTypist();

        // Display details for second Typist
        System.out.println("\nDetails of Typist 2:");
        t2.showTypist();
    }
}
