import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MenuItem[] menu = {
                new MenuItem("Latte", "drink", 3.5),
                new MenuItem("Bagel", "food", 2.0),
                new MenuItem("Croissant", "food", 2.5),
                new MenuItem("Cappuccino", "drink", 4.0),
                new MenuItem("Espresso", "drink", 2.5)
        };
        CoffeeShop coffeeShop = new CoffeeShop("My Coffee Shop", menu);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to " + coffeeShop.getName() + "!");

        ////
        System.out.println("Here's the menu:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i].getItem() + " (" + menu[i].getType() + ") - $" + menu[i].getPrice());
        }
        System.out.println();

        /////
        // Place orders
        while (true) {
            System.out.println("What would you like to order? (type 'done' to finish)");
            String order = scanner.nextLine();
            if (order.equalsIgnoreCase("done")) {
                break;
            }
            String message = coffeeShop.addOrder(order);
            System.out.println(message);
        }

        // Fulfill orders
        System.out.println("\nOrder summary:");
        while (true) {
            String order = coffeeShop.fulfillOrder();
            if (order.equals("ALL orders have been fulfilled!")) {
                break;
            }
            System.out.println(order);
        }

        // List orders
        System.out.println("\nList of orders taken: " + Arrays.toString(coffeeShop.listOrders()));

        // Due amount
        System.out.println("Total amount due: " + coffeeShop.dueAmount());

        // Cheapest item
        System.out.println("Cheapest item on the menu: " + coffeeShop.cheapestItem());

        // Drinks only
        System.out.println("Drinks only: " + Arrays.toString(coffeeShop.drinksOnly()));

        // Food only
        System.out.println("Food only: " + Arrays.toString(coffeeShop.foodOnly()));
    }
}
