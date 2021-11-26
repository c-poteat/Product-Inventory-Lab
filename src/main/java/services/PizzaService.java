package services;

import models.Pizza;

import java.util.ArrayList;

public class PizzaService {

    private static int nextId = 1; // (1)

    private ArrayList<Pizza> inventory = new ArrayList<>(); //  (2)
}
