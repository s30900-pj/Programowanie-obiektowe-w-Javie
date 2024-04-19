package org.example;

import java.util.ArrayList;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Uczen uczen1 = Uczen.builder().imie("Jan"). nazwisko("Kowalski").numerStudenta(1234).build();
        Uczen uczen2 = Uczen.builder().imie("Anna"). nazwisko("Nowak").numerStudenta(456).build();
        Uczen uczen3 = Uczen.builder().imie("Marek"). nazwisko("Zięba").numerStudenta(789).build();
        Uczen uczen4 = Uczen.builder().imie("Ewa"). nazwisko("Kaczmarek").numerStudenta(101112).build();
        Uczen uczen5 = Uczen.builder().imie("Piotr"). nazwisko("Wiśniewski").numerStudenta(131415).build();

        Grupa grupaA = Grupa.builder().Nazwa("A").build();
        Grupa grupaB = Grupa.builder().Nazwa("B").build();

        grupaA.setPrzedmiot(new Przedmiot("Matematyka", new SalaWykladowa()));
        grupaB.setPrzedmiot(new Przedmiot("Informatyka", new SalaKomputerowa()));

        grupaA.dodajUcznia(uczen1); grupaA.dodajUcznia(uczen2); grupaA.dodajUcznia(uczen5);
        grupaB.dodajUcznia(uczen3); grupaB.dodajUcznia(uczen4); grupaB.dodajUcznia(uczen5);

/*        grupaA.getUczniowie().addAll(Arrays.asList(uczen1, uczen2, uczen5));
        grupaB.getUczniowie().addAll(Arrays.asList(uczen3, uczen4, uczen5));*/

        System.out.println("Informacje o uczniach:");
        for (Uczen uczen : Arrays.asList(uczen1, uczen2, uczen3, uczen4, uczen5)) {
            System.out.print("Imię: " + uczen.getImie() +
                    ", Nazwisko: " + uczen.getNazwisko() +
                    ", Nr studenta: " + uczen.getNumerStudenta());
            System.out.print(", Grupa: ");
            for (Grupa grupa : uczen.getGrupy()) {
                System.out.print(grupa.getNazwa() + " ");
            }
            System.out.println();
        }

        System.out.println("\nInformacje o grupach:");
        System.out.println("Grupa " + grupaA.getNazwa());
        System.out.println("Przedmiot: " + grupaA.getPrzedmiot().getNazwa());
        System.out.println("Numer sali: " + grupaA.getPrzedmiot().getSala().getNazwa());
        System.out.println("Typ sali: " + grupaA.getPrzedmiot().getSala().getTyp());
        System.out.println("Uczniowie:");
        for (Uczen uczen : grupaA.getUczniowie()) {
            System.out.println("- " + uczen.getImie() + " " + uczen.getNazwisko());
        }

        System.out.println("\nGrupa " + grupaB.getNazwa());
        System.out.println("Przedmiot: " + grupaB.getPrzedmiot().getNazwa());
        System.out.println("Numer sali: " + grupaA.getPrzedmiot().getSala().getNazwa());
        System.out.println("Typ sali: " + grupaB.getPrzedmiot().getSala().getTyp());
        System.out.println("Uczniowie:");
        for (Uczen uczen : grupaB.getUczniowie()) {
            System.out.println("- " + uczen.getImie() + " " + uczen.getNazwisko());
        }
    }
}