package ClassesAndInterfaces;

import java.util.ArrayList;

public class Box implements Item {
    private ArrayList<Item> items =  new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public double getPrice(){
        double totalValue = 0;
        for(Item item : items) {
            totalValue += item.getPrice();
        }
        return totalValue;
    }

    public Item getMostExpensiveItem() {
        Item mostExpensiveItem = items.get(0);

        for (Item item : items) {
            if (item.getPrice() > mostExpensiveItem.getPrice()) {
                mostExpensiveItem = item;
            }
        }

        return mostExpensiveItem;
    }

    public void removeCheapestItem() {
        Item cheapestItem = items.get(0);

        for (Item item : items) {
            if (item.getPrice() < cheapestItem.getPrice()) {
                cheapestItem = item;
            }
        }

        items.remove(cheapestItem);
    }

    public int empty() {
        int itemCount = items.size();
        items.clear();
        return itemCount;
    }

    public boolean hasItem(Item item) {
        return items.contains(item);
    }

    public void printContent() {
        System.out.println(items);
    }
}