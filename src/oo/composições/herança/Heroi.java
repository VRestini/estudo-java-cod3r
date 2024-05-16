package oo.composições.herança;

public class Heroi extends  Jogador{
    Heroi(int x, int y){ // o método super se refere ao construtor da classe pai
        super(x, y);
    }
    boolean atacar(Jogador oponente) {
        boolean ataque1 = super.atacar(oponente);
        boolean ataque2 = super.atacar(oponente);
        boolean ataque3 = super.atacar(oponente);
        return ataque1 || ataque2 || ataque3;
    }
}
