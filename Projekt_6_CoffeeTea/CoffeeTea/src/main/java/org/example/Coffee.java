package org.example;
import java.util.Scanner;

public class Coffee implements DrinkInterface {
    private String size;
    private String addition;
    private double price;

    @Override
    public void order() {
        chooseSize();
        chooseAdditions();
    }

    @Override
    public void chooseSize() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose size (S, M, L): ");
        size = scanner.nextLine().toUpperCase();
        switch (size) {
            case "S":
                price = 5.0;
                break;
            case "M":
                price = 7.0;
                break;
            case "L":
                price = 10.0;
                break;
            default:
                System.out.println("Invalid size, defaulting to M");
                size = "M";
                price = 7.0;
                break;
        }
    }

    @Override
    public void chooseAdditions() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose addition (milk/sugar/none): ");
        addition = scanner.nextLine().toLowerCase();
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getSize() {
        return size;
    }

    @Override
    public String getAddition() {
        return addition;
    }
}

