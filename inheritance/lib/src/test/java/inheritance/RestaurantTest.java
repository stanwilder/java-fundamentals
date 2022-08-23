package inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RestaurantTest {
    @Test
    void toStringTest(){
        Restaurant sut = new Restaurant("mcBronalds", 3.1f, 1);
        System.out.println(sut.toString());
        assertTrue(sut.toString().equals("mcBronalds has a 3.1 star rating with a price rating of 1"));
    }
}
