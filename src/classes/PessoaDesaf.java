package classes;

public class PessoaDesaf {
    double pesoPessoa;
    String nomePessoa;

    public PessoaDesaf(double peso, String nome) {
        this.pesoPessoa = peso;
        this.nomePessoa = nome;
    }
    public void comer(double comidaA, double comidaB){ // método criado por mim
        this.pesoPessoa = this.pesoPessoa + comidaA + comidaB;
    }
    public void comer(ComidaDesaf comidaDesaf){ // método criado pelo professor
        if (comidaDesaf != null){
            this.pesoPessoa += comidaDesaf.pesoComida;
        }
    }
}
