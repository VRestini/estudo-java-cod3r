package oo.composições.encapsulamento.casaB;

import oo.composições.encapsulamento.casaA.Ana;

public class Julia {
    void TestarAcesso(){
        Ana sogra = new Ana();
        // não mostra System.out.println(sogra.segredo);
        // não mostra System.out.println(sogra.facoDentroCasa);
        // não mostra System.out.println(sogra.formaFalar);
        System.out.println(sogra.todosSabem);
    }

}
