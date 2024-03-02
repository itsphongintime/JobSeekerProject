package entity;


import lombok.Data;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor

public class Company {
	private int id;
	private String name;
	private String logo;
	private String details;
	
	public Company() {
		// TODO Auto-generated constructor stub
	}
}
