package org.example;

import lombok.*;
@AllArgsConstructor
@Getter
@Setter
public class CarFixService {
    public static Samochod napraw(Samochod samochod, Komunikaty komunikaty){
        switch (komunikaty){
            case ENGINE_FAILURE:{
                Silnik nowySilnik = new Silnik("Nowy silnik", 2.2);
                samochod.setSilnik(nowySilnik);
                break;
            }
            case WHEELS_FAILURE:{
                Kola noweKola = new Kola(210);
                samochod.setKola(noweKola);
                break;
            }
            case BODY_FAILURE:{
                Karoseria nowyKolor = new Karoseria(Kolory.CZERWONY);
                samochod.setKaroseria(nowyKolor);
                break;
            }
        }
        return samochod;
    }
}
