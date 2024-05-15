import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        double radius = 3d;
        Figure circle = new Circle(radius);

        double baseSide = 10d;
        double side = 5d;
        double height = 8d;
        Figure parallelogram = new Parallelogram(baseSide, side, height);

        double sideA = 15d;
        double sideB = 10;
        Figure rectangle = new Rectangle(sideA, sideB);

        List<Figure> figures = new ArrayList<>(3);
        figures.add(circle);
        figures.add(parallelogram);
        figures.add(rectangle);

        for (Figure figure : figures) {
            System.out.println(figure.getType());
            System.out.println("Area: " + figure.getArea() + " units.");
            System.out.println("Perimeter: " + figure.getPerimeter() + " units.\n");
        }
    }
}

interface Figure {
    double getPerimeter();
    double getArea();
    String getType();
}

class Circle implements Figure {
    private final double radius;

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    public String getType() {
        return this.getClass().toString();
    }
}

class Parallelogram implements Figure {
    private final double baseSide;
    private final double side;
    private final double height;

    public Parallelogram(double baseSide, double side, double height) {
        this.baseSide = baseSide;
        this.side = side;
        this.height = height;
    }

    public double getArea() {
        return this.baseSide * this.height;
    }

    public double getPerimeter() {
        return 2 * this.baseSide + 2 *  this.side;
    }

    public String getType() {
        return this.getClass().toString();
    }
}

class Rectangle implements Figure {
    private final double sideA;
    private final double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getArea() {
        return this.sideA * this.sideB;
    }

    public double getPerimeter() {
        return 2 * this.sideA + 2 * this.sideB;
    }

    public String getType() {
        return this.getClass().toString();
    }
}
