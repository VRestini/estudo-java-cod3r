package classes;

import java.util.Scanner;

public class ProdutoTeste {
    public static void main(String[] args) {
        // valor associado a classe e objeto
        // um construtor pode ter o mesmo nome, mas seus parâmetros devem ser diferentes em quantidade
        Produto p1 = new Produto("Notebook", 1000.00);

        Produto p2 = new Produto(); // aqui estou usando o construtor padrão
        p2.nome = "Celular";
        p2.preco = 1000.00;
        Produto.desconto = 0.5;

        Double precoFinal1 = p1.precoComDesconto();
        Double precoFinal2 = p2.precoComDesconto();

        System.out.println(p1.nome + " " + p1.precoComDesconto());
        System.out.println(p2.nome + " " + p2.precoComDesconto(0.1));



    }
}
