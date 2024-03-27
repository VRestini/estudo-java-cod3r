package classes;

public class Produto {
    Produto(String nomeInicial, double precoinicial){
        nome = nomeInicial;
        preco = precoinicial;

    }

    Produto(){

    }
    String nome;
    double preco;
    static double desconto =0.25;

    double precoComDesconto(){
        return preco * (1 -desconto );
    }
    double precoComDesconto(double descontoGerente){
        return preco * (1 - (desconto + descontoGerente));
    }

}
