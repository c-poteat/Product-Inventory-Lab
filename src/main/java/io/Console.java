package io;

import services.BeerService;
import services.PizzaService;

import java.io.PrintStream;
import java.util.Scanner;

public class Console {
    private final Scanner input;
    private final PrintStream output;
    private static final BeerService beerService = new BeerService();
    private static final PizzaService pizzaService = new PizzaService();

    public Console(Scanner input) {
        this.input = input;
        output = null;
    }

    public static void printWelcome() {
        System.out.println("" +
                "**************************************************\n" +
                "***           Welcome and Bienvenue            ***\n" +
                "***                    to                      ***\n" +
                "***          ZipCo Inventory Manager           ***\n" +
                "**************************************************\n");
    }

    public static void mainMenu() {
        System.out.println(
                "Select an option \n" +
                        "1. Add an item \n" +
                        "2. View inventory \n" +
                        "3. Update an item \n" +
                        "4. Delete an item \n" +
                        "5. Get reports on items \n" +
                        "6. Exit the program");

        String selection = System.console().readLine();
        switch (selection) {
            case "1":
                createMenu();
                break;
            case "2":

                break;
            case "3":

                break;
            case "4":

                break;
            case "5":

                break;
            case "6":

                break;
        }

    }

    public static void createMenu() {
        System.out.println(
                "Select an item to add\n" +
                        "1. Select Beer\n" +
                        "2. Select Pizza\n"
        );
        String selection = System.console().readLine();
        switch (selection) {
            case "1":
                createBeerMenu();
                break;
            case "2":
                break;
        }

    }
    public static void createBeerMenu() {
        System.out.println("What's the name of the beer?");
        String name = System.console().readLine();
        System.out.println("What is the price of the beer?");
        Float price = Float.parseFloat(System.console().readLine());
        System.out.println("How many do you want to add?");
        int quantity = Integer.parseInt(System.console().readLine());
        System.out.println("What is the type of beer?");
        String type = System.console().readLine();
        beerService.create(name, price, quantity, type);
        System.out.println("Item added successfully");
    }
}


//
//    Create the services needed to manage inventory
//        Instantiate the application
//        Call a method to initialize the application
//        Use this method to kick of application logic
//        Now that we have a way to start the application, create the rest of the code to interact with a user.
//        Your application should have a main menu that will allow a user to do the following:
//
//        Create different products to be added to inventory
//        Read from existing products ... get inventory
//        Update products  ... Find a product, select what you want to edit and change the field
//        Delete products
//        Get different reports about products
//        Exit the program
//        Conclusion
//        Creating a Console class allowed us to abstract away user interface components of the code. Now the main code isn't
//        concerned with how UI is done, it is only concerned with what it does. We created an application class to house the elements
//        of the program. Finally, creating a user interface to allow a user to interact (Create, Read, Update, and Delete) with items in the inventory.