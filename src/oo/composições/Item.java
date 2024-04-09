package oo.composições;

public class Item {
    String nome;
    int quantidade;
    double preco;
    Compra compra; // para fazer o relacionamento bidirecional

    Item(String nome, Integer quantidade, Double preco){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

}
