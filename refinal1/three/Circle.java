package refinal1.three;

public class Circle extends Shape{
    public Circle(double size){
        super(size);
    }

    public double area(){
        return size * size * Math.PI;
    }
}
