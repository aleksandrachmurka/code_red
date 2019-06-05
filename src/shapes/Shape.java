package shapes;

//abstract - not to be instantiated, just a blueprint
public abstract class Shape {

    int x;
    int y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move(int moveX, int moveY ) {
        x = x + moveX;
        y = y + moveY;
    }

    //no implementation, we should be able to call it for every shape, but we are unable to define it here
    // abstract methods are only in abstract classes, enforces on children to implement it
    public abstract double getArea();
}
