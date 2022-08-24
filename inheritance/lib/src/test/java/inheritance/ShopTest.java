package inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShopTest {
    @Test
    void toStringTest(){
        Shop sut = new Shop("mcBronalds", 3.1f, 1, "sucks");
        System.out.println(sut.toString());
        assertTrue(sut.toString().equals("mcBronalds has a 3.1 star rating with a price rating of 1 and it sucks"));
}
}
