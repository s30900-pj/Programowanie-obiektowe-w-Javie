package org.example;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Builder
public class Uczen {
    private String imie;
    private String nazwisko;
    private int numerStudenta;

    @Builder.Default
    private List<Grupa> grupy = new ArrayList<>();

    public void dodajUczniaDoGrupy(Grupa grupa){
        grupy.add(grupa);
    }
}
