package liskov_substitution_principle;

public class ImprimeNome{
	
	public String imprimeNome(Nomes nomes) {
		return nomes.imprimeNome();
	}

}
