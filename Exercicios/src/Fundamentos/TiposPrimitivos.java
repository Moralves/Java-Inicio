package Fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		
		//tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L;
		
		//Tipos numéricos Reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		//tipo booleano
		boolean estaDeFerias = false; //True
		
		//Tipo caractere
		char status = 'A'; //ativo
		
		//Dias de Empresa 
		System.out.println(anosDeEmpresa * 365);
		
		//Numeros de Viagens, ida e volta se torna 1
		System.out.println(numeroDeVoos / 2);
		
		//Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		System.out.println(id+"ganha ->" + salario);
		System.out.println("Ferias?" + estaDeFerias);
		
		
		
	}

}
