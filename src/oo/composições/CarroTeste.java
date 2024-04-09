package oo.composições;

public class CarroTeste {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        System.out.println("O carro está ligado? " + c1.estaLigado());

        c1.ligar();
        System.out.println("O carro está ligado? " + c1.estaLigado());

        System.out.println("Quantidade de giros: " + c1.motor.giros());

        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();

        System.out.println("Quantidade de giros: " + c1.motor.giros());

        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear(); // nn freia mais por causa do if feito no método
        System.out.println("Quantidade de giros: " + c1.motor.giros());

        // Para isso nn ocorrer deve ser encapsulado
        //c1.motor.fatorInjecao = - 30;

        System.out.println(c1.motor.carro.motor.carro); // relação bidirecional
    } // aula 26 28:13
}
