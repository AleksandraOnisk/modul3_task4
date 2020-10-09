public class Product {
    String category;
    String productName;
    String productDescription;
    double productPrice;

    Product(String cat, String pn, String pd, double pp) {
        category = cat;
        productName = pn;
        productDescription = pd;
        productPrice = pp;

    }

    void show() {
        System.out.println(category + ", " + productName + ", " + productDescription + ", " + productPrice);

    }
}
