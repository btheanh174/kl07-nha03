package action;

import java.util.ArrayList;
import java.util.List;

import service.CityService;
import service.UserService;
import service.impl.CityServiceImpl;
import service.impl.UserServiceImpl;

import model.City;
import model.User;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UserAction extends ActionSupport implements ModelDriven<User>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4146222217873245271L;
	private User user;
	private List<User> userList = new ArrayList<User>();
	private List<City> cities;
	
	UserService userService = new UserServiceImpl();
	CityService cityService = new CityServiceImpl();
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<User> getUserList() {
		return userList;
	}
	public void setUserList(List<User> userList) {
		this.userList = userList;
	}
	
	public List<City> getCities() {
		return cities;
	}
	public void setCities(List<City> cities) {
		this.cities = cities;
	}
	
	public String login(){
		if(getUser().getUserName().equals("admin") && getUser().getPassword().equals("admin")){
			return SUCCESS;
		}
		return ERROR;
	}
	public String register(){
		
		return SUCCESS;
	}
	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		cities = cityService.findAll();
		return SUCCESS;
	}
}
