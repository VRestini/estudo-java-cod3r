package oo.composições.encapsulamento.casaB;

import oo.composições.encapsulamento.casaA.Ana;

public class Pedro extends Ana {

    void TestarAcesso(){
        Ana mae = new Ana();
        // não mostra System.out.println(mae.segredo);
        // não mostra System.out.println(mae.facoDentroCasa);
        System.out.println(formaFalar); //acessa através da herança
        System.out.println(todosSabem);
    }

}
