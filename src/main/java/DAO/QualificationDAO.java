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
	
	public void registerNewQualifications(String[] qualifications, int jobId) throws SQLException {
	    Connection connection = SQLConnection.makeConnection();
	    
	    // The base SQL query for inserting qualifications
	    String sqlQuery = "INSERT INTO jobseekersql.qualification (description, job_id) VALUES ";

	    // Building the part of the query that holds the placeholders for the values
	    StringBuilder placeholders = new StringBuilder();
	    for (int i = 0; i < qualifications.length; i++) {
	        placeholders.append("(?, ?)");
	        if (i < qualifications.length - 1) {
	            placeholders.append(", ");
	        }
	    }

	    // Finalize the SQL query
	    sqlQuery += placeholders;

	    PreparedStatement preStmt = connection.prepareStatement(sqlQuery);
	    
	    // Loop through the qualifications array and set each value in the PreparedStatement
	    
	    int index = 1;
	    for (String qualification : qualifications) {
	        preStmt.setString(index++, qualification); // Set description
	        preStmt.setInt(index++, jobId);             // Set job_id
	    }

	    // Execute the update
	    preStmt.executeUpdate();
	}
}
