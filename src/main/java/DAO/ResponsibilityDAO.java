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
	
	public void registerNewResponsibilities(String[] responsibilities, int jobId) throws SQLException {
	    Connection connection = SQLConnection.makeConnection();
	    
	    // The base SQL query for inserting responsibilities
	    String sqlQuery = "INSERT INTO jobseekersql.responsibility (description, job_id) VALUES ";

	 // Building the part of the query that holds the placeholders for the values
	    StringBuilder placeholders = new StringBuilder();
	    for (int i = 0; i < responsibilities.length; i++) {
	        placeholders.append("(?, ?)");
	        if (i < responsibilities.length - 1) {
	            placeholders.append(", ");
	        }
	    }

	    // Finalize the SQL query
	    sqlQuery += placeholders;

	    PreparedStatement preStmt = connection.prepareStatement(sqlQuery);
	    
	    // Loop through the responsibilities array and set each value in the PreparedStatement
	    
	    int index = 1;
	    for (String responsibility : responsibilities) {
	        preStmt.setString(index++, responsibility); // Set description
	        preStmt.setInt(index++, jobId);             // Set job_id
	    }

	    // Execute the update
	    preStmt.executeUpdate();
	}
}
