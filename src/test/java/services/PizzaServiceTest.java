package services;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PizzaServiceTest {

    @Test
    public void getEmployeeSalary() {


    }

    @Test
    public void getEmployeeName() {
    }

    @Test
    public void setEmployeeName() {

        // given (1)
        String expected = "Charlie";

        // when (2)
        PizzaService pizzaService = new PizzaService();
        pizzaService.setEmployeeName(expected);

        // then (3)

        assertEquals(expected, pizzaService.getEmployeeName());
    }

    @Test
    public void setEmployeeSalary() {

        // given (1)
        float expected = 54565.00F;

        // when (2)
        BeerService beerService = new BeerService();
        beerService.setEmployeeSalary(expected);

        // then (3)

        assertEquals(expected, beerService.getEmployeeSalary(), 0.00);
    }

}