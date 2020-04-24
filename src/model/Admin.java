package model;

public class Admin {
	int id;
	String name;
	String surname;
	int sicilno;
	String password;
	String passwordagain;
	String department;
	String departmentManager;
	String role;
	String informationService;
	String travelservice;
	
	
	
	public Admin() {
		super();
	}
	public Admin(int id, String name, String surname, int sicilno, String password, String passwordagain,
			String department, String departmentManager, String role, String informationService, String travelservice) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.sicilno = sicilno;
		this.password = password;
		this.passwordagain = passwordagain;
		this.department = department;
		this.departmentManager = departmentManager;
		this.role = role;
		this.informationService = informationService;
		this.travelservice = travelservice;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getSicilno() {
		return sicilno;
	}
	public void setSicilno(int sicilno) {
		this.sicilno = sicilno;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPasswordagain() {
		return passwordagain;
	}
	public void setPasswordagain(String passwordagain) {
		this.passwordagain = passwordagain;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDepartmentManager() {
		return departmentManager;
	}
	public void setDepartmentManager(String departmentManager) {
		this.departmentManager = departmentManager;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getInformationService() {
		return informationService;
	}
	public void setInformationService(String informationService) {
		this.informationService = informationService;
	}
	public String getTravelservice() {
		return travelservice;
	}
	public void setTravelservice(String travelservice) {
		this.travelservice = travelservice;
	}
	

}
