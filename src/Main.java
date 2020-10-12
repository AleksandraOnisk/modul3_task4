public class Main {
    public static void main(String[] args) {
        Category cat1 = new Category("Słodycze", "Coś słodkiego dla każdego");

        Product prod1 = new Product(cat1.category, "Czekolada Milka", "Mleczny smak czekolady", 5.49);
        prod1.show();
        Product prod2 = new Product(cat1.category, "Czekolada Wedel", "Gorzki kakaowy smak", 6.29);
        prod2.show();

        Category cat2 = new Category("Napoje gazowane", "Coca-cola dla każdego");

        Product prod3 = new Product(cat2.category, "Coca-cola light", "dietetyczny napój na słodziku", 5.99);
        prod3.show();
        Product prod4 = new Product("brak", "Chipsy ziemniaczane", "Smak solony", 4.99);
        prod4.show();

        SpecialOffer offer1 = new SpecialOffer(prod2.name, "Rabat na gorzkie czekolady", "od 5.10.2010 do 10.10.2020", 0.2);
        offer1.show();

    }
}
