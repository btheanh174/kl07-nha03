package service;

import java.util.List;

import model.User;

public interface UserService {
	public List<User> findAll();
	public User find(int id);
	public void save(User usr);
	public void remove(int id);
}
