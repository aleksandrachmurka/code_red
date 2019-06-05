package shapes;

public class Circle extends Shape {

    public static final double PI = 3.14;

    int radius;


    public Circle(int x, int y, int radius) {
        super(x,y);
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return PI * radius * radius;
    }


    @Override
    public String toString() {
        return "Circle{" +
                "x=" + x +
                ", y=" + y +
                ", radius=" + radius +
                '}';
    }
}
