package inheritance;

public class Restaurant extends Business {


    //    Constructor
    public Restaurant(String name, float stars, int price) {
        super(name, stars, price);
    }

    //    custom methods
    public String toString() {
        return (name + " has a " + stars + " star rating with a price rating of " + price);
    }

    public void addReview(Review newReview) {

    }
}
