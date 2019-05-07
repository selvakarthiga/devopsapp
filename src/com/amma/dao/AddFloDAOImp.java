package com.amma.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.amma.model.Flower;

@Repository("addFloDAO")
public class AddFloDAOImp implements AddFloDAO {

	@Autowired
	private SessionFactory sessionFactory;
	@Transactional
	@Override
	public boolean doaddflow(Flower addbean) {
			
			sessionFactory.getCurrentSession().save(addbean);
			return true;
		
	}

}
