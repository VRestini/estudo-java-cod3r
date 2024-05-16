package oo.composições.herança;

public class Jogo {
    public static void main(String[] args) {
        Heroi heroi = new Heroi(20, 10);

        Vilao monstro = new Vilao();
        monstro.x = 20;
        monstro.y = 11;

        System.out.println("Vida do herói: " + heroi.vida + "    vida do monstro: " + monstro.vida);
        heroi.atacar(monstro);
        System.out.println("Vida do herói: " + heroi.vida + "    vida do monstro: " + monstro.vida);
    }
}
