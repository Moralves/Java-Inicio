package Fundamentos;

public class Temperatura {
	public static void main(String[] args) {
//		(°F - 32) x 5/9 = °C
//		sempre colocar um ponto (5/9.0) para que o java reconheça a divisão com resultado não inteiro
		System.out.println("Conversão de °F para °C");
		final double FATOR = 5/9.0;
		final double AJUSTE = 32;
		double fahrenheit = 86;
		// (CTRL + ALT + ^ ou v) com a linha selecinada = Duplicar a linha para ambas direções.
		// (Segurar Alt com a linha selecionada + ^ ou v) = Mover a linha dentro do código.
		System.out.println("O resultade de °F convertido para °C = " + (fahrenheit - AJUSTE) * FATOR + "°C");
		fahrenheit = 150;
		System.out.println("O resultade de °F convertido para °C = " + (fahrenheit - AJUSTE) * FATOR + "°C");
		fahrenheit = 0;
		System.out.println("O resultade de °F convertido para °C = " + (fahrenheit - AJUSTE) * FATOR + "°C");
	}

}
