package dependency_inversion_principle;

public class Main {

	public static void main(String[] args) {
		// 1. Módulos de alto nível não devem depender de módulos de baixo nível. 
		//Ambos devem depender da abstração.

		//2. Abstrações não devem depender de detalhes. 
		//Detalhes devem depender de abstrações.
		
		MySQLConnection mySQLConnection = new MySQLConnection();
		PostgresConnection postgresConnection = new PostgresConnection();
		
		PasswordReminder passwordReminder = new PasswordReminder();
		
		passwordReminder.connect(mySQLConnection);
		System.out.println(passwordReminder.getDbConnection());
		
		passwordReminder.connect(postgresConnection);
		System.out.println(passwordReminder.getDbConnection());
		

	}

}
