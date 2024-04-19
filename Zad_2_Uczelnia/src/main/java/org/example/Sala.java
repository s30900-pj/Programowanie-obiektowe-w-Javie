package org.example;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
public abstract class Sala {
    private String nazwa;
    private TypSali typ;

    public abstract void wyczysc();
    public abstract void wlaczPrad();
    public abstract void wylaczPrad();
}