public class Product {
    Category category;
    String name;
    String description;
    double price;

    Product(Category cat, String pn, String pd, double pp) {
        category = cat;
        name = pn;
        description = pd;
        price = pp;
    }

    void show() {
        System.out.println(category.category + ", " + name + ", " + description + ", " + price);

    }
}
