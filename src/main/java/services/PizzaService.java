package services;

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

    // read
    public int findPizza(int id) {
        // should take an int and return an object with that id, if exists
        return id;
    }
    // read all
    public Pizza[] findAll() {
        // should return a basic array copy of the ArrayList

        return new Pizza[0];
    }

    //delete
    public boolean delete(int id) {
        // should remove the object with this id from the ArrayList if exits and return true.
        // Otherwise return false
        return false;
    }
}
