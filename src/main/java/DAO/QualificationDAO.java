package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import entity.Qualification;
import entity.SQLConnection;

public class QualificationDAO {
	public ArrayList<Qualification> getJobQualifications (int input) throws SQLException {
		ArrayList<Qualification> qualifications = new ArrayList<Qualification> ();
		
		Connection connection = SQLConnection.makeConnection();

		String sql = "select q.* from jobseekersql.qualification q where job_id = ?";

		PreparedStatement preStmt = connection.prepareStatement(sql);
		
		preStmt.setInt(1, input);

		ResultSet resultSet = preStmt.executeQuery();

		while (resultSet.next()) {
			Qualification qualification = new Qualification();
			qualification.setId(resultSet.getInt("id"));
			qualification.setDesc(resultSet.getString("description"));
			qualification.setJobId(resultSet.getInt("job_id"));
			
			qualifications.add(qualification);
		}
		return qualifications;
	}
}
