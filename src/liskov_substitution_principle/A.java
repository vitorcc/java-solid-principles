package liskov_substitution_principle;

public class A implements Nomes{
	
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String imprimeNome() {
		return nome;		
	}

}
