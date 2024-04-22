package oo.composições.desafioCorrecao;

public class Sistema {
    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook", 2000.0); // instanciando o produto
        Produto p2 = new Produto("Smartphone", 2000.0);

        Cliente cl1 = new Cliente("Vitor"); // instanciando o cliente

        Compra c1 = new Compra(); // instanciando a compra
        c1.adicionarItem(p1, 3); // adicionando um item na compra

        cl1.compras.add(c1); // adicionando uma compra no cliente

        System.out.println(cl1.obterValorTotal());
    }
}
