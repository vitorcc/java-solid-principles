package dependency_inversion_principle;

public class PasswordReminder {
	
	private String dbConnection;
	
	public void connect(DBConnectionInterface connectionInterface) {
		this.dbConnection = connectionInterface.connect();
	}

	public String getDbConnection() {
		return dbConnection;
	}

}
