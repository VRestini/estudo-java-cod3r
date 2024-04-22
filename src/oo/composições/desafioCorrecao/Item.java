package oo.composições.desafioCorrecao;

public class Item {
    Integer quantidade;
    Produto produto;

    Item(Integer quantidade, Produto produto){
        this.produto = produto;
        this.quantidade = quantidade;
    }
}
