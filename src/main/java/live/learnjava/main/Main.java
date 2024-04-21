package live.learnjava.main;

import live.learnjava.db.Database;

public class Main {
	//This main class is just to test database connectivity
	public static void main(String[] args) throws Exception {
		//test database connection
		Database.connect();
	}
}
