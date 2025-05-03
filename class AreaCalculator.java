
class AreaCalculator {
    
    // Method to calculate area of a rectangle
    double area(double length, double width) {
        return length * width;
    }

    // Method to calculate area of a square
    double area(double side) {
        return side * side;
    }

    // Method to calculate area of a circle
    double area(float radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();

        // Example calculations
        System.out.println("Area of Rectangle: " + calculator.area(5.0, 3.0));
        System.out.println("Area of Square: " + calculator.area(4.0));
        System.out.println("Area of Circle: " + calculator.area(2.5f));
    }
}
