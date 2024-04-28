package Fundamentos;

public class AreaCurcunferência 
{
	public static void main(String[] args) 
	{
//		syso + CTRL+M + ENTER
//		 System.out.println(2+3);
		double raio = 3.4;
		final double PI = 3.14159;// (final antes da variável) Para definir uma variável constante (sem possibilidade de alteração de valor
		System.out.println(PI * raio * raio);
		
		double area = PI*raio*raio;
		System.out.println(area);
		
		raio = 10;
		area = PI* raio * raio;
		System.out.println("Area = " + area);// Concatetizado por natureza

	}

}
