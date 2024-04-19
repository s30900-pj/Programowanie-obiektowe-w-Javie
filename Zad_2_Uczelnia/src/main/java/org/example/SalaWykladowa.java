package org.example;

import lombok.*;

@Setter
@Getter
public class SalaWykladowa extends Sala{
    public SalaWykladowa() {
        super("324", TypSali.WYKLADOWA);
    }

    @Override
    public void wyczysc() {
        System.out.println("Sala wykładowa została wyczyszczona.");
    }

    @Override
    public void wlaczPrad() {
        System.out.println("Prąd został włączony w sali wykładowej.");
    }

    @Override
    public void wylaczPrad() {
        System.out.println("Prąd został wyłączony w sali wykładowej.");
    }
}




