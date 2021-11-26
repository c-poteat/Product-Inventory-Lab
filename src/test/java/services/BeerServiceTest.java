package services;

import models.Beer;
import org.junit.Assert;
import org.junit.Test;

public class BeerServiceTest {

 @Test
    public void createTest() {
    // (1)
    String expectedName = "DogFish";
    float expectedPrice = 4.00f;
    int expectedQty = 5;
    String expectedType = "IPA";

    // (2)
    BeerService beerService = new BeerService();
    Beer testBeer = beerService.create(expectedName,expectedPrice,expectedQty,expectedType);

    // (3)
     int actualId = testBeer.getId();
     String actualName = testBeer.getName();
     float actualPrice = (float) testBeer.getPrice();
     int actualQty = testBeer.getQuantity();
     String actualType = testBeer.getType();

     // (4)
     Assert.assertEquals(Integer.class.getName(), new Integer(actualId).getClass().getName());
    Assert.assertEquals(expectedName, actualName);
    Assert.assertEquals(expectedPrice, actualPrice, 0.001);
    Assert.assertEquals(expectedQty, actualQty);
    Assert.assertEquals(expectedType, actualType);

  }
}