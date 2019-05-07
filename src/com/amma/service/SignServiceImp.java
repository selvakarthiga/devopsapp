package com.amma.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.amma.dao.SignDAO;
import com.amma.model.User;

@Service("signService")
public class SignServiceImp implements SignService {

	
	@Autowired
	private SignDAO signDAO;
	@Transactional
	@Override
	public boolean dosign(User signbean) {
		// TODO Auto-generated method stub
		return signDAO.dosign(signbean);
	}
	
	

}
