package inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ReviewTest {
    @Test
    void toStringTest(){
        Review sut = new Review("It was mediocre", "broskie mcbro", 3);
        System.out.println(sut.toString());
        assertTrue(sut.toString().equals("broskie mcbro gave this restaurant a review of 3 stars"));
    }
}
