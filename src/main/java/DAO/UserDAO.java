package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import entity.SQLConnection;
import entity.User;

public class UserDAO {
	public User loginVerification (String username, String password) throws SQLException {
		Connection connection = SQLConnection.makeConnection();
		
		PreparedStatement preStmt = null;
		
	    ResultSet resultSet = null;
	    
		String sql = "SELECT * FROM jobseekersql.user WHERE username = ?";
        
        preStmt = connection.prepareStatement(sql);
        
        preStmt.setString(1, username);

        resultSet = preStmt.executeQuery();
        
        String storedPassword = null;
        
        User user = new User();
        
        while (resultSet.next()) {
            storedPassword = resultSet.getString("password");

            if (storedPassword.equals(password)) {
                user = new User();
                user.setId(resultSet.getInt("id"));
                user.setName(resultSet.getString("name"));
                user.setUsername(resultSet.getString("username"));
                user.setPassword(resultSet.getString("password"));
                user.setType(resultSet.getString("type"));
                user.setEmail(resultSet.getString("email"));
    			
    			return user;
            }
        }
        return null;
	}
	
	public boolean checkForExistingAccountUsername(String username) throws SQLException {
		Connection connection = SQLConnection.makeConnection();
		
		String sql = "select count(*) from jobseekersql.user where username = ?";
		
		PreparedStatement preStmt = connection.prepareStatement(sql);
		
		preStmt.setString(1, username);
		
		ResultSet resultSet = preStmt.executeQuery();

		return resultSet.next() && resultSet.getInt(1) > 0;
	}
	
	public boolean checkForExistingAccountEmail(String email) throws SQLException {
		Connection connection = SQLConnection.makeConnection();
		
		String sql = "select count(*) from jobseekersql.user where email = ?";
		
		PreparedStatement preStmt = connection.prepareStatement(sql);
		
		preStmt.setString(1, email);
		
		ResultSet resultSet = preStmt.executeQuery();

		return resultSet.next() && resultSet.getInt(1) > 0;
	}
	
	public User registerNewAccount(User user) throws SQLException {
		Connection connection = SQLConnection.makeConnection();
		
		String sqlQuery = "insert into jobseekersql.user (name, username, password, type, email) values (?,?,?,?,?)";

		PreparedStatement preStmt = connection.prepareStatement(sqlQuery);
		
		preStmt.setString(1, user.getName());
		preStmt.setString(2, user.getUsername());
		preStmt.setString(3, user.getPassword());
		preStmt.setString(4, user.getType());
		preStmt.setString(5, user.getEmail());

		preStmt.executeUpdate();
		return user;
	}
}
