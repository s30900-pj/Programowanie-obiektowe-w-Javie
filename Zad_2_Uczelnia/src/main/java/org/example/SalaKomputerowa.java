package org.example;

import lombok.*;

@Setter
@Getter
public class SalaKomputerowa extends Sala{
    public SalaKomputerowa() {
        super("101", TypSali.KOMPUTEROWA);
    }

    @Override
    public void wyczysc() {
        System.out.println("Sala komputerowa została wyczyszczona.");
    }

    @Override
    public void wlaczPrad() {
        System.out.println("Prąd został włączony w sali komputerowej.");
    }

    @Override
    public void wylaczPrad() {
        System.out.println("Prąd został wyłączony w sali komputerowej.");
    }
}
