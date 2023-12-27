package entity;

public class Job {
	private int ID;
	private String title;
	private String type;
	private String salary;
	private String location;
	private String vacancy;
	private String publishedDate;
	private String description;
	private String responsibility;
	private String qualifications;
	private Company company;
	
	public Job() {
		// TODO Auto-generated constructor stub
	}

	public Job(int iD, String title, String type, String salary, String location, String vacancy,
			String publishedDate, String description, String responsibility, String qualifications, Company company) {
		super();
		ID = iD;
		this.title = title;
		this.type = type;
		this.salary = salary;
		this.location = location;
		this.vacancy = vacancy;
		this.publishedDate = publishedDate;
		this.description = description;
		this.responsibility = responsibility;
		this.qualifications = qualifications;
		this.company = company;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getVacancy() {
		return vacancy;
	}

	public void setVacancy(String vacancy) {
		this.vacancy = vacancy;
	}

	public String getPublishedDate() {
		return publishedDate;
	}

	public void setPublishedDate(String publishedDate) {
		this.publishedDate = publishedDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getResponsibility() {
		return responsibility;
	}

	public void setResponsibility(String responsibility) {
		this.responsibility = responsibility;
	}

	public String getQualifications() {
		return qualifications;
	}

	public void setQualifications(String qualifications) {
		this.qualifications = qualifications;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	
}
