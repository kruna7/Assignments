package api;

import java.sql.SQLException;

public class GlavniDomaciBaza {

	public static void main(String[] args) throws SQLException {

		DomaciBaza database = new DomaciBaza("jdbc:sqlite:C:\\Users\\Ana\\Desktop\\JDBC_SQLite\\Banka.db");

		 database.prikaziFilijalu();
	}

}
