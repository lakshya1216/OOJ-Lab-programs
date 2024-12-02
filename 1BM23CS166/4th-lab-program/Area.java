import java.util.Scanner;
abstract class Shape {
    int dimension1;
    int dimension2; 

    public Shape(int dimension1, int dimension2) {
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
    }

    abstract void printArea();
}

class Rectangle extends Shape {
    public Rectangle(int width, int height) {
        super(width, height);
    }
    void printArea() {
        int area = dimension1 * dimension2;
        System.out.println("Area of Rectangle: " + area);
    }
}

class Triangle extends Shape {
    public Triangle(int base, int height) {
        super(base, height);
    }

    void printArea() {
        double area = 0.5 * dimension1 * dimension2;
        System.out.println("Area of Triangle: " + area);
    }
}

class Circle extends Shape {
    public Circle(int radius) {
        super(radius, 0);
    }

    void printArea() {
        double area = 3.14 * dimension1 * dimension1;
        System.out.println("Area of Circle: " + area);
    }
}

public class Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter width of Rectangle: ");
        int rectWidth = scanner.nextInt();
        System.out.print("Enter height of Rectangle: ");
        int rectHeight = scanner.nextInt();
        Shape rectangle = new Rectangle(rectWidth, rectHeight);
        rectangle.printArea();

        System.out.print("Enter base of Triangle: ");
        int triBase = scanner.nextInt();
        System.out.print("Enter height of Triangle: ");
        int triHeight = scanner.nextInt();
        Shape triangle = new Triangle(triBase, triHeight);
        triangle.printArea();

        System.out.print("Enter radius of Circle: ");
        int circleRadius = scanner.nextInt();
        Shape circle = new Circle(circleRadius);
        circle.printArea();

	System.out.println("Lakshya Khandelwal");
	System.out.println("1BM23CS166");

        scanner.close();
    }
}
