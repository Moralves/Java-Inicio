package Fundamentos;

public class ConversaoPrimitivosNumerico {
	
	public static void main(String[] args) 
	{
		double a = 1; // Conversão Implícita - CERTEZA QUE NAO DA MERDA
		
		float b = (float) 1.1234; /*Conversão de dado double para float.
		Vai converter explicitamente, e se tiver possibilidade de perder
		dados você perderá (CAST)*/ 
		System.out.println(b);
		
		int c = 4;
		byte d = (byte) c; // Conversão de byte para int se garantindo de que o valor vaia até 127
		//Se não vai da merda. (CAST)
		
		double e = 1;
		int f = (int) e; // (CAST) PARA REALIZAR CONVERSÃO ACREDITANDO NO SEU POTENCIAL.
		
	}

}
