package view;

import pojo.Address;
import pojo.User;


import com.opensymphony.xwork2.ActionSupport;

import dao.UserDAO;

public class RegisterAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userName;
	private String password;
	private String gender;
	private String about;
	private String street;
	private String district;
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		
		String uname = getUserName();
		String pwd = getPassword();
		String gen = getGender();
		String abt = getAbout();
		Address add = new Address(getStreet(), getDistrict());
		
		
		User user = new User(uname, gen, pwd, abt, add);
		boolean rs = new UserDAO().insert(user);	
		if(rs)
			return SUCCESS;
		else
			return ERROR;
	}
	
	
	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public String getDistrict() {
		return district;
	}


	public void setDistrict(String district) {
		this.district = district;
	}

	
}
