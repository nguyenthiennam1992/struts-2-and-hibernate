package org.apache.struts.users.bo;

import java.util.List;

import org.apache.struts.users.model.Users;

public interface UsersBO {
	public void saveOrUpdateUser(Users user);
	public List<Users> listUser();
	public Users listUserById(Long userId);
	public void deleteUser(Long userId);
}
