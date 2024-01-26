package three;

public abstract class Shape {
    protected final double size;
    public Shape(double size) {
        this.size = size;
    }

    public abstract double area();
}
