package Fundamentos.Operadores;

public class Logicos {
	public static void main(String[] args) {
		
		boolean condicao = true;	
		boolean condicao2 = 3>7;
		
		System.out.println(condicao && !condicao2);//NEGANDO A CONDIÇÃO FALSA P/TRUE
		System.out.println(condicao || condicao2);//OR
		System.out.println(condicao ^ condicao2);// OR EXCLUSIVO
		System.out.println(!!condicao);// Duplicando a negação da condição, a tornando verdadeira 
		System.out.println(! condicao2);
		
		System.out.println("\nTabela da verdade: AND");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println("\nTabela da verdade: OU");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("\nTabela da verdade: OU EXCLUSIVO");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		System.out.println("\nTabela da verdade: NOT");
		System.out.println(!true);
		System.out.println(!false);

	}

}
