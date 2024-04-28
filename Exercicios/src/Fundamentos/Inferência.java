package Fundamentos;

public class Inferência {
	public static void main(String[] args) {
		double a = 4.5;
		System.out.println(a);
		//
		var b = 5/9.0; // O (var + variável) traduz os dados e infere(converte) o tipo da variável
		System.out.println(b);
		var c = "Texto demonstrativo";
		System.out.println(c);
		
		double e;
		e = 123.65;
		System.out.println(e);
		//não é possível também, mudar o tipo da "variável" "var" após a primeira declaração
		// Erro, pois a funcionalidade "var" exige a inicialização da variável no momento da declaração. 
		
	}
}
