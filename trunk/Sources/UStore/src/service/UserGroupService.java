package service;

import java.util.List;

import model.UserGroup;

public interface UserGroupService {
	public List<UserGroup> findAll();
	public void save(UserGroup ug);
	public void remove(int id);
}
