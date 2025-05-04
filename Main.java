import java.util.Scanner;

// Interface Shape (Defines PI and area method)
interface Shape {
    double PI = Math.PI;
    double area();
}

// Interface Shape3D (Extends Shape and adds volume method)
interface Shape3D extends Shape {
    double volume();
}

// Class Cylinder (Implements Shape3D interface)
class Cylinder implements Shape3D {
    private double radius;
    private double height;

    // Method to get input from the user
    public void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        radius = sc.nextDouble();
        System.out.print("Enter height: ");
        height = sc.nextDouble();
    }

    // Implementing area() method from Shape interface
    @Override
    public double area() {
        return 2 * PI * radius * (radius + height);
    }

    // Implementing volume() method from Shape3D interface
    @Override
    public double volume() {
        return PI * radius * radius * height;
    }

    // Method to display results
    public void display() {
        System.out.println("Surface Area of Cylinder: " + area());
        System.out.println("Volume of Cylinder: " + volume());
    }
}

// Main class to run the program
public class Main {
    public static void main(String[] args) {
        Cylinder cyl = new Cylinder(); // Creating an object
        cyl.getData(); // Getting user input
        cyl.display(); // Showing area & volume
    }
}
