package entity;

public class Job {
	private int jobID;
	private String jobTitle;
	private String jobNature;
	private String jobSalary;
	private String jobLocation;
	private String jobVacancy;
	private String publishedDate;
	private String jobDescription;
	private String jobResponsibility;
	private String jobQualifications;
	private int companyID;
	
	public Job() {
		// TODO Auto-generated constructor stub
	}

	public Job(int jobID, String jobTitle, String jobNature, String jobSalary, String jobLocation, String jobVacancy,
			String publishedDate, String jobDescription, String jobResponsibility, String jobQualifications,
			int companyID) {
		super();
		this.jobID = jobID;
		this.jobTitle = jobTitle;
		this.jobNature = jobNature;
		this.jobSalary = jobSalary;
		this.jobLocation = jobLocation;
		this.jobVacancy = jobVacancy;
		this.publishedDate = publishedDate;
		this.jobDescription = jobDescription;
		this.jobResponsibility = jobResponsibility;
		this.jobQualifications = jobQualifications;
		this.companyID = companyID;
	}

	public int getJobID() {
		return jobID;
	}

	public void setJobID(int jobID) {
		this.jobID = jobID;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getJobNature() {
		return jobNature;
	}

	public void setJobNature(String jobNature) {
		this.jobNature = jobNature;
	}

	public String getJobSalary() {
		return jobSalary;
	}

	public void setJobSalary(String jobSalary) {
		this.jobSalary = jobSalary;
	}

	public String getJobLocation() {
		return jobLocation;
	}

	public void setJobLocation(String jobLocation) {
		this.jobLocation = jobLocation;
	}

	public String getJobVacancy() {
		return jobVacancy;
	}

	public void setJobVacancy(String jobVacancy) {
		this.jobVacancy = jobVacancy;
	}

	public String getPublishedDate() {
		return publishedDate;
	}

	public void setPublishedDate(String publishedDate) {
		this.publishedDate = publishedDate;
	}

	public String getJobDescription() {
		return jobDescription;
	}

	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}

	public String getJobResponsibility() {
		return jobResponsibility;
	}

	public void setJobResponsibility(String jobResponsibility) {
		this.jobResponsibility = jobResponsibility;
	}

	public String getJobQualifications() {
		return jobQualifications;
	}

	public void setJobQualifications(String jobQualifications) {
		this.jobQualifications = jobQualifications;
	}

	public int getCompanyID() {
		return companyID;
	}

	public void setCompanyID(int companyID) {
		this.companyID = companyID;
	}
	
	
}
