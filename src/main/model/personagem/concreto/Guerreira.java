package main.model.personagem.concreto;

import main.model.personagem.Personagem;

public class Guerreira extends Personagem {

    private int escudo;

    public Guerreira(String nome) {
        super(nome);
        this.escudo = 3;
    }

    public boolean defender() {
        if (escudo > 0) {
            this.escudo--;
            return true;
        }
        else {
            return false;
        }
    }

}
