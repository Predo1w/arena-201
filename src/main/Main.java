package main;

import main.model.personagem.concreto.Guerreira;

public class Main {
    public static void main (String[] args) {
        //Guerreira é um Personagem. guerreira tem um escudo.
        Guerreira guerreira = new Guerreira("Marselo");
        guerreira.receberDano(20);
        guerreira.defender();

    }
}
