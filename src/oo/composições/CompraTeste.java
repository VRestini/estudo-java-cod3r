package oo.composições;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CompraTeste {
    public static void main(String[] args) {
        Compra c1 = new Compra();
        c1.AdicionarItem(new Item("nome", 3, 2040.50)); // usando o método criado na classe
        c1.itens.add(new Item("Ps3", 1, 1500.00)); // usando métodos do Java

        System.out.println(c1.itens.size()); // mostra a quantidade de itens no Array itens
        for (int i=0; i<c1.itens.size(); i++) {
            System.out.printf("Posição %d- %s\n", i, c1.itens.get(i));
        }


    }
}
