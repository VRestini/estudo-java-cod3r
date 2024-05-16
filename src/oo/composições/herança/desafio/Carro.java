package oo.composições.herança.desafio;

public class Carro {
    public static int velocidadeMaxima;
    private Integer velocidadeAtual = 0;

    Carro(int velocidadeMaxima){
        velocidadeMaxima = velocidadeMaxima;
    }
    public Integer getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(Integer velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public boolean acelerar(Integer velocidade){
        if (velocidadeAtual > velocidadeMaxima){
            velocidadeAtual = velocidadeMaxima;
        }else {
            this.velocidadeAtual += velocidade;
        }

        return true;
    }
    public boolean frear(){
        if (this.velocidadeAtual == 0){
            System.out.println("Velocidade do veiculo já é de 0km.");
        } else if (this.velocidadeAtual >= 1 && this.velocidadeAtual <=4) {
            this.velocidadeAtual = 0;
        }else {
            this.velocidadeAtual -= 5;
        }
        return true;
    }
}
