package com.github.maicmiller;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Carro> listaCarros = new ArrayList<>();

        listaCarros.add(new Carro("Ford"));
        listaCarros.add(new Carro("Chevrolet"));
        listaCarros.add(new Carro("Volkswagen"));

        // Verifica(compara) se existe um objeto carro de marca Ford na lista...
        System.out.println(listaCarros.contains(new Carro("Ford")));
        // Ver o hashCode de Ford...
        System.out.println(new Carro("Ford").hashCode());
        System.out.println(new Carro("Ford").hashCode());
        System.out.println(new Carro("Ford10").hashCode());

        // Utilizando o método equals().
        Carro carroFord = new Carro("Ford");
        Carro carroChev = new Carro("Chevrolet");

        System.out.println(carroFord.equals(carroChev));
    }
}
