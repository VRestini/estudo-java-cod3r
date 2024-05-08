package oo.composições.herança;

public class Jogador {
    public int vida = 100;
    public int x;
    public int y;
    boolean atacar(Jogador oponente) {
        int deltaX = Math.abs(x - oponente.x);
        int deltaY = Math.abs(y - oponente.y);
        if (deltaX == 0 && deltaY == 1) {
            oponente.vida -= 10;
            return true;

        } else if (deltaX == 1 && deltaY == 0) {
            oponente.vida -= 10;
            return true;
        }else
            return false;
    }
    boolean andar(Direcap direcap){
        switch (direcap){
            case NORTE:{
                x--;
            }
            case LESTE:{
                y++;
            }
            case SUL:{
                x++;
            }
            case OESTE:{
                y--;
            }
        }
    return true;
    }
}
