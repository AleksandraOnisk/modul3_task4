public class Product {
    String category;
    String name;
    String description;
    double price;

    Product(String cat, String pn, String pd, double pp) {
        category = cat;
        name = pn;
        description = pd;
        price = pp;
    }

    void show() {
        System.out.println(category + ", " + name + ", " + description + ", " + price);

    }
}
