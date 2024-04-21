package live.learnjava.db;

import java.sql.Connection;
import java.sql.DriverManager;


public class Database {

	public static Connection connect() throws Exception {
		Connection connection = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/";
			String user = "root";
			String pass = "Guruji123$";
			String db = "tech_consultant";

			connection = DriverManager.getConnection(url + db, user, pass);
			if (connection != null) {
				System.out.println("Successfully connected to database: " + db);
			}

		} catch (Exception e) {
			System.out.println("An error occurred while connecting MySQL database");
			e.printStackTrace();
		}

		return connection;
	}

}
