import java.util.Random;

abstract class Shape {
    abstract double area();
    abstract double perimeter();
    abstract String getName();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }

    double perimeter() {
        return 2 * Math.PI * radius;
    }

    String getName() {
        return "Circle";
    }
}

class Rectangle extends Shape {
    double width, height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    double area() {
        return width * height;
    }

    double perimeter() {
        return 2 * (width + height);
    }

    String getName() {
        return "Rectangle";
    }
}

class Triangle extends Shape {
    double a, b, c;

    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double area() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    double perimeter() {
        return a + b + c;
    }

    String getName() {
        return "Triangle";
    }
}

public class RandomShapeCalculator {
    public static void main(String[] args) {
        Random random = new Random();
        Shape shape;

        int choice = random.nextInt(3); 

        switch (choice) {
            case 0:
                double radius = 1 + random.nextDouble() * 10;
                shape = new Circle(radius);
                break;
            case 1:
                double width = 1 + random.nextDouble() * 10;
                double height = 1 + random.nextDouble() * 10;
                shape = new Rectangle(width, height);
                break;
            default:
                double a = 3 + random.nextDouble() * 5;
                double b = 3 + random.nextDouble() * 5;
                double c = 3 + random.nextDouble() * 5;
     
                while (a + b <= c || a + c <= b || b + c <= a) {
                    a = 3 + random.nextDouble() * 5;
                    b = 3 + random.nextDouble() * 5;
                    c = 3 + random.nextDouble() * 5;
                }
                shape = new Triangle(a, b, c);
        }

        System.out.printf("Shape: %s\n", shape.getName());
        System.out.printf("Area: %.2f\n", shape.area());
        System.out.printf("Perimeter: %.2f\n", shape.perimeter());
    }
}
