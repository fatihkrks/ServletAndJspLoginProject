package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import javax.sql.DataSource;

import model.User;

public class UserDAOImpl implements UserDAO {
	private static final String REGISTER = "insert into User(UserName,Name,Surname,Password) values (?,?,?,?)";
	private static final String LOGIN = "SELECT *FROM User  WHERE UserName=? and Password=?";

	public DataSource getDataSource() {
		ConnectionManager manager = new ConnectionManager();
		DataSource dataSource = manager.getMySqlDataSource();
		return dataSource;

	}

	@Override
	public void register(String username, String name, String surname,String password) {
		DataSource dataSource = getDataSource();
		try {
			Connection connection = dataSource.getConnection();
			PreparedStatement ps = connection.prepareStatement(REGISTER);
			ps.setString(1, username);
			ps.setString(2, name);
			ps.setString(3, surname);
			ps.setString(4, password);
		
			ps.executeUpdate();
			connection.close();

		} catch (Exception e) {
			System.err.println("An Error Occured!\n Error is:" + e);
		}

	}

	@Override
	public User query(String username, String password) {
		DataSource source = getDataSource();
		try {
			Connection connection = source.getConnection();
			PreparedStatement ps = connection.prepareStatement(LOGIN);
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet result = ps.executeQuery();
			User user = null;
			if (result.next()) {
				user = new User();
				user.setName(result.getString("name"));
				user.setUsername(username);
		
				user.setPassword(password);
			}
			connection.close();
			return user;

		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	}

	