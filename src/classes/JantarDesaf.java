package classes;

public class JantarDesaf {
    public static void main(String[] args) {
        PessoaDesaf p1 = new PessoaDesaf(70, "Vitor");
        PessoaDesaf p2 = new PessoaDesaf(100, "Restini");
        ComidaDesaf c1 = new ComidaDesaf(3, "Lasanha");
        ComidaDesaf c2 = new ComidaDesaf(5, "Picanha");

        System.out.printf("O peso do(a) %s antes da refeição é %.2fkg", p1.nomePessoa, p1.pesoPessoa);
        p1.comer(c1.pesoComida, c2.pesoComida);
        System.out.printf("\nO peso do(a) %s depois da refeição é %.2fkg", p1.nomePessoa, p1.pesoPessoa);

        p2.comer(c1);
        System.out.printf("\nO peso é %.2f", p2.pesoPessoa);

    }
}
