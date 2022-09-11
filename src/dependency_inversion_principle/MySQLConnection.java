package dependency_inversion_principle;

public class MySQLConnection implements DBConnectionInterface {

	@Override
	public String connect() {
		return "Conectado ao MySQLConnection";		
	}

}
