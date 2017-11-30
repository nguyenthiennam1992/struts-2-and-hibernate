package org.apache.struts.users.model;
import java.util.Iterator;
import java.util.List;

import org.apache.struts.users.bo.UsersBO;
import org.apache.struts.users.bo.UsersBOImpl;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TesConnect {
	private static SessionFactory factory;
	public static void main(String[] args) {
		UsersBOImpl userDAO = new UsersBOImpl();
		// TODO Auto-generated method stub
		 
	         for (Iterator iterator = userDAO.listUser().iterator(); iterator.hasNext();){
	            Users user = (Users) iterator.next(); 
	            System.out.println("id: " + user.getId() ); 
	            System.out.println("id: " + user.getEmail() );
	            System.out.println("id: " + user.getName() ); 
	         }

	}

}
