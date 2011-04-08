package model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/*@Entity
@Table(name="CITY")*/
public class City {
	private int id;
	private String name;
	
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
}
