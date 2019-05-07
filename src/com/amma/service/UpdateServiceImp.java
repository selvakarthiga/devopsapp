package com.amma.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.amma.dao.UpdateDAO;
import com.amma.model.Flower;

@Service("updateService")
public class UpdateServiceImp implements UpdateService {
	
	@Autowired
	private UpdateDAO updateDAO;
	@Transactional
	@Override
	public boolean doupdate(Flower updatebean) {
		// TODO Auto-generated method stub
		return updateDAO.doupdate(updatebean);
	}

}
