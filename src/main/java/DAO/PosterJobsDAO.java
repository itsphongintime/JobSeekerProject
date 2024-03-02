package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import entity.SQLConnection;

public class PosterJobsDAO {
	public void updateJobPosters (int jobId, int userId) {
Connection connection = SQLConnection.makeConnection();
		
		String sqlQuery = "insert into jobseekersql.user (user_id, job_id) values (?,?)";

		PreparedStatement preStmt;
		try {
			preStmt = connection.prepareStatement(sqlQuery);
			preStmt.setInt(1, userId);
			preStmt.setInt(2, jobId);

			preStmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
