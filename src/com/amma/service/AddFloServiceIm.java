package com.amma.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.amma.dao.AddFloDAO;
import com.amma.model.Flower;

@Service("addFloService")
public class AddFloServiceIm implements AddFloService {

	@Autowired
	private AddFloDAO addFloDAO;
	@Transactional
	@Override
	public boolean doaddflo(Flower addbean) {
		// TODO Auto-generated method stub
		return  addFloDAO.doaddflow(addbean);
	}

}
