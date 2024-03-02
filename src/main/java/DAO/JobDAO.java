package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import entity.Job;
import entity.SQLConnection;

public class JobDAO {		
	public ArrayList<Job> getAllJobs () throws SQLException {
		ArrayList<Job> jobs = new ArrayList<Job> ();
		
		Connection connection = SQLConnection.makeConnection();

		String sql = "select j.* from jobseekersql.job j";

		PreparedStatement preStmt = connection.prepareStatement(sql);

		ResultSet resultSet = preStmt.executeQuery();

		while (resultSet.next()) {
			Job job = new Job();
			job.setId(resultSet.getInt("id"));
			job.setTitle(resultSet.getString("title"));
			job.setType(resultSet.getString("type"));
			job.setSalary(resultSet.getString("salary"));
			job.setLocation(resultSet.getString("location"));
			job.setVacancy(resultSet.getString("vacancy"));
			job.setPublishedDate(resultSet.getString("publishedDate"));
			job.setDescription(resultSet.getString("description"));
			job.setResponsibility(resultSet.getString("responsibility"));
			job.setQualifications(resultSet.getString("qualifications"));
			job.setLogo(resultSet.getString("logo"));
			job.setCompanyId(resultSet.getInt("company_id"));
			job.setCategoryId(resultSet.getInt("category_id"));
			
			jobs.add(job);
		}
		return jobs;
	}
	
	public Job getChosenJobDetails (int input) throws SQLException {
		Connection connection = SQLConnection.makeConnection();

		String sql = "select j.* from jobseekersql.job j where id = ?";

		PreparedStatement preStmt = connection.prepareStatement(sql);
		
		preStmt.setInt(1, input);

		ResultSet resultSet = preStmt.executeQuery();

		while (resultSet.next()) {
			Job job = new Job();
			job.setId(resultSet.getInt("id"));
			job.setTitle(resultSet.getString("title"));
			job.setType(resultSet.getString("type"));
			job.setSalary(resultSet.getString("salary"));
			job.setLocation(resultSet.getString("location"));
			job.setVacancy(resultSet.getString("vacancy"));
			job.setPublishedDate(resultSet.getString("publishedDate"));
			job.setDescription(resultSet.getString("description"));
			job.setResponsibility(resultSet.getString("responsibility"));
			job.setQualifications(resultSet.getString("qualifications"));
			job.setLogo(resultSet.getString("logo"));
			job.setCompanyId(resultSet.getInt("company_id"));
			job.setCategoryId(resultSet.getInt("category_id"));
			
			return job;
		}
		return null;
	}
	
	public ArrayList<Job> getChosenJobByCategory (int input) throws SQLException {
		ArrayList<Job> jobs = new ArrayList<Job> ();
		
		Connection connection = SQLConnection.makeConnection();

		String sql = "select j.* from jobseekersql.job j where category_id = ?";

		PreparedStatement preStmt = connection.prepareStatement(sql);
		
		preStmt.setInt(1, input);

		ResultSet resultSet = preStmt.executeQuery();

		while (resultSet.next()) {
			Job job = new Job();
			job.setId(resultSet.getInt("id"));
			job.setTitle(resultSet.getString("title"));
			job.setType(resultSet.getString("type"));
			job.setSalary(resultSet.getString("salary"));
			job.setLocation(resultSet.getString("location"));
			job.setVacancy(resultSet.getString("vacancy"));
			job.setPublishedDate(resultSet.getString("publishedDate"));
			job.setDescription(resultSet.getString("description"));
			job.setResponsibility(resultSet.getString("responsibility"));
			job.setQualifications(resultSet.getString("qualifications"));
			job.setLogo(resultSet.getString("logo"));
			job.setCompanyId(resultSet.getInt("company_id"));
			job.setCategoryId(resultSet.getInt("category_id"));
			
			jobs.add(job);
		}
		return jobs;
	}
	
	public ArrayList<Job> getLatestJobs () throws SQLException {
		ArrayList<Job> jobs = new ArrayList<Job> ();
		
		Connection connection = SQLConnection.makeConnection();

		String sql = "select j.* from jobseekersql.job j order by id desc limit 5";

		PreparedStatement preStmt = connection.prepareStatement(sql);

		ResultSet resultSet = preStmt.executeQuery();

		while (resultSet.next()) {
			Job job = new Job();
			job.setId(resultSet.getInt("id"));
			job.setTitle(resultSet.getString("title"));
			job.setType(resultSet.getString("type"));
			job.setSalary(resultSet.getString("salary"));
			job.setLocation(resultSet.getString("location"));
			job.setVacancy(resultSet.getString("vacancy"));
			job.setPublishedDate(resultSet.getString("publishedDate"));
			job.setDescription(resultSet.getString("description"));
			job.setResponsibility(resultSet.getString("responsibility"));
			job.setQualifications(resultSet.getString("qualifications"));
			job.setLogo(resultSet.getString("logo"));
			job.setCompanyId(resultSet.getInt("company_id"));
			job.setCategoryId(resultSet.getInt("category_id"));
			
			jobs.add(job);
		}
		return jobs;
	}
	
	public ArrayList<Job> getFullTimeJobs () throws SQLException {
		ArrayList<Job> jobs = new ArrayList<Job> ();
		
		Connection connection = SQLConnection.makeConnection();

		String sql = "select j.* from jobseekersql.job j where type = ? order by id desc limit 5";

		PreparedStatement preStmt = connection.prepareStatement(sql);
		
		preStmt.setString(1, "FULL TIME");

		ResultSet resultSet = preStmt.executeQuery();

		while (resultSet.next()) {
			Job job = new Job();
			job.setId(resultSet.getInt("id"));
			job.setTitle(resultSet.getString("title"));
			job.setType(resultSet.getString("type"));
			job.setSalary(resultSet.getString("salary"));
			job.setLocation(resultSet.getString("location"));
			job.setVacancy(resultSet.getString("vacancy"));
			job.setPublishedDate(resultSet.getString("publishedDate"));
			job.setDescription(resultSet.getString("description"));
			job.setResponsibility(resultSet.getString("responsibility"));
			job.setQualifications(resultSet.getString("qualifications"));
			job.setLogo(resultSet.getString("logo"));
			job.setCompanyId(resultSet.getInt("company_id"));
			job.setCategoryId(resultSet.getInt("category_id"));
			
			jobs.add(job);
		}
		return jobs;
	}
	
	public ArrayList<Job> getPartTimeJobs () throws SQLException {
		ArrayList<Job> jobs = new ArrayList<Job> ();
		
		Connection connection = SQLConnection.makeConnection();

		String sql = "select j.* from jobseekersql.job j where type = ? order by id desc limit 5";

		PreparedStatement preStmt = connection.prepareStatement(sql);
		
		preStmt.setString(1, "PART TIME");

		ResultSet resultSet = preStmt.executeQuery();

		while (resultSet.next()) {
			Job job = new Job();
			job.setId(resultSet.getInt("id"));
			job.setTitle(resultSet.getString("title"));
			job.setType(resultSet.getString("type"));
			job.setSalary(resultSet.getString("salary"));
			job.setLocation(resultSet.getString("location"));
			job.setVacancy(resultSet.getString("vacancy"));
			job.setPublishedDate(resultSet.getString("publishedDate"));
			job.setDescription(resultSet.getString("description"));
			job.setResponsibility(resultSet.getString("responsibility"));
			job.setQualifications(resultSet.getString("qualifications"));
			job.setLogo(resultSet.getString("logo"));
			job.setCompanyId(resultSet.getInt("company_id"));
			job.setCategoryId(resultSet.getInt("category_id"));
			
			jobs.add(job);
		}
		return jobs;
	}
	
	public ArrayList<Job> getPosterJobs (int posterId) throws SQLException {
		ArrayList<Job> jobs = new ArrayList<Job> ();
		
		Connection connection = SQLConnection.makeConnection();

		String sql = "select * from jobseekersql.job j join jobseekersql.poster_job p on j.id = p.job_id where p.user_id = ?";

		PreparedStatement preStmt = connection.prepareStatement(sql);
		
		preStmt.setInt(1, posterId);

		ResultSet resultSet = preStmt.executeQuery();

		while (resultSet.next()) {
			Job job = new Job();
			job.setId(resultSet.getInt("id"));
			job.setTitle(resultSet.getString("title"));
			job.setType(resultSet.getString("type"));
			job.setSalary(resultSet.getString("salary"));
			job.setLocation(resultSet.getString("location"));
			job.setVacancy(resultSet.getString("vacancy"));
			job.setPublishedDate(resultSet.getString("publishedDate"));
			job.setDescription(resultSet.getString("description"));
			job.setResponsibility(resultSet.getString("responsibility"));
			job.setQualifications(resultSet.getString("qualifications"));
			job.setLogo(resultSet.getString("logo"));
			job.setCompanyId(resultSet.getInt("company_id"));
			job.setCategoryId(resultSet.getInt("category_id"));
			
			jobs.add(job);
		}
		return jobs;
	}
}
