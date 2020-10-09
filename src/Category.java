public class Category {
    String category;
    String categoryDescription;

    Category(String c, String cd) {
        category = c;
        categoryDescription = cd;

    }

    void show() {
        System.out.println(category + ", " + categoryDescription);
    }

}
