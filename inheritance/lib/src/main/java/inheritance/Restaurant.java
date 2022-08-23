package inheritance;

import java.util.ArrayList;

public class Restaurant {

// Properties
    private String name;
    private ArrayList<Review> allReviews;
    float stars;
    public int price;

//    Constructor
    public Restaurant(String name, float stars, int price) {
        this.name = name;
        this.stars = stars;
        this.price = price;
    }

//    custom methods
public String toString(){
        return (name + " has a " + stars + " star rating with a price rating of " + price);
}

public void addReview(Review newReview){

}


// getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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
}

