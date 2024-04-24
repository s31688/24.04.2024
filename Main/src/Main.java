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

interface figurable {
    double getPerimeter();

    double getArea();
}

abstract class Figure implements figurable {
    private double perimeter;
    private double area;

    public Figure() {

    }

    public double getPerimeter() {
        return perimeter;
    }

    public double getArea() {
        return area;
    }

    public String getType() {
        return null;
    }
}

class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 3.14 * Math.pow(this.radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * 3.14 * this.radius;
    }

    @Override
    public String getType() {
        return this.getClass().toString();
    }
}

class Parallelogram extends Figure {
    private double baseSide;
    private double side;
    private double height;

    public Parallelogram(double baseSide, double side, double height) {
        this.baseSide = baseSide;
        this.side = side;
        this.height = height;
    }

    @Override
    public double getArea() {
        return this.baseSide * this.height;
    }

    @Override
    public double getPerimeter() {
        return 2 * this.baseSide + 2 *  this.side;
    }

    @Override
    public String getType() {
        return this.getClass().toString();
    }
}

class Rectangle extends Figure {
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return this.sideA * this.sideB;
    }

    @Override
    public double getPerimeter() {
        return 2 * this.sideA + 2 * this.sideB;
    }

    @Override
    public String getType() {
        return this.getClass().toString();
    }
}
