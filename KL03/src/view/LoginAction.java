package view;



import org.hibernate.Session;

import pojo.User;

import util.HibernateUtil;


import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6529203738240726257L;
	private String userName;
	private String password;
	private String message;
	
	public String execute(){
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		String uname = getUserName();
		String pwd = getPassword();
		
		//User user = (User) session.createQuery("from User where username = '" + uname + "' AND password = '" + pwd + "'").uniqueResult();
		User user = (User) session.createQuery("from User where username=:usn AND password=:pswd").setParameter("usn", uname).setParameter("pswd", pwd).uniqueResult();
		
		session.getTransaction().commit();
		
		if(user == null)
			return INPUT;
		return SUCCESS;
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

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
