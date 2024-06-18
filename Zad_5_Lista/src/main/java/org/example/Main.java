package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        GenerycznaLista<String> mojaLista = new GenerycznaLista<>();

        mojaLista.dodaj("wlasna");
        mojaLista.dodaj("generyczna");
        mojaLista.dodaj("implementacja");
        mojaLista.dodaj("listy");

        System.out.println("Cała lista:");
        mojaLista.pobierzWszystkie().forEach(System.out::println);

        mojaLista.usun("generyczna");

        System.out.println("\nLista po usunięciu elementu 'generyczna':");
        mojaLista.pobierzWszystkie().forEach(System.out::println);

        System.out.println("\nLista z elementami wypisanymi z dużej litery:");
        List<String> listaZDuzymiLiterami = mojaLista.pobierzWszystkie().stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        listaZDuzymiLiterami.forEach(System.out::println);
    }
}