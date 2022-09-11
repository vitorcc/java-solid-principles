package dependency_inversion_principle;

public class PostgresConnection implements DBConnectionInterface {

	@Override
	public String connect() {
		return "Conectado ao PostgresConnection";		
	}

}
