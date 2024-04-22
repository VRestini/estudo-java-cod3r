package oo.composições.desafioCorrecao;

import java.util.ArrayList;

public class Compra {
    ArrayList<Item> itens = new ArrayList<>();
    void adicionarItem(Produto produto, int quantidade){
        itens.add(new Item(quantidade, produto));
    }
    double obterValorTotal(){
        double total = 0;
        for (Item it: itens) {
            total += it.quantidade * it.produto.preco;
        }
        return total;
    }
}
