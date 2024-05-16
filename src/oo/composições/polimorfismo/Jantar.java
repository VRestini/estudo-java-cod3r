package oo.composições.polimorfismo;

public class Jantar {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(100);
        Arroz arroz = new Arroz(0.2);
        Sorvete sorvete = new Sorvete(0.2);
        Feijao feijao = new Feijao(0.2);
        System.out.println(p1.getPeso());
        p1.comer(arroz);
        p1.comer(feijao);
        p1.comer(sorvete);
        System.out.println(p1.getPeso());
    }
}
