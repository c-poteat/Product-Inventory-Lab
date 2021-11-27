package models;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BeerTest {
    Beer beer = new Beer(1, "DogFish", 4.00F, 5, "IPA");

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
    public void setIdTest() {
        // given (1)
        int expected = 1;

        // when (2)
        beer = new Beer();
        beer.setId(expected);

        // then (3)

        assertEquals(expected, beer.getId());
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

    @Test
    public void setPrice() {
        // given (1)
        float expected = 1.59f;

        // when (2)
        beer = new Beer();
        beer.setPrice(expected);

        // then (3)

        Assert.assertEquals(expected, beer.getPrice(), 0.00);
    }

    @Test
    public void constructorBeerTest() {
        //Expected
        int expectedId = 1;
        String expectedName = "DogFish";
        float expectedPrice = 4.00f;
        int expectedQty = 5;
        String expectedType = "IPA";

        //When
        Beer beerTest = new Beer(expectedId, expectedName, expectedPrice, expectedQty, expectedType);

        //Then
        Assert.assertEquals(expectedId, beerTest.getId());
        Assert.assertEquals(expectedName, beerTest.getName());
        Assert.assertEquals(expectedPrice, beerTest.getPrice(), 0.001);
        Assert.assertEquals(expectedQty, beerTest.getQuantity());
        Assert.assertEquals(expectedType, beerTest.getType());

    }
}