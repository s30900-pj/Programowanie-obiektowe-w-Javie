package org.example;
import lombok.*;
@AllArgsConstructor
@Getter
@Setter
public class Silnik {
    private String modelSilnika;
    private double pojemnosc;

    @Override
    public String toString() {
        return "ModelSilnika " + modelSilnika + "\nPojemnosc " + pojemnosc ;
    }
}
