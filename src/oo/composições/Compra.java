package oo.composições;

import java.util.ArrayList;
import java.util.Arrays;

public class Compra {
    String cliente;
    ArrayList<Item> itens = new ArrayList<>();

    void AdicionarItem(Item item) { // para não ter que usar itens.add no CompraTeste
        this.itens.add(item);
        item.compra = this;
    }

    void ItensCompra() {
        for (int i=0; i<itens.size(); i++) {
            System.out.println(itens.get(i));
        }

    }

}
