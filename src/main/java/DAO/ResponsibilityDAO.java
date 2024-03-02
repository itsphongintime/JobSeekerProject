package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import entity.Responsibility;
import entity.SQLConnection;

public class ResponsibilityDAO {
	public ArrayList<Responsibility> getJobResponsibilities (int input) throws SQLException {
		ArrayList<Responsibility> responsibilities = new ArrayList<Responsibility> ();
		
		Connection connection = SQLConnection.makeConnection();

		String sql = "select r.* from jobseekersql.responsibility r where job_id = ?";

		PreparedStatement preStmt = connection.prepareStatement(sql);
		
		preStmt.setInt(1, input);

		ResultSet resultSet = preStmt.executeQuery();

		while (resultSet.next()) {
			Responsibility responsibility = new Responsibility();
			responsibility.setId(resultSet.getInt("id"));
			responsibility.setDesc(resultSet.getString("description"));
			responsibility.setJobId(resultSet.getInt("job_id"));
			
			responsibilities.add(responsibility);
		}
		return responsibilities;
	}
}
