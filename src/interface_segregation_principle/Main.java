package interface_segregation_principle;

public class Main {
	
	public static void main(String[] args) {
		
		//Princípio da Segregação da Interface — 
		//Uma classe não deve ser forçada a implementar interfaces 
		//e métodos que não irão utilizar.
		
		Urubu urubu = new Urubu();
		Pinguim pinguim = new Pinguim();
		
		urubu.setAltitude(1000);
		urubu.setLocalizacao(1424, 1251512);
		urubu.renderizar();
		
		pinguim.setLocalizacao(12412,7777);
		pinguim.renderizar();
		
		
		
	}
}
