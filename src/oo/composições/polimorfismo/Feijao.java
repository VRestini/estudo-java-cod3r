package oo.composições.polimorfismo;

public class Feijao extends Comida{
    private double peso;
    Feijao(double peso){
        super(peso);
    }
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (this.peso >= 0){
            this.peso = peso;
        }

    }
}
