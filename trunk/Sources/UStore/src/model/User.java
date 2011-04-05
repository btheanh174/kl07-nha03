package model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/*@Entity
@Table(name="USER")*/
public class User {
	private int id;
	private String name;
	private String userName;
	private String password;
	private String email;
	private Date birthDate;
	private String phone;
	private City city;
	private UserGroup group;
	
	/*@Id
	@Column(name="ID")
	@GeneratedValue*/
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	/*@Column(name="NAME")*/
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	/*@Column(name="USERNAME")*/
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/*@Column(name="PASSWORD")*/
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	/*@Column(name="EMAIL")*/
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	/*@Column(name="BIRTHDATE")*/
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	/*@Column(name="PHONE")*/
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/*@ManyToOne(cascade=CascadeType.ALL)*/
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	public UserGroup getGroup() {
		return group;
	}
	public void setGroup(UserGroup group) {
		this.group = group;
	}
}
