package model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CascadeType;

/*@Entity
@Table(name="USER_GROUP")*/
public class UserGroup {
	private int id;
	private String name;
	private String description;
	private Set<User> users = new HashSet<User>();
	
	/*@Id
	@GeneratedValue
	@Column(name="ID")*/
	int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	//@Column(name="NAME")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//@Column(name="DESCRIPTION")
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	//@OneToMany()
	public Set<User> getUsers() {
		return users;
	}
	public void setUsers(Set<User> users) {
		this.users = users;
	}
}
