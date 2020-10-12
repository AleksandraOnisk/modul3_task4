public class SpecialOffer {
    String productName;
    String offerDescription;
    String timeOffer;
    double discount;

    SpecialOffer(String pn, String of, String to, double d) {
        productName = pn;
        offerDescription = of;
        timeOffer = to;
        discount = d;
    }

    void show() {
        System.out.println(productName + ", " + offerDescription + ", " + timeOffer + ", " + discount);

    }
}
