package entity;

public class Company {
	private int ID;
	private String name;
	private String detail;
	
	public Company() {
		// TODO Auto-generated constructor stub
	}

	public Company(int iD, String name, String detail) {
		super();
		ID = iD;
		this.name = name;
		this.detail = detail;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}
	
}
