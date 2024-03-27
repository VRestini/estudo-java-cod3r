package fundamentos;

import javax.swing.JOptionPane; 

public class ConversaoStringNumero {
	public static void main(String[] args) {
		// BigDecimal tem uma precisão perfeita
		String num1 = JOptionPane.showInputDialog(
				"Digite o primeiro número");
		String num2 = JOptionPane.showInputDialog(
				"Digite o segundo número");
		
		System.out.println(num1 + num2);
		double numero1 = Double.parseDouble(num1);
		double numero2 = Double.parseDouble(num2);
		
		double soma = numero1 + numero2;
		System.out.println("Soma é: " + soma);
		System.out.println("Média é: " + soma/2);
	}
}
