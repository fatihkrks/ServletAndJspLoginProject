package dao;

import java.util.List;


import model.User;

public interface UserDAO {
	public void register(String username, String name, String surname,String password);
	public User query(String username,String password );

}
