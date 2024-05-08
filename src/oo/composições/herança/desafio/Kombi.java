package oo.composições.herança.desafio;

public class Kombi extends Carro{
    @Override
    public boolean acelerar(Integer velocidade) {
        boolean v1 = super.acelerar(velocidade);
        boolean v2 = super.acelerar(velocidade);
        return v1 || v2;
    }
}
