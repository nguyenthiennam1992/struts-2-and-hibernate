package org.apache.struts.users.action;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.users.bo.UsersBO;
import org.apache.struts.users.bo.UsersBOImpl;
import org.apache.struts.users.model.Users;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
public class UsersAction extends ActionSupport implements ModelDriven<Users> {

	/**
	 * 
	 */
	
	private static final long serialVersionUID = -3954460550856091283L;

	public Users user = new Users();
	public List<Users> userList = new ArrayList<Users>();
	public UsersBO userDAO = new UsersBOImpl();
	public Users getModel() {
		return user;
	}
	public String saveOrUpdateUser(){
		userDAO.saveOrUpdateUser(user);
		return SUCCESS;
	}
	public String list() {
		userList = userDAO.listUser();
		return SUCCESS;
	}
	public String delete() {
		HttpServletRequest request = (HttpServletRequest)ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		userDAO.deleteUser(Long.parseLong(request.getParameter("id")));
		return SUCCESS;
	}
	public String edit() {
		HttpServletRequest request = (HttpServletRequest)ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		userDAO.deleteUser(Long.parseLong(request.getParameter("id")));
		return SUCCESS;
	}
	
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	public List<Users> getUserList() {
		return userList;
	}
	public void setUserList(List<Users> userList) {
		this.userList = userList;
	}
}
