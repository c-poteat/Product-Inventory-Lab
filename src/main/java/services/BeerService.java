package services;

import models.Beer;
import models.Pizza;

import java.util.ArrayList;

public class BeerService {

    private static int nextId = 1; // (1)

    private ArrayList<Beer> BeerInventory = new ArrayList<>(); //  (2)

    // (1)
    public Beer create(int id, String name, float price, int quantity, String type) {
    // (2)
        Beer createdBeer = new Beer(nextId++, name, price, quantity, type);
    // (3)
        BeerInventory.add(createdBeer);
    // (4)
        return createdBeer;
    }

    // read
    public int findBeer(int id) {
        // should take an int and return an object with that id, if exists
        return id;
    }
    // read all
    public Beer[] findAll() {
        // should return a basic array copy of the ArrayList

        return new Beer[0];
    }

    //delete
    public boolean delete(int id) {
        // should remove the object with this id from the ArrayList if exits and return true.
        // Otherwise return false
        return false;
    }
}




