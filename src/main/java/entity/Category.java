package entity;

import lombok.Data;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor

public class Category {
	int id;
	String name;
	String logo;
	int vacancy;
	
	public Category() {
		// TODO Auto-generated constructor stub
	}
}
