package inheritance;

import java.util.ArrayList;
import java.util.HashSet;

public abstract class Business {
    public String name;
    public HashSet <Review> allReviews;
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

public String parentString() {
        return (name + " " + price + " " + stars);
    }


    //    Help from Raul
    public Business(String name, float stars, int price) {
        this.name = name;
//        this.allReviews = new HashSet<Review>();
        this.stars = stars;
        this.price = price;
    }
}
