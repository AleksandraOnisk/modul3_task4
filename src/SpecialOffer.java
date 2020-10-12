public class SpecialOffer {
    Product name;
    String offerDescription;
    String timeOffer;
    double discount;

    SpecialOffer(Product pn, String of, String to, double d) {
        name = pn;
        offerDescription = of;
        timeOffer = to;
        discount = d;
    }

    void show() {
        System.out.println(name.name + ", " + offerDescription + ", " + timeOffer + ", " + discount);

    }
}
