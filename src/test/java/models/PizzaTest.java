package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class PizzaTest {
    Pizza pizza = new Pizza();


    @Test
    public void setNameTest() {
        // given (1)
        String expected = "Cheese Pizza";

        // when (2)
        pizza = new Pizza();
        pizza.setName(expected);

        // then (3)

        assertEquals(expected, pizza.getName());
    }
    @Test
    public void setCheese() {
        // given (1)
        String expected = "mozzarella cheese";

        // when (2)
        pizza = new Pizza();
        pizza.setCheese(expected);

        // then (3)

        assertEquals(expected, pizza.getCheese());
    }


    @Test
    public void setSauce() {
            // given (1)
            String expected = "Tomato Sauce";

            // when (2)
            pizza = new Pizza();
            pizza.setSauce(expected);

            // then (3)

            assertEquals(expected, pizza.getSauce());
    }

    @Test
    public void setToppings() {
        // given (1)
        String expected = "Sausage";

        // when (2)
        pizza = new Pizza();
        pizza.setToppings(expected);

        // then (3)

        assertEquals(expected, pizza.getToppings());
    }


    @Test
    public void setQty() {
        // given (1)
        int expected = 5;

        // when (2)
        pizza = new Pizza();
        pizza.setQty(expected);

        // then (3)

        assertEquals(expected, pizza.getQty());
    }

    @Test
    public void setPrice() {
        // given (1)
        float expected = 5.00f;

        // when (2)
        pizza = new Pizza();
        pizza.setPrice(expected);

        // then (3)

        assertEquals(expected, pizza.getPrice());
    }

}