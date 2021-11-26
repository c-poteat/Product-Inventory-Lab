package models;

import org.junit.Assert;
import org.junit.Test;

public class BarFoodTest {
    BarFood barFood = new BarFood();

    @Test
    public void setQty() {
        // Given
        int expected = 2;

        //When
        barFood = new BarFood();
        barFood.setQty(expected);

        //Then
        Assert.assertEquals(expected, barFood.getQty());
    }

    @Test
    public void setPrice() {
        // Given
        float expected = 2.00F;

        //When
        barFood = new BarFood();
        barFood.setPrice(expected);

        //Then
        Assert.assertEquals(expected, barFood.getQty());
    }

    @Test
    public void getPrice() {
    }
}
