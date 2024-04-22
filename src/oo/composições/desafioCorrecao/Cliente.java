package oo.composições.desafioCorrecao;

import java.util.ArrayList;

public class Cliente {
    final String nome; // final pq não vai mudar
    final ArrayList<Compra> compras = new ArrayList<>(); // final pq não vai mudar
    Cliente(String nome){
        this.nome = nome;
    }
    double obterValorTotal(){
        double total = 0;
        for (Compra compra: compras){
            total +=compra.obterValorTotal();
        }
        return total;
    }
}
