package oo.composições.abstrato;

public abstract class Mamifero extends Animal{
    public abstract String mamar();
    @Override
    public String mover() {
        return "Com as patas";
    }
}
