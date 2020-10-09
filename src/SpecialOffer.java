public class SpecialOffer {
    String productName;
    String OfferDescription;
    String TimeOffer;
    double discount;

    SpecialOffer(String pn, String of, String to, double d) {
        productName = pn;
        OfferDescription = of;
        TimeOffer = to;
        discount = d;
    }

    void show() {
        System.out.println(productName + ", " + OfferDescription + ", " + TimeOffer + ", " + discount);

    }
}
