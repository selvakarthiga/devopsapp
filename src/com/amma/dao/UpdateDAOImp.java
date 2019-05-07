package com.amma.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.amma.model.Flower;

@Repository("updateDAO")
public class UpdateDAOImp implements UpdateDAO {
	@Autowired
	private SessionFactory sessionFactory;
	@Transactional
	@Override
	public boolean doupdate(Flower updatebean) {
		
		try{
			
			sessionFactory.getCurrentSession().saveOrUpdate(updatebean);
			return true;
		}
		catch(Exception ex){
			return false;
		}
	}
	

	
}
