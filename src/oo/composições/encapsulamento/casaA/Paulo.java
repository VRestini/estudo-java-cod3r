package oo.composições.encapsulamento.casaA;

public class Paulo {
    void TesteAcesso(){
        Ana ana = new Ana();
        // não mostra System.out.println(ana.segredo);
        System.out.println(ana.facoDentroCasa);
        System.out.println(ana.formaFalar);
        System.out.println(ana.todosSabem);
    }
}
