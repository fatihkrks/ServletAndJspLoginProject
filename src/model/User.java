package model;

public class User{
	int id;
	String username;
	String name;
	String surname;
	String password;
	
	
	
	public User() {
		super();
	}
	public User(int id, String username, String name, String surname, String password) {
		super();
		this.id = id;
		this.username = username;
		this.name = name;
		this.surname = surname;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}