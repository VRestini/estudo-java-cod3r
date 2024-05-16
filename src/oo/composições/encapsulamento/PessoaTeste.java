package oo.composições.encapsulamento;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa p1 =new Pessoa();
        p1.setIdade(99);
        System.out.println(p1.getIdade());
        p1.setIdade(-45);
        System.out.println(p1.getIdade());
    }
}
