package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;

import model.Admin;

public class AdminDAOImpl implements AdminDAO{
private static final String REGISTER="insert into admin(name,surname,sicilno,password,passwordagain,department,departmentManager,role,informationService,travelservice) values (?,?,?,?,?,?,?,?,?,?) ";
private static final String LOGIN="Select * from admin where sicilno=? and password=? ";	
public DataSource getDataSource() {
		ConnectionManager manager = new ConnectionManager();
		DataSource dataSource = manager.getMySqlDataSource();
		return dataSource;}
	
	@Override
	public void register(String name, String surname, int sicilno, String password, String passwordagain,
			String department, String departmentManager, String role, String informationService, String travelservice) {
		DataSource source=getDataSource();
		try {
			Connection connection=source.getConnection();
			PreparedStatement ps=connection.prepareStatement(REGISTER);
			ps.setString(1,name );
			ps.setString(2,surname );
			ps.setInt(3, sicilno);
			ps.setString(4, password);
			ps.setString(5,passwordagain );
			ps.setString(6, department);
			ps.setString(7,departmentManager );
			ps.setString(8,role );
			ps.setString(9,informationService );
			ps.setString(10, travelservice);
			
			ps.executeUpdate();
			connection.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	@Override
	public Admin query(int sicilno, String password) {
		DataSource source=getDataSource();
		try {
			Connection connection=source.getConnection();
			PreparedStatement ps=connection.prepareStatement(LOGIN);
			ps.setInt(1, sicilno);
			ps.setString(2, password);
			ResultSet result=ps.executeQuery();
			Admin admin=null;
			if (result.next()) {
				admin=new Admin();
				admin.setSicilno(sicilno);
				admin.setPassword(password);
				admin.setName(result.getString("name"));
				admin.setSurname(result.getString("surname"));
			}
			
			connection.close();
			return admin;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
		
	}

}
