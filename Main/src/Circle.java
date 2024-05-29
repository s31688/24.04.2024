public class Circle implements Figure {
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