package shapes;

public class Square extends Shape {

    private int length;


    public Square(int x, int y, int length) {
        super(x,y);
        this.length = length;
    }

    public void setLength(int newLength) {
        if(newLength > 0) {
            length = newLength;
        }
        throw new IllegalArgumentException("You cannot pass negative length");
    }

    @Override
    public double getArea(){
        return length * length;
    }

    @Override
    public String toString() {
        return "Square{" +
                "x=" + x +
                ", y=" + y +
                ", length=" + length +
                '}';
    }
}
