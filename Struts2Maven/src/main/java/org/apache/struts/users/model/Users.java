package org.apache.struts.users.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class Users {
	int id;
	int role_id;
	String username;
	String password;
	String name;
	String email;
	String website;
	String activation_key;
	int status;
	public Users(int id, int role_id, String username, String password, String name, String email, String website,
			String activation_key, int status) {
		super();
		this.id = id;
		this.role_id = role_id;
		this.username = username;
		this.password = password;
		this.name = name;
		this.email = email;
		this.website = website;
		this.activation_key = activation_key;
		this.status = status;
	}
	public Users(int id, int role_id, String username, String password, String name, String email, String website,
			int status) {
		super();
		this.id = id;
		this.role_id = role_id;
		this.username = username;
		this.password = password;
		this.name = name;
		this.email = email;
		this.website = website;
		this.status = status;
	}
	public Users() {
		super();
	}
	@Id
	@GeneratedValue
	@Column(name="id")	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(name="role_id")	
	public int getRole_id() {
		return role_id;
	}
	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}
	@Column(name="username")	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Column(name="password")
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Column(name="name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column(name="email")
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Column(name="website")
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	@Column(name="activation_key")
	public String getActivation_key() {
		return activation_key;
	}
	public void setActivation_key(String activation_key) {
		this.activation_key = activation_key;
	}
	@Column(name="status")
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	
}
