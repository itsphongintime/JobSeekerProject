package entity;

public class Company {
	private int companyID;
	private String companyName;
	private String companyDetail;
	
	public Company() {
		// TODO Auto-generated constructor stub
	}

	public Company(int companyID, String companyName, String companyDetail) {
		super();
		this.companyID = companyID;
		this.companyName = companyName;
		this.companyDetail = companyDetail;
	}

	public int getCompanyID() {
		return companyID;
	}

	public void setCompanyID(int companyID) {
		this.companyID = companyID;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyDetail() {
		return companyDetail;
	}

	public void setCompanyDetail(String companyDetail) {
		this.companyDetail = companyDetail;
	}
	
	
}
