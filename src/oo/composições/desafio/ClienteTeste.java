package oo.composições.desafio;

public class ClienteTeste {
    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook", 2000.0);
        Produto p2 = new Produto("Smartphone", 1000.0);
        Produto p3 = new Produto("TV", 1500.0);

        Item i1 = new Item(4, p1);
        Item i2 = new Item(1, p2);
        Item i3 = new Item(2, p3);

        Compra c1 = new Compra(i1);

        Cliente cl1 = new Cliente("Vitor", c1);

        c1.obterValorTotal(i1);


        System.out.println(cl1.obterValorTotal(c1));
    }

}
