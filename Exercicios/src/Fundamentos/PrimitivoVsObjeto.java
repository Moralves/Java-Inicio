package Fundamentos;

public class PrimitivoVsObjeto {
	public static void main(String[] args) 
	{
		
		String s = new String ("Texto");//Uma String a ser lida
		s.toUpperCase();
		
		//Wrappers são a versão objeto dos tipos Primitivos !!
		int a = 123;
		System.out.println(a);
	    
	}

}
