package oo.composições;

public class PrincipioOO {

    /*

    Paradigmas: go to, estrutural, funcional e orientação a objetos
    Orientação a objetos tem 4 pilares: encapsulamento, herança, polimorfismo e abstração

    Encapsulamento: princípio que diz que deve ter uma parte do objeto deve estar escondida
    do mundo exterior. Exemplo: para dirigir um carro o motorista interage com o acelerador,
    mas ele não precisa interagir nem saber como funciona a queima de combustivel, a rotação
    do motor pra poder dirigir
    Usa o mínimo de interação possível, visa só o necessário, oferece mais segurança
    Modificadores de acesso: public, protected, packgae(default) e private
    Private só é acessado diretamente dentro da própria classe
    Public todas as classes podem acessar
    Package: somente classes dentro de um mesmo package podem acessar o elemento, é o padrão do java
    protected: só pode ser acessado por classes do mesmo package ou por herança



    Herança: reuso de código. Exemplo: um filho receber caracteristiacas herdadas da mãe
    Composição x Herança
    Super classe: casse mãe; sub classe: classe filha;
    Todo comportamento que a super classe tem, as suas subclasses terão
    Em java toda classe só pode ser herdeira uma uma unica classe, em outra linguagens nn
    Quando uma classe herda um método, é possível reescrever esse método na classe filha
    aula 29 minuto 19:30


    Polimorfismo: especificação, ou seja, utilizar algo para diferentes finalidades
    . Está ligada a herança.
    Estático e dinamico
    Estático: sobrecarga, exemplo: mesmo método com assinaturas diferentes
    Dinamico: precisa da herança pra ocorrer
        exemplo:
    Superclasse: carro
    subclasses: civic e corolla
    void estacionar(Civic c){}
    void estacionar(Carro c){} dessa forma, tornando mais genérica, ocorre o polimorfismo dinamico
    o polimorfismo dinamico tbm pode ser usado na instanciação de objetos


    Abstração: capacidade de simplificar, resumir, ocultar elementos que não são necessários
    para o algoritmo.
    Pegar coisas do mundo real e "traduzir pro software"
    depende muito da complexidade do sistema


     */

}
