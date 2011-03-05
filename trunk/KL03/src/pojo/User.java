package pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity
//@Table(name="USER")
public class User {
	
	private int id;
	private String userName;
	private String gender;
	private String password;
	private String about;
	private Address address;
	
	//@Id
	//@GeneratedValue
	//@Column(name="ID")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	//@Column(name="GENDER")
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	//@Column(name="ABOUT")
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	//@Column(name="USERNAME")
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Column(name="PASSWORD")
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(String userName, String gender, String password, String about, Address address) {
		super();
		this.userName = userName;
		this.gender = gender;
		this.password = password;
		this.about = about;
		this.address = address;
	}
	public User(int id, String userName, String password, String gender,
			String about, Address address) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.gender = gender;
		this.about = about;
		this.address = address;
	}
}
