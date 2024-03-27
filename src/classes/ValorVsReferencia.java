package classes;

public class ValorVsReferencia {
    public static void main(String[] args) {
        double a = 2;
        double b = a; // atribuicao por valor (Tipo primitivo)
        a++;
        b--;
        System.out.println(a + "  " + b);
        Data d1 = new Data(1, 6, 2006);
        Data d2 = d1; // atribuição por referencia (objeto)

        d1.ano = 2025;
        d2.mes = 4;
        System.out.println(d1.dataFormatada());
        System.out.println(d2.dataFormatada());
        voltarDataParaValorPadrão(d1);
        System.out.println(d1.dataFormatada());
        System.out.println(d2.dataFormatada());

        int c =5;
        alterarPrimitivo(c);
        System.out.println(c);
    }
    static void voltarDataParaValorPadrão(Data d){ // gera impacto no valor
        d.dia = 1;
        d.mes = 3;
        d.ano = 1980;
    }
    static void alterarPrimitivo(int a){// não gera impacto
        a++;
    }
}// minuto 28 block 19
