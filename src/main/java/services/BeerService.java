package services;

import models.Beer;

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
}




