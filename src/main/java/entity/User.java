package entity;

import lombok.Data;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor

public class User {
	private int id;
	private String name;
	private String username;
	private String password;
	private String type;
	private String email;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String name, String username, String password, String type, String email) {
		super();
		this.name = name;
		this.username = username;
		this.password = password;
		this.type = type;
		this.email = email;
	}
}
