package org.apache.struts.users.bo;

import java.util.List;

import org.apache.struts.users.model.Users;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.googlecode.s2hibernate.struts2.plugin.annotations.SessionTarget;
import com.googlecode.s2hibernate.struts2.plugin.annotations.TransactionTarget;

public class UsersBOImpl implements UsersBO{
	@SessionTarget
	Session session;
	
	@TransactionTarget
	Transaction transaction;
	
	private static SessionFactory factory;
	public void saveOrUpdateUser(Users user) {
		Users use = new Users();
		factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = null;
			use.setName(user.getName());
			use.setEmail(user.getEmail());
			use.setPassword(user.getPassword());
			session.save(use);
			tx.commit();
	}
	public void deleteUser(Long userId) {
		try {
			Users user = session.get(Users.class, userId);
			session.delete(user);
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
	}
	@SuppressWarnings("unchecked")
	public List listUser(){
		factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = null;
			tx = session.beginTransaction();
			List courses = session.createQuery("from Users").list();
			tx.commit();
			return courses;
	}
	public Users listUserById(Long userId) {
		Users user = null;
		try {
			user = session.get(Users.class, userId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}
}
