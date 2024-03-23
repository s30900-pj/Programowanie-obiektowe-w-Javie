package org.example;

import lombok.*;
@AllArgsConstructor
@Getter
public enum Kolory {
    CZARNY("#000000"),
    BIALY("#FFFFFF"),
    CZERWONY("#FF0000");

    private String kod_Koloru;
}
