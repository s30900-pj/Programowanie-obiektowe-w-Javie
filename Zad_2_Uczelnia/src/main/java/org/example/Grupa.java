package org.example;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Builder
public class Grupa {
    private String Nazwa;
    private Przedmiot przedmiot;

    @Builder.Default
    private List<Uczen> uczniowie = new ArrayList<>();


    public void dodajUcznia(Uczen uczen){
        uczniowie.add(uczen);
        uczen.dodajUczniaDoGrupy(Grupa.this);
    }
}
