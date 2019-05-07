package com.amma.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.amma.dao.LoginDAO;
import com.amma.model.User;

@Service("loginService")
public class LoginServiceImp implements LoginService {

	@Autowired
	private LoginDAO loginDAO;
	@Transactional
	@Override
	public boolean dolog(User logbean) {
		// TODO Auto-generated method stub
		return loginDAO.dolog(logbean);
	}

}
