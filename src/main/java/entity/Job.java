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

	public Job(String title, String type, String salary, String location, String vacancy, String publishedDate,
			String description, String responsibility, String qualifications, String logo, int companyId,
			int categoryId) {
		super();
		this.title = title;
		this.type = type;
		this.salary = salary;
		this.location = location;
		this.vacancy = vacancy;
		this.publishedDate = publishedDate;
		this.description = description;
		this.responsibility = responsibility;
		this.qualifications = qualifications;
		this.logo = logo;
		this.companyId = companyId;
		this.categoryId = categoryId;
	}
}
