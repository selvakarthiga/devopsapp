package com.amma.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.amma.model.User;

@Repository("loginDAO")
public class LoginDAOImpl implements LoginDAO {

	@Autowired
	private SessionFactory sessionFactory;
	@Transactional
	@Override
	public boolean dolog(User logbean) {	
		
		try{
			User obj=(User)sessionFactory.getCurrentSession().get("User.Class",logbean.getGmail());
			if(obj.getGmail()!=null){
				
				return true;
			}
			return false;
		}
		catch(Exception ex){
			return  true;}
	}

}
