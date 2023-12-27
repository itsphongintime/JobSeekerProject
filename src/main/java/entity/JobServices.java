package entity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class JobServices {	
	public Company getChosenJobCompany (int input) throws SQLException {
		Connection connection = SQLConnection.makeConnection();

		String sql = "select c.* from company c where c.id = ?";

		PreparedStatement preStmt = connection.prepareStatement(sql);
		
		preStmt.setInt(1, input);

		ResultSet resultSet = preStmt.executeQuery();

		Company company = new Company();
		company.setID(resultSet.getInt("ID"));
		company.setName(resultSet.getString("name"));
		company.setDetail(resultSet.getString("detail"));
		
		return company;
	}
	
	public ArrayList<Job> getAllJobs () throws SQLException {
		ArrayList<Job> jobs = new ArrayList<Job> ();
		
		Connection connection = SQLConnection.makeConnection();

		String sql = "select j.* from job j";

		PreparedStatement preStmt = connection.prepareStatement(sql);

		ResultSet resultSet = preStmt.executeQuery();

		while (resultSet.next()) {
			Job job = new Job();
			job.setID(resultSet.getInt("ID"));
			job.setTitle(resultSet.getString("title"));
			job.setType(resultSet.getString("nature"));
			job.setSalary(resultSet.getString("salary"));
			job.setLocation(resultSet.getString("location"));
			job.setVacancy(resultSet.getString("vacancy"));
			job.setPublishedDate(resultSet.getString("publishedDate"));
			job.setDescription(resultSet.getString("description"));
			job.setResponsibility(resultSet.getString("responsibility"));
			job.setQualifications(resultSet.getString("qualifications"));
			job.setCompany(getChosenJobCompany(resultSet.getInt("Company_ID")));
			
			jobs.add(job);
		}
		return jobs;
	}
	
	public Job getChosenJobDetails (int input) throws SQLException {
		Connection connection = SQLConnection.makeConnection();

		String sql = "select j.* from job j";

		PreparedStatement preStmt = connection.prepareStatement(sql);
		
		preStmt.setInt(1, input);

		ResultSet resultSet = preStmt.executeQuery();

		Job job = new Job();
		job.setID(resultSet.getInt("ID"));
		job.setTitle(resultSet.getString("title"));
		job.setType(resultSet.getString("nature"));
		job.setSalary(resultSet.getString("salary"));
		job.setLocation(resultSet.getString("location"));
		job.setVacancy(resultSet.getString("vacancy"));
		job.setPublishedDate(resultSet.getString("publishedDate"));
		job.setDescription(resultSet.getString("description"));
		job.setResponsibility(resultSet.getString("responsibility"));
		job.setQualifications(resultSet.getString("qualifications"));
		job.setCompany(getChosenJobCompany(resultSet.getInt("Company_ID")));
		
		return job;
	}
}
