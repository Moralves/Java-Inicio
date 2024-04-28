package Fundamentos.Operadores;

import java.util.Scanner;

//Wrappers são as variáveis comuns geralmente com a letra maiúscula que é a versão orientada a objeto 
//falando da variável em sí criada

public class Wrapper {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);//Para receber dado do teclado,
		
		Byte b = 100;
		Short s = 1000;
		
		/*Integer i = Integer.parseInt("1000"); Para criar uma variável]
		String que pode ser convertida em Int*/
		Integer i = Integer.parseInt(entrada.next()); //Entrada do usuário!!
		Long l = 1000000L;

		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3 );
		System.out.println(l / 3);
		
		float f =123.10F; // Precisa ter o F no final 
		//para ser realmente considerado float.
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase()); // Para transformar o valor 
		//Boolean em String e deixar maiúsculo.
		
		Character c = '#';
		System.out.println(c + "!!!");//É possível concatenar character na impressão
		
		
		
		entrada.close();//Para finalizar uma execução de entrada no código/Programa
	}

}
