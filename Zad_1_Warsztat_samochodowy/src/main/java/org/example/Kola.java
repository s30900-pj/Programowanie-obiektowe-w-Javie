package org.example;

import lombok.*;
@AllArgsConstructor
@Getter
@Setter
public class Kola {
    private int VMax;

    @Override
    public String toString() {
        return "VMax " + VMax;
    }
}
