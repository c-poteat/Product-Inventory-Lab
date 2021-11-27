package services;

import models.Beer;
import models.Pizza;

import java.util.ArrayList;

public class PizzaService {

    private static int nextId = 1; // (1)

    private ArrayList<Pizza> inventory = new ArrayList<Pizza>(); //  (2)

    // (1)
    public Pizza create(int id, String name, String cheese, String toppings, int qty, float price) {
        // (2)
        Pizza createdPizza= new Pizza(nextId++, name, cheese, toppings, qty, price);
        // (3)
        inventory.add(createdPizza);
        // (4)
        return createdPizza;
    }
}
