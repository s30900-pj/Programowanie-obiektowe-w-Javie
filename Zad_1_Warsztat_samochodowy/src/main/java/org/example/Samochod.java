package org.example;
import lombok.*;
@Getter
@Setter
@AllArgsConstructor
/*@NoArgsConstructor
@RequiredArgsConstructor*/
public class Samochod{
    private String model;
    private Silnik silnik;
    private Karoseria karoseria;
    private Kola kola;
    public void printInfo() {
        System.out.println("Model: " + getModel());
        System.out.println("Typ silnika: " + getSilnik().getModelSilnika() + ", pojemność: " + getSilnik().getPojemnosc() + " l");
        System.out.println("Kolor karoserii: " + getKaroseria().getKolory().name() + ", kod szesnastkowy: " + getKaroseria().getKolory().getKod_Koloru());
        System.out.println("Maksymalna prędkość kół: " + getKola().getVMax() + " km/h");
    }
    @Override
    public String toString() {
        return "Model " + model + "\nSilnik " + silnik + "\nKaroseria " + karoseria + "\nKola " + kola;
    }
}
