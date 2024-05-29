public class Parallelogram implements Figure {
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