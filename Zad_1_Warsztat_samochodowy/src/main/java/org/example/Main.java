package org.example;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Samochod> listaSamochodow = new ArrayList<>();
        listaSamochodow.add(new Samochod("Skoda Octavia", new Silnik("Diesel", 2.0), new Karoseria(Kolory.CZARNY), new Kola(200)));

        listaSamochodow.add(new Samochod("BMW X5", new Silnik("Benzyna", 3.0), new Karoseria(Kolory.BIALY), new Kola(250)));

        listaSamochodow.add(new Samochod("Volkswagen Golf", new Silnik("Diesel", 1.9), new Karoseria(Kolory.CZERWONY), new Kola(230)));

        System.out.print("----------------------\nMetoda 1: Pętla foreach\n");
        for (Samochod samochod : listaSamochodow) {
            CarFixService.napraw(samochod, Komunikaty.ENGINE_FAILURE);
            System.out.println("Naprawiono samochód: " + samochod.getModel() + " po awarii silnika.");
            samochod.printInfo();
            System.out.print("\n");
        }
        System.out.print("----------------------\nMetoda 2: Pętla for\n");
        for (int i = 0; i < listaSamochodow.size(); i++) {
            Samochod samochod = listaSamochodow.get(i);
            CarFixService.napraw(samochod, Komunikaty.WHEELS_FAILURE);
            System.out.println("Naprawiono samochód: " + samochod.getModel() + " po awarii kół.");
            samochod.printInfo();
            System.out.print("\n");
        }
        System.out.print("-----------------------\nMetoda 3: Strumienie\n");
        listaSamochodow.stream()
            .map(samochod -> CarFixService.napraw(samochod, Komunikaty.BODY_FAILURE))
            .forEach(samochod -> {
            System.out.println("Naprawiono samochód: " + samochod.getModel() + " po awarii karoserii.");
            samochod.printInfo();
                System.out.print("\n");
        });
    }

}