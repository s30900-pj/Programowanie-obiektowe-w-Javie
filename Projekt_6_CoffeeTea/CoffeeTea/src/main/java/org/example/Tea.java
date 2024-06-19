package org.example;

import java.util.Scanner;

public class Tea implements DrinkInterface {

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
                price = 4.0;
                break;
            case "M":
                price = 6.0;
                break;
            case "L":
                price = 8.0;
                break;
            default:
                System.out.println("Invalid size, defaulting to M");
                size = "M";
                price = 6.0;
                break;
        }
    }

    @Override
    public void chooseAdditions() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose addition (honey/lemon/none): ");
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