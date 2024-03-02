package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import entity.Category;
import entity.SQLConnection;

public class CategoryDAO {
	public ArrayList<Category> getAllCategories () throws SQLException {
		ArrayList<Category> categories = new ArrayList<Category> ();
		
		Connection connection = SQLConnection.makeConnection();

		String sql = "select c.* from jobseekersql.category c";

		PreparedStatement preStmt = connection.prepareStatement(sql);

		ResultSet resultSet = preStmt.executeQuery();

		while (resultSet.next()) {
			Category category = new Category();
			category.setId(resultSet.getInt("id"));
			category.setName(resultSet.getString("name"));
			category.setLogo(resultSet.getString("logo"));
			category.setVacancy(resultSet.getInt("vacancy"));
			
			categories.add(category);
		}
		return categories;
	}
	
	public Category getChosenCategories (int input) throws SQLException {
		Connection connection = SQLConnection.makeConnection();

		String sql = "select c.* from jobseekersql.category c where id = ?";

		PreparedStatement preStmt = connection.prepareStatement(sql);
		
		preStmt.setInt(1, input);

		ResultSet resultSet = preStmt.executeQuery();
		
		if (resultSet.next()) {
			Category category = new Category();
			category.setId(resultSet.getInt("id"));
			category.setName(resultSet.getString("name"));
			category.setLogo(resultSet.getString("logo"));
			category.setVacancy(resultSet.getInt("vacancy"));
			return category;
		} else {
			return null;
		}
	}
}
