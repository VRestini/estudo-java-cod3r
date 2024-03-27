package classes;

public class DataTeste {
    public static void main(String[] args) {
        Data dateOne = new Data();
        Data dataTwo = new Data(21, 10, 2006);
        String data = dateOne.dataFormatada();
        String datao = dataTwo.dataFormatada();
        System.out.println(data);
        System.out.println(datao);
    }
}
