package oo.composições.herança.desafio;

public class PilotaCarro {
    public static void main(String[] args) {
        Fusca fusca = new Fusca();
        Kombi kombi = new Kombi();
        fusca.acelerar(10);
        fusca.frear();
        System.out.println(fusca.getVelocidadeAtual());
        kombi.acelerar(40);
        kombi.frear();
        System.out.println(kombi.getVelocidadeAtual());
    }
}
