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
    public void setPriceTest() {
        // given (1)
        double expected = 2.0;

        // when (2)
        beer = new Beer();
        beer.setPrice(expected);

        // then (3)

        Assert.assertEquals(expected, beer.getPrice());
    }
}