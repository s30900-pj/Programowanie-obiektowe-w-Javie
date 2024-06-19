package org.example;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose drink (coffee/tea): ");
        String drinkType = scanner.nextLine().toLowerCase();

        DrinkInterface drink;
        if (drinkType.equals("coffee")) {
            drink = new Coffee();
        } else if (drinkType.equals("tea")) {
            drink = new Tea();
        } else {
            System.out.println("Invalid drink type");
            return;
        }

        drink.order();

        double discount = 0;
        if (drinkType.equals("tea")) {
            System.out.println("Do you have a discount code? (yes/no): ");
            String hasDiscount = scanner.nextLine().toLowerCase();
            if (hasDiscount.equals("yes")) {
                System.out.println("Enter discount code: ");
                String code = scanner.nextLine();
                ReduceInterface discountService = new DiscountService();
                discount = discountService.applyDiscount(code);
            }
        }

        double finalPrice = drink.getPrice() * (1 - discount / 100);
        System.out.println("Final price after discount: $" + finalPrice);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Orders.txt", true))) {
            writer.write("Drink: " + drinkType + ", Size: " + drink.getSize() + ", Addition: " + drink.getAddition() + ", Final Price: $" + finalPrice + ", Discount: " + discount + "%\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}