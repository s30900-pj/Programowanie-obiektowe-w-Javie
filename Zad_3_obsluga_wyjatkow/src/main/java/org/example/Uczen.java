package org.example;

import lombok.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Builder
public class Uczen {
    @NonNull
    @NotBlank
    private String imie;
    @NonNull
    @NotBlank
    private String nazwisko;
    @NotBlank
    private int numerStudenta;

    @Builder.Default
    private List<Grupa> grupy = new ArrayList<>();

    public void dodajUczniaDoGrupy(@NotNull Grupa grupa){
        if (grupa == null) {
            throw new IllegalArgumentException("Grupa nie może być null");
        }
        grupy.add(grupa);
    }
}
