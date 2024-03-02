package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import entity.Job;
import entity.SQLConnection;
import entity.User;

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
	
	public Job registerNewJob(Job job) throws SQLException {
		Connection connection = SQLConnection.makeConnection();
		
		String sqlQuery = "insert into jobseekersql.job (title, type, salary, location, vacancy,"
				+ " publishedDate, description, responsibility, qualifications,"
				+ " logo, company_id, category_id) values (?,?,?,?,?,?,?,?,?,?,?,?)";

		PreparedStatement preStmt = connection.prepareStatement(sqlQuery);
		
		preStmt.setString(1, job.getTitle());
		preStmt.setString(2, job.getType());
		preStmt.setString(3, job.getSalary());
		preStmt.setString(4, job.getLocation());
		preStmt.setString(5, job.getVacancy());
		preStmt.setString(6, job.getPublishedDate());
		preStmt.setString(7, job.getDescription());
		preStmt.setString(8, job.getResponsibility());
		preStmt.setString(9, job.getQualifications());
		preStmt.setString(10, job.getLogo());
		
		String companyID = Integer.toString(job.getCompanyId());
		String categoryID = Integer.toString(job.getCategoryId());
		
		preStmt.setString(11, companyID);
		preStmt.setString(12, categoryID);

		preStmt.executeUpdate();
		
		Job mostRecent = getLatestJobPosted();
		
		return mostRecent;
	}
	
	public Job getLatestJobPosted() throws SQLException {
		Job job = new Job ();
		
		Connection connection = SQLConnection.makeConnection();

		String sql = "select j.* from jobseekersql.job j order by id desc limit 1";

		PreparedStatement preStmt = connection.prepareStatement(sql);

		ResultSet resultSet = preStmt.executeQuery();

		while (resultSet.next()) {
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
}
