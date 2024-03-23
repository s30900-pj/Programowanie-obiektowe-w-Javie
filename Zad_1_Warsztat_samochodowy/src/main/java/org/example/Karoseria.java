package org.example;
import lombok.*;
@AllArgsConstructor
@Getter
@Setter
public class Karoseria {
    private Kolory kolory;

    @Override
    public String toString() {
        return "Kolory " + kolory;
    }
}
