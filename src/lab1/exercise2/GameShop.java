package lab1.exercise2;

import lab1.exercise2.game.inventory.Item;
import lab1.exercise2.game.inventory.Inventory;

public class GameShop {
    public static void main(String[] args) {

        Inventory shop = new Inventory();

        // 3 adet Item nesnesi oluşturuluyor
        Item item1 = new Item("Galaxy Racer", "Racing", 12, "GR-4421");
        Item item2 = new Item("Shadow Realm", "RPG", 5, "SR-8873");
        Item item3 = new Item("Pixel Legends", "Strategy", 3, "PL-0091");

        shop.addItem(item1);
        shop.addItem(item2);
        shop.addItem(item3);

        // İlk envanter listesi
        shop.displayAll();

        System.out.println();

        // Satış işlemleri
        item1.sell(4);
        item2.sell(6); // Stok yetersiz olduğu için uyarı verecek

        System.out.println();

        // Güncellenmiş stok listesi
        shop.displayAll();

        System.out.println();

        // Seri numarası denetimi
        shop.auditSerialCodes();

        // System.out.println(item1.getSerialCode());
        // WHY does this fail?
        // AÇIKLAMA: getSerialCode() metodu 'package-private' (varsayılan) erişim belirtecine sahiptir.
        // Yalnızca tanımlandığı 'game.inventory' paketi içerisinden erişilebilir.
        // GameShop sınıfı bu paketin dışında olduğu için bu metoda doğrudan erişemez.
    }
}