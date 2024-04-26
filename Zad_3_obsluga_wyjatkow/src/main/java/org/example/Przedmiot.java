package org.example;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class Przedmiot {
    private String nazwa;
    private Sala sala;
}
