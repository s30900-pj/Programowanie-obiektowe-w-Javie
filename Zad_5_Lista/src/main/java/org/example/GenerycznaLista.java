package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GenerycznaLista<T>
{
    private List<T> lista;

    public GenerycznaLista() {
        this.lista = new ArrayList<>();
    }

    public void dodaj(T element) {
        lista.add(element);
    }

    public void usun(T element) {
        lista.remove(element);
    }

    public List<T> pobierzWszystkie() {
        return lista;
    }
}
