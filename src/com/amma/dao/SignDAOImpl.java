package com.amma.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.amma.model.User;

@Repository("signDAO")
public class SignDAOImpl implements SignDAO {

	@Autowired
	private SessionFactory sessionFactory;
	@Transactional
	@Override
	public boolean dosign(User signbean) {
		
		try{
			
			sessionFactory.getCurrentSession().save(signbean);
			return true;
		}
		catch(Exception ex){
			return false;
		}
	}

}
