package org.example;

import lombok.*;

@Setter
@Getter
@Builder
public class Przedmiot {
    private String nazwa;
    private Sala sala;
}
