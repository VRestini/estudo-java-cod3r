package operadores;

public class Ternario {
	public static void main(String[] args) {
		double media = 7.6;
		String resultadoFinal = media >= 7.0 ? 
				"aprovado" : "em recuperação";
		System.out.println("O aluno está " + resultadoFinal);
		
		double nota = 9.9;
		boolean bomComportamento = false;
		boolean passouMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouMedia;
		String resultado= temDesconto ? "sim" : "não";
		System.out.println("Tem desconto: " + resultado);
		
	}
}
