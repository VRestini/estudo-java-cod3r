package oo.composições.desafio;

import java.util.ArrayList;

// erros feitos após correção: Não foi criado um método para adicionar Item no array itens
// no método obterValorTotal não foi retornado o valor, ficando "preso" no método
// a variavel valor não era necessária
public class Compra {
    Double valor;
    ArrayList<Item> itens = new ArrayList<>();
    void obterValorTotal(Item item){
        for (int i = 0; i < itens.size(); i++) {
            valor = valor + (item.produto.preco * item.qtde);
        }
    }

    public Compra( Item item) {

        this.itens.add(item);
    }
}
