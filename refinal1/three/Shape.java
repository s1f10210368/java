package refinal1.three;

public abstract class Shape {
    protected final double size;

    public Shape(double size){
        this.size = size;
    }

    public abstract double area();
}

// abstractは抽象メソッドの時につく