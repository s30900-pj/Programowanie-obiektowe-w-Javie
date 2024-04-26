package org.example;
import lombok.*;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotBlank;
@Setter
@Getter
@Builder
public class Grupa {
    @NotNull
    @NotBlank
    private String Nazwa;
    @NotNull
    @NotBlank
    private Przedmiot przedmiot;

    @Builder.Default
    private List<Uczen> uczniowie = new ArrayList<>();

    public void dodajUcznia(@NotNull Uczen uczen) {
        if (uczen == null) {
            throw new IllegalArgumentException("Uczeń nie może być null");
        }
        uczniowie.add(uczen);
        uczen.dodajUczniaDoGrupy(this);
    }
}
