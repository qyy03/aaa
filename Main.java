import java.io.File;
import java.util.Scanner;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        // the code for current day of the week
        Calendar calendar = Calendar.getInstance();
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday",
        "Friday"};
        String dayName = daysOfWeek[dayOfWeek - 1];
       
       // Read data from files
       FileReader mondayFlavor = new FileReader("mondayIceCream.txt");
       FileReader tuesdayFlavor = new FileReader("tuesdayIceCream.txt");
       FileReader wednesdayFlavor = new FileReader("wednesdayIceCream.txt");
       FileReader thursdayFlavor = new FileReader("thursdayIceCream.txt");
       FileReader fridayFlavor = new FileReader("fridayIceCream.txt");
      
        // Use FileReader to get data
        String[] mondays = mondayFlavor.getStringData(6);
        String[] tuesdays = tuesdayFlavor.getStringData(6);
        String[] wednesdays = wednesdayFlavor.getStringData(6);
        String[] thursdays = thursdayFlavor.getStringData(6);
        String[] fridays = fridayFlavor.getStringData(6);
        // Create objects and store them in an array
        
        Flavors[] icecream = new Flavors[6];
        // Adjust array size to match file length
        for (int i = 0; i < 6; i++) {
        icecream[i] = new Flavors(mondays[i], tuesdays[i], wednesdays[i],                 thursdays[i], fridays[i]);
        }
        // Display options for the user
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to X's ice cream shop! Can I have a name?");
        String name = scan.nextLine();
        // setting total cost to 0 to reset everything
        double totalCost = 0.0;
        // making a continue choice and setting it to yes to start the loop
        String continueChoice = "yes";
        // LOOPS
        while (continueChoice.equals("yes")) {
            System.out.println("Would you like a: \n1. Small ($3.00)\n2. Medium ($5.00)\n3. Large ($7.00)");
            int size = scan.nextInt();
            double sizePrice = 0.00;
            if (size == 1) {
                sizePrice = 3.00;
            } else if (size == 2) {
                sizePrice = 5.00;
            } else if (size == 3) {
                sizePrice = 7.00;
            }
            // day of the week
            System.out.println("Today is " + dayName);
            System.out.println("Here's all the flavors for" + dayName);
            // print out all flavors of the week
            if (dayName.equals("Monday")) {
                for (Flavors flavor : icecream) {
                    System.out.println(flavor.getMonday());
                }
            } else if (dayName.equals("Tuesday")) {
                for (Flavors flavor : icecream) {
                    System.out.println(flavor.getTuesday()); // getTuesday so it                 references back to flavor class
                }
            } else if (dayName.equals("Wednesday")) {
                for (Flavors flavor : icecream) {
                    System.out.println(flavor.getWednesday());
                }
            } else if (dayName.equals("Thursday")) {
                for (Flavors flavor : icecream) {
                    System.out.println(flavor.getThursday());
                }
            } else if (dayName.equals("Friday")) {
                for (Flavors flavor : icecream) {
                    System.out.println(flavor.getFriday());
                }
            }
            // make user choose the flavor that correlates with the number
            int flavorNumber = scan.nextInt();
            // asking user if they want toppings
            System.out.println("Would you like to add sprinkles? (+$0.50 charge) \n              1. yes \n 2. no");
            int toppings = scan.nextInt();
            if (toppings == 1) {
                sizePrice += 0.50; // Add the cost of sprinkles if chosen
            }
            totalCost += sizePrice; // adds and prints the price
            System.out.printf("Your total is $" + totalCost + ", thank you " + name              + "!");
            // asking user if they want to continue the loop
            System.out.println("\n Would you like to add more? (yes/no)");
            scan.nextLine();
            // consume the new character so it doesn't skip the next line
            continueChoice = scan.nextLine();
            continueChoice.toLowerCase();
            // ends loop
            if (continueChoice.equals("no")) {
                System.out.println("Thank you for shopping with us!");
            } else {
                continue;
            }
        }
        scan.close();
    }
}