package inheritance;

public class Shop extends Business {
    public Shop(String name, float stars, int price, String description) {
        super(name, stars, price);
        this.description = description;
    }

    private String description;

}
