package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaszynaPrzekaski {
    private List<Produkty> produkty;

    public MaszynaPrzekaski() {
        produkty = new ArrayList<>();
        produkty.add(new Produkty(1, "Batonik", 2.50));
        produkty.add(new Produkty(2, "Chrupki", 3.00));
        produkty.add(new Produkty(3, "Woda", 1.75));
    }

    public void produkty() {
        System.out.println("Dostępne produkty:");
        System.out.println("Nr.  Nazwa       Cena");
        for (Produkty produkty : produkty) {
            System.out.printf("%d.   %-10s  %.2f PLN\n", produkty.getNumer(), produkty.getNazwa(), produkty.getCena());
        }
    }

    public void zakupy() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Wybierz numer produktu: ");
        int wybrany_produkt_numer = scanner.nextInt();

        Produkty wybrany_produkt = null;
        for (Produkty produkt : produkty) {
            if (produkt.getNumer() == wybrany_produkt_numer) {
                wybrany_produkt = produkt;
                break;
            }
        }

        if (wybrany_produkt == null) {
            System.out.println("Nieprawidłowy numer produktu.");
            return;
        }

        System.out.print("Wybierz metodę płatności (1 - Gotówka, 2 - Karta): ");
        int metoda_platnosci = scanner.nextInt();

        if (metoda_platnosci == 1) {
            System.out.print("Podaj kwotę: ");
            double amountPaid = scanner.nextDouble();

            System.out.print("Podaj walutę (pln, eur, usd, gbp): ");
            String currency = scanner.next();

            double totalPrice = wybrany_produkt.getCena();
            System.out.printf("Zapłacono %.2f %s. Reszta: %.2f %s\n", amountPaid, currency, (amountPaid - totalPrice), currency);
            System.out.println("Transakcja zakończona pomyślnie.");

            System.out.printf("Kupiono: %s za %.2f PLN.\n", wybrany_produkt.getNazwa(), wybrany_produkt.getCena());
            System.out.println("Odbierz produkt.");

        } else if (metoda_platnosci == 2) {
            boolean paymentConfirmed = Math.random() < 0.5;

            if (paymentConfirmed) {
                System.out.printf("Płatność kartą za %s zaakceptowana.\n", wybrany_produkt.getNazwa());
                System.out.println("Odbierz produkt.");
            } else {
                System.out.println("Płatność kartą odrzucona.");
            }
        } else {
            System.out.println("Nieprawidłowa metoda płatności.");
        }
    }
}
