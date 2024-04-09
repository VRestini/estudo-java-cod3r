package oo.composições;

public class Motor {
    Carro carro; // relação bidirecional, a classe motor acessa o carro e vice-versa
    boolean ligado = false;
    double fatorInjecao = 1;
    Motor(Carro carro){
        this.carro = carro;
    }

    int giros(){
        if (!ligado){
            return 0;
        }else {
            return (int) fatorInjecao * 300; // casting
        }
    }
}
