package view;

import java.util.ArrayList;
import java.util.List;


import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import org.hibernate.Session;

import pojo.User;

import util.HibernateUtil;

import com.mysql.jdbc.Statement;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import dao.UserDAO;


public class UserAction extends ActionSupport implements ModelDriven{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4478674471813145685L;
	private User user;
	private List<User> users = new ArrayList<User>();
	
	public String execute(){
		return SUCCESS;
	}
	
	/*
	 * Dung de Xoa user
	 * @return String
	 */
	public String delete(){
		HttpServletRequest request = (HttpServletRequest)ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		int id = Integer.parseInt(request.getParameter("id"));
		// Delete user co id
		
		boolean rs = new UserDAO().delete(id);
		if(rs)
			return SUCCESS;
		return ERROR;
	}
	/*
	 * Dung de hien thi thong tin cua mot user thong qua id
	 * @return String
	 */
	public String edit(){
		HttpServletRequest request = (HttpServletRequest)ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		int id = Integer.parseInt(request.getParameter("id"));
		
		return SUCCESS;
	}
	
	/*
	 * Dung de luu hoac cap nhat user
	 * @return String
	 */
	public String saveOrUpdate(){
		return SUCCESS;
	}
	
	public String list(){
		// Lay danh sach user va them vao List users
		users = new UserDAO().getAllUser();
		return SUCCESS;
	}
	
	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public Object getModel() {
		// TODO Auto-generated method stub
		user = new User();
		return user;
	}
}
