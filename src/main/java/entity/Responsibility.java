package entity;

import lombok.Data;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor

public class Responsibility {
	private int id;
	private String desc;
	private int jobId;
	
	public Responsibility() {
		// TODO Auto-generated constructor stub
	}
}
