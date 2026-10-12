package lab1.exercise2.game.inventory;

/**
 * Name and Surname: Enes ATICI
 * Student ID: 240444030
 * Date: 05.10.2026
 */
public class Inventory {

    private Item[] items;
    private int count;

    public Inventory() {
        items = new Item[10];
        count = 0;
    }

    /** Adds an item to the inventory. */
    public void addItem(Item item) {
        if (count < items.length) {
            items[count] = item;
            count++;
        } else {
            System.out.println("Inventory is full! Cannot add " + item.getName());
        }
    }


    public void displayAll() {
        System.out.println("--- Inventory Listing ---");
        for (int i = 0; i < count; i++) {
            System.out.printf("%-15s | %-8s | Stock: %d%n",
                    items[i].getName(),
                    items[i].getGenre(),
                    items[i].getStockCount());
        }
    }


    public void auditSerialCodes() {
        System.out.println("--- Serial Code Audit ---");
        for (int i = 0; i < count; i++) {
            // Inventory ve Item aynı pakette olduğu için package-private metoda erişebilir
            System.out.printf("%-15s -> %s%n", items[i].getName(), items[i].getSerialCode());
        }
    }
}