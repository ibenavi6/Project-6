package defult;

import java.util.Scanner;

public class BevShopDriverApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BevShop bevShop = new BevShop();

        System.out.println("The current order in process can have at most " + bevShop.getMaxOrderForAlcohol() + " alcoholic beverages.");
        System.out.println("The minimum age to order alcohol drink is " + bevShop.getMinAgeForAlcohol());

        // -------- First Customer Order --------
        System.out.println("Start please a new order:");
        System.out.println("Your Total Order for now is 0.0");

        System.out.print("Would you please enter your name: ");
        String name1 = scanner.nextLine();

        System.out.print("Would you please enter your age: ");
        int age1 = scanner.nextInt();
        scanner.nextLine(); // Consume leftover newline

        bevShop.startNewOrder(10, Day.FRIDAY, name1, age1);

        if (bevShop.isValidAge(age1)) {
            System.out.println("Your age is above 20 and you are eligible to order alcohol");

            // Add first alcohol drink
            System.out.println("Would you please add an alcohol drink");
            bevShop.processAlcoholOrder("Wine", Size.SMALL);
            System.out.println("The current order of drinks is " + bevShop.getCurrentOrder().getTotalItems());
            System.out.println("The Total price on the Order is " + bevShop.totalOrderPrice(bevShop.getCurrentOrder().getOrderNo()));

            // Add second alcohol drink
            System.out.println("Your current alcohol drink order is less than 4");
            System.out.println("Would you please add a second alcohol drink");
            bevShop.processAlcoholOrder("Beer", Size.MEDIUM);
            System.out.println("The current order of drinks is " + bevShop.getCurrentOrder().getTotalItems());
            System.out.println("The Total Price on the Order: " + bevShop.totalOrderPrice(bevShop.getCurrentOrder().getOrderNo()));

            // Add third alcohol drink
            System.out.println("Your current alcohol drink order is less than 4");
            System.out.println("Add third alcohol drink");
            bevShop.processAlcoholOrder("Vodka", Size.LARGE);
            System.out.println("The current order of drinks is " + bevShop.getCurrentOrder().getTotalItems());
            System.out.println("The Total Price on the Order: " + bevShop.totalOrderPrice(bevShop.getCurrentOrder().getOrderNo()));

            if (!bevShop.isEligibleForMore()) {
                System.out.println("You have a maximum alcohol drinks for this order");
            }
        } else {
            System.out.println("Your Age is not appropriate for alcohol drink!!");
        }

        // Add coffee
        System.out.println("Would you please add a COFFEE to your order: ");
        bevShop.processCoffeeOrder("Latte", Size.MEDIUM, true, true);
        System.out.println("Total items on your order is " + bevShop.getCurrentOrder().getTotalItems());
        System.out.println("The Total Price on the Order: " + bevShop.totalOrderPrice(bevShop.getCurrentOrder().getOrderNo()));

        System.out.println("#------------------------------------#");

        // -------- Second Customer Order --------
        System.out.println("Would you please start a new order");

        System.out.print("Would you please enter your name: ");
        String name2 = scanner.nextLine();

        System.out.print("Would you please enter your age: ");
        int age2 = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        bevShop.startNewOrder(12, Day.SATURDAY, name2, age2);
        System.out.println("The Total Price on the Order: 0.0");

        System.out.println("Would you please add a SMOOTHIE to order");
        bevShop.processSmoothieOrder("Strawberry Banana", Size.MEDIUM, 3, true);
        System.out.println("The Total Price on the Order: " + bevShop.totalOrderPrice(bevShop.getCurrentOrder().getOrderNo()));

        System.out.println("Would you please add a SMOOTHIE to order");
        bevShop.processSmoothieOrder("Green Detox", Size.SMALL, 2, false);

        System.out.println("Would you please add a COFFEE to order");
        bevShop.processCoffeeOrder("Cappuccino", Size.SMALL, false, true);
        System.out.println("The Total Price on the Order: " + bevShop.totalOrderPrice(bevShop.getCurrentOrder().getOrderNo()));

        System.out.println("Would you please add a drink");
        if (bevShop.isValidAge(age2)) {
            bevShop.processAlcoholOrder("Tequila", Size.SMALL);
        } else {
            System.out.println("Your Age is not appropriate for alcohol drink!!");
        }

        System.out.println("The current order of drinks is " + bevShop.getCurrentOrder().getTotalItems());
        System.out.println("The Total price on the Order: " + bevShop.totalOrderPrice(bevShop.getCurrentOrder().getOrderNo()));

        if (bevShop.getCurrentOrder().findNumOfBeveType(Type.SMOOTHIE) >= bevShop.getMaxNumOfFruits()) {
            System.out.println("The total number of fruits is " + bevShop.getMaxNumOfFruits());
            System.out.println("You reached a Maximum number of fruits");
        }

        System.out.println();
        System.out.println("Total price on the second Order: " + bevShop.totalOrderPrice(bevShop.getCurrentOrder().getOrderNo()));
        System.out.println("Total amount for all Orders: " + bevShop.totalMonthlySale());

        scanner.close();
    }
}
