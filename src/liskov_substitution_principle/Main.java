package liskov_substitution_principle;

public class Main{	
	
	public static void main(String[] args) {
		
		/** 
		 * se S é um subtipo de T, então os objetos do tipo T, 
		 * em um programa, podem ser substituídos pelos objetos 
		 * de tipo S sem que seja necessário alterar as 
		 * propriedades deste programa
		 * 
		 * 
		 * Estamos passando como parâmetro tanto a classe pai como a 
		 * classe derivada e o código continua funcionando da forma esperada.
		 * 
		 * 
		 * 
		 * **/
		
		A classeA = new A();
		B classeB = new B();
		
		classeA.setNome("CLASSE A");
		classeB.setNome("CLASSE B");
		
		ImprimeNome imprimeNome = new ImprimeNome();
		
		System.out.println(imprimeNome.imprimeNome(classeB));
		System.out.println(imprimeNome.imprimeNome(classeA));
		
	}
}
