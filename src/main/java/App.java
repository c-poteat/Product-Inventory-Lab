import io.Console;
import services.BeerService;

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
//        Read from existing products
//        Update products
//        Delete products
//        Get different reports about products
//        Exit the program
//        Conclusion
//        Creating a Console class allowed us to abstract away user interface components of the code. Now the main code isn't
//        concerned with how UI is done, it is only concerned with what it does. We created an application class to house the elements
//        of the program. Finally, creating a user interface to allow a user to interact (Create, Read, Update, and Delete) with items in the inventory.