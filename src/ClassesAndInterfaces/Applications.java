package ClassesAndInterfaces;

public class Applications {

    public static void main(String[] args) {
        Box myBox = new Box();
        Pen cheapPen = new Pen(1);
        Pen expensivePen = new Pen(10);

        Book cheapBook = new Book(5);
        Book expensiveBook = new Book(75);

        myBox.addItem(cheapPen);
        myBox.addItem(expensivePen);
        myBox.addItem(cheapBook);
        myBox.addItem(expensiveBook);

        System.out.println("Cheap book is inside the box" + myBox.hasItem(cheapBook));


        System.out.println(myBox.getPrice());
        myBox.printContent();
        myBox.empty();
    }
}


