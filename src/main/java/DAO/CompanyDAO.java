package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import entity.Company;
import entity.SQLConnection;

public class CompanyDAO {
	public ArrayList<Company> getAllCompanies () throws SQLException {
		ArrayList<Company> companies = new ArrayList<Company> ();
		
		Connection connection = SQLConnection.makeConnection();

		String sql = "select c.* from jobseekersql.company c";

		PreparedStatement preStmt = connection.prepareStatement(sql);

		ResultSet resultSet = preStmt.executeQuery();

		while (resultSet.next()) {
			Company company = new Company();
			company.setId(resultSet.getInt("id"));
			company.setName(resultSet.getString("name"));
			company.setLogo(resultSet.getString("logo"));
			company.setDetails(resultSet.getString("details"));
			
			companies.add(company);
		}
		return companies;
	}
	
	public Company getChosenCompany (int input) throws SQLException {
		Connection connection = SQLConnection.makeConnection();

		String sql = "select c.* from jobseekersql.company c where id = ?";

		PreparedStatement preStmt = connection.prepareStatement(sql);
		
		preStmt.setInt(1, input);

		ResultSet resultSet = preStmt.executeQuery();

		if (resultSet.next()) {
	        Company company = new Company();
	        company.setId(resultSet.getInt("id"));
	        company.setName(resultSet.getString("name"));
	        company.setLogo(resultSet.getString("logo"));
	        company.setDetails(resultSet.getString("details"));
	        
	        return company;
		} else {
			return null;
		}
	}
}
