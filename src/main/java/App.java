import io.Console;
import services.BeerService;

import java.util.Scanner;

public class App {
    private BeerService beerService = new BeerService();  // (1)

    public static void main(String[] args) {
        App application = new App(); // (2)
        application.init(); // (3)

    }

    public void init() {
        // (4)
        // application logic here
        // call method to take user input and interface with services
        Console.printWelcome();
        Console.createMenu();


    }

}

