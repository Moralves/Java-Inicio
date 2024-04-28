package Fundamentos;

public class TipoString 
{
	public static void main(String[] args) {
		System.out.println("Olá Pessoal".charAt(0));
		
		String s = "Boa Tarde";
		System.out.println(s.concat("!!!!"));
		System.out.println(s + "!!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toUpperCase().startsWith("BOA"));
		System.out.println(s.length());
		System.out.println(s.toLowerCase().equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "Pedro";
		var sobrenome = "Moreira";
		var idade = 23;
		var salario = 1980.00;
		
		System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " 
		+ idade + "\nSalario: " + salario + "\n\n" );
		
		System.out.printf("O senhor %s %s tem %d anos e ganha R$ %.2f", nome, sobrenome, 
				idade, salario);
		
		String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$ %.2f", nome, sobrenome, 
				idade, salario);
		System.out.println(frase);// concatetização de texto string com int (maravilha)
		System.out.println("Frase qualquer".contains("qual"));// se contains a string na variável
		System.out.println("Frase qualquer".indexOf("qual"));// int que começa a string citada
		System.out.println("Frase qualquer".substring(6));//imprimir a partir de um int especifico
		System.out.println("Frase qualquer".substring(6,10));//imprimir a partir de um int limitado até -1 no exemplo até 9
	}
}
