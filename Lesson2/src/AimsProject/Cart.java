package Lesson2;
import java.util.ArrayList;
public class Cart {
    private static final int MAX_NUMBERS_ORDERED = 20;
    private ArrayList<DigitalVideoDisc> itemsOrdered = new ArrayList<>();

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (itemsOrdered.size() + 1 > MAX_NUMBERS_ORDERED) {
            System.out.println("----<!> The cart is almost full!----");
        } else {
            itemsOrdered.add(disc);
            System.out.println("----The disc \"" + disc.getTitle() + "\" has been added!");
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        if (itemsOrdered.size() == 0) {
            System.out.println("----<!> The cart is empty!----");
        } else {
            boolean fl = itemsOrdered.remove(disc);
            if (fl) {
                System.out.println("----The disc \"" + disc.getTitle() + "\" has been removed!");
            } else {
                System.out.println("----<!> This disc does not exist in the cart!----");
            }
        }
    }
    public float totalCost() {
        float cost = 0;
        for (int i = 0; i < itemsOrdered.size(); i++) {
            cost += itemsOrdered.get(i).getCost();
        }
        return ((int) (cost * 100)) / 100f;
    }
}
