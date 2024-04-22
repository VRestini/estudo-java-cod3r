package oo.composições.desafio;

import java.util.ArrayList;

// erros encontrados após correção
// não foi criado um método para adicionar Compra no array Compra
// no método obterValorTotal, invés de utilizar "compra.valor"
// deveria ser usado "compra.métodoCriadoParaObterValor
public class Cliente {
    Double valorTotal;
    String nome;
    ArrayList<Compra> compras = new ArrayList<>();

    public Double obterValorTotal(Compra compra){
        for (int i = 0; i < compras.size(); i++) {
            valorTotal = valorTotal + compra.valor;
        }
        return valorTotal;
    }

    public Cliente(String nome, Compra compra) {
        this.nome = nome;
        this.compras.add(compra) ;
    }
}
