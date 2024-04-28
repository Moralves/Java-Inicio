package Fundamentos;

import java.lang.invoke.StringConcatException;
import java.security.DigestOutputStream;

public class NotacaoPonto 
{
	public static void main(String[] args) 
	{
		double a = 2.3;
		String s = "Bom dia X";
		//para mexer na string após declaração. 
		s = s.toUpperCase();//toda a string maiúscula
		s = s.replace("X", "Pedrão");//substituição de cactere ou frase.
		s = s.concat("!!!");// para adicionar frase ou cactere na string.
		System.out.println(s); // Após mexer na string o valor final será todas as interações acima		
		
		// para alterar ou acrescentar condição no ato da declaração
		String x = "Marcelino".toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia X"
				.replace("X", "Amigão")
				.toUpperCase()
				.concat("!!!");
		System.out.println(y);
	}
}
