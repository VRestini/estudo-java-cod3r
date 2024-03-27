package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		//String é imutável
		System.out.println("Olá pessoal".charAt(4));
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa "));
		System.out.println(s.toLowerCase().startsWith("boa "));
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "Vitor";
		var sobrenome = "Souza";
		var idade = 17;
		var salario = 1234.43;
		System.out.println("Nome: " + nome + "\nSobrenome: "
				+ sobrenome + "\nIdade: " + idade + "\n\n");
		System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f.", nome, sobrenome, idade, salario);
		
		String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$%.2f.", nome, sobrenome, idade, salario);
		System.out.println(frase);
	}
}
