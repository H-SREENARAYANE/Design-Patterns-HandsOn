
class Product {
    int productId;
    String productName;
    String category;

    Product(int id, String name, String cat) {
        productId = id;
        productName = name;
        category = cat;
    }
}

public class EcommerceSearch {

    static int linearSearch(Product[] p, int key) {
        for (int i = 0; i < p.length; i++) {
            if (p[i].productId == key)
                return i;
        }
        return -1;
    }

    static int binarySearch(Product[] p, int key) {
        int low = 0, high = p.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (p[mid].productId == key)
                return mid;
            else if (key < p[mid].productId)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }

    public static void main(String args[]) {

        Product products[] = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Phone", "Electronics"),
                new Product(103, "Shoes", "Fashion"),
                new Product(104, "Watch", "Accessories"),
                new Product(105, "Bag", "Fashion")
        };

        int key = 104;

        int l = linearSearch(products, key);

        if (l != -1)
            System.out.println("Linear Search: Product Found - " + products[l].productName);
        else
            System.out.println("Product Not Found");

        int b = binarySearch(products, key);

        if (b != -1)
            System.out.println("Binary Search: Product Found - " + products[b].productName);
        else
            System.out.println("Product Not Found");
    }
}