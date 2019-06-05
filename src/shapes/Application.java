package shapes;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {

        Square mySquare = new Square(10, 20, 15);
        System.out.println(mySquare.toString());
        Circle myCircle = new Circle(20, 40, 5);
        System.out.println(myCircle.toString());
        System.out.println("Area of the circle is " + myCircle.getArea());
        System.out.println("Area of square is " + mySquare.getArea());
        mySquare.move(4, 2);
        System.out.println(mySquare.toString());
        myCircle.move(1,3);
        System.out.println(myCircle.toString());

        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(myCircle);
        shapes.add(mySquare);

        for (Shape shape : shapes) {
            shape.move(100, -100);
            //polymorphism in action
            System.out.println(shape + " has been moved");
            System.out.println("Shapes area: " + shape.getArea());
        }

    }
}
