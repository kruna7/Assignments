package api;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DomaciBaza {

	// Napisati program koji iz baze pdoataka Banka.db ispisuje sve filijale, kao i
	// naziv mesta gde se nalaze.

	String connectionString;
	Connection connection;

	public DomaciBaza(String connectionString) {
		this.connectionString = connectionString;
	}

	void connect() throws SQLException {
		disconnect();
		connection = DriverManager.getConnection(connectionString);
	}

	private void disconnect() throws SQLException {
		if (connection != null && !connection.isClosed())
			connection.close();

	}

	public void prikaziFilijalu() throws SQLException {

		try (Connection connection = DriverManager.getConnection(connectionString);
				Statement statement = connection.createStatement()) {
			final ResultSet resultSet = statement.executeQuery(
					"SELECT Filijala.IdFil, Filijala.Naziv, Filijala.Adresa, Mesto.PostBr, Mesto.Naziv FROM Filijala INNER JOIN Mesto on Filijala.IdMes=Mesto.IdMes");

			while (resultSet.next()) {
				int idFil = resultSet.getInt(1);
				String naziv = resultSet.getString(2);
				String adresa = resultSet.getString(3);
				String postBr = resultSet.getString(4);
				String grad = resultSet.getString(5);

				System.out.println(idFil + "\t" + naziv + "\t" + adresa + "\t" + postBr + "\t" + grad);
			}

		}

	}
}
