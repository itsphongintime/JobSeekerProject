package entity;

import lombok.Data;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor

public class Job {
	private int Id;
	private String title;
	private String type;
	private String salary;
	private String location;
	private String vacancy;
	private String publishedDate;
	private String description;
	private String responsibility;
	private String qualifications;
	private String logo;
	private int companyId;
	private int categoryId;
	
	public Job() {
		// TODO Auto-generated constructor stub
	}
}
