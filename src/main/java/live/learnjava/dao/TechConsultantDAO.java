package live.learnjava.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import live.learnjava.db.Database;
import live.learnjava.db.Query;
import live.learnjava.model.TechConsultant;

public class TechConsultantDAO {

	public TechConsultant getTechConsultant(int theEid) throws Exception {
		Connection connection = null;
		TechConsultant tc = new TechConsultant();
		try {
			connection = Database.connect();
			String query = Query.readTechConsultant;
			PreparedStatement pstmt = connection.prepareStatement(query);
			pstmt.setInt(1, theEid);
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				tc.setId(rs.getInt("id"));
				tc.setName(rs.getString("name"));
				tc.setField(rs.getString("field"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		connection.close();
		return tc;
	}

}
