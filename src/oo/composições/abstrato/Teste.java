package oo.composições.abstrato;

public class Teste {
    public static void main(String[] args) {
        Cachorro c1 = new Cachorro();
        System.out.println(c1.mover());
        System.out.println(c1.mamar());
        System.out.println(c1.respirar());
    }
}
