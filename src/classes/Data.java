package classes;

public class Data {
    Data(int diaInicial, int mesInicial, int anoInicial){
        this.dia = diaInicial; //pega o valor da instancia
        this.mes = mesInicial; //this referencia o objeto atual
        this.ano = anoInicial;
    }
    Data(){
        //dia = 01;
        //mes = 01;
        //ano = 1970;
        this(1, 1, 1970);
    }
    int dia;
    int mes;
    int ano;
    String dataFormatada(){
        String formato = "%d/%d/%d"; // como está dentro do método é local
        return String.format (formato, this.dia, this.mes, this.ano);
        // nunca usar um printLn nesses casos, pois ele só roda em aplicações com terminal

        // AULA 20 MINUTO 7:07
    }
}
