package entity;

import lombok.Data;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor

public class Qualification {
	private int id;
	private String desc;
	private int jobId;
	
	public Qualification() {
		// TODO Auto-generated constructor stub
	}
}
