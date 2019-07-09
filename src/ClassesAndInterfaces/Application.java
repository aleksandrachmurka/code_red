package ClassesAndInterfaces;

public class Application {

    public static void main(String[] args) {
        Box myBox = new Box();
        Pen cheapPen = new Pen(1);
        Pen expensivePen = new Pen(10);

        Book cheapBook = new Book(5);
        Book expensiveBook = new Book(75);

        Notebook cheapNotebook = new Notebook(5, "Jola", 33);
        Notebook expensiveNotebook = new Notebook(66, "Eleonora", 66);

        myBox.addItem(cheapPen);
        myBox.addItem(expensivePen);
        myBox.addItem(cheapBook);
        myBox.addItem(expensiveBook);
        myBox.addItem(cheapNotebook);
        myBox.addItem(expensiveNotebook);

        System.out.println("Cheap book is inside the box" + myBox.hasItem(cheapBook));
        System.out.println("Total value of items in the box: " + myBox.getPrice());
        myBox.printContent();
        System.out.println( "Most expensive item is " + myBox.getMostExpensiveItem());
        myBox.removeCheapestItem();
        myBox.printContent();
        myBox.empty();
    }
}


