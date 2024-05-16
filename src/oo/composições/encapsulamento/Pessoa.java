package oo.composições.encapsulamento;

public class Pessoa {
    private int idade;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idadeNova) {
        idadeNova = Math.abs(idadeNova);
        if (idadeNova >= 0 && idadeNova <= 100){
            idade = idadeNova;
        }
        else{
            idade = 0;
        }
    }
}
