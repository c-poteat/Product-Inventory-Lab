package models;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BeerTest {
    Beer beer = new Beer();
    @Test
    public void setNameTest() {
        // given (1)
        String expected = "DogFish";

        // when (2)
        beer = new Beer();
        beer.setName(expected);

        // then (3)

        assertEquals(expected, beer.getName());
  }

    @Test
    public void setTypeTest() {
        // given (1)
        String expected = "IPA";

        // when (2)
        beer = new Beer();
        beer.setType(expected);

        // then (3)

        Assert.assertEquals(expected, beer.getType());
    }

    @Test
    public void setQuantityTest() {
        // given (1)
        int expected = 5;

        // when (2)
        beer = new Beer();
        beer.setQuantity(expected);

        // then (3)

        Assert.assertEquals(expected, beer.getQuantity());
    }
}