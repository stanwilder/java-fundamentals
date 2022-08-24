package inheritance;

import java.util.ArrayList;

public abstract class Business {
    public String name;
    public ArrayList <Review> allReviews;
    public float stars;

    public float getStars() {
        return stars;
    }

    public void setStars(float stars) {
        this.stars = stars;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int price;
//    constructor

    public Business(String name, float stars, int price) {
        this.name = name;
        this.allReviews = new ArrayList<Review>();
        this.stars = stars;
        this.price = price;
    }

public String toString() {
        return (name + " " + price + " " + stars);
    }

}
