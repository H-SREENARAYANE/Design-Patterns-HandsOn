import java.util.*;

class Item {
    String name;

    Item(String name) {
        this.name = name;
    }
}

public class Product {
    public static void main(String[] args) {
        ArrayList<Item> products = new ArrayList<>();

        products.add(new Item("Laptop"));
        products.add(new Item("Mobile"));
        products.add(new Item("Mouse"));

        String search = "la";

        for (Item p : products) {
            if (p.name.toLowerCase().contains(search))
                System.out.println(p.name);
        }
    }
}