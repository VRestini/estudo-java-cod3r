package controlador;

public class SwitchSemBreak {
    public static void main(String[] args) {
        String faixa = "preta";
        switch (faixa.toLowerCase()){
            case "preta":
                System.out.println();
            case "marrom":
                System.out.println('a');
            case "roxo":
                System.out.println("b");
            case "amarela":
                System.out.println("c");
            // se vc nn usar break ele vai rodar todas as opcoes abaixo da escolhida
            //default:
            //    System.out.println("Sei de nada fi");
        }
    }
}
