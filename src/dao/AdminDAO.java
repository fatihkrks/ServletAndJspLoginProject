package dao;

import model.Admin;

public interface AdminDAO {
	public void register(String name,String surname,int sicilno,String password,String passwordagain,String department,String departmentManager,String role,String informationService,String travelservice);
	public Admin query(int sicilno,String password );
}
