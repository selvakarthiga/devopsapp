package com.amma.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.amma.model.Flower;
import com.amma.model.User;
import com.amma.service.AddFloService;
import com.amma.service.LoginService;
import com.amma.service.SignService;
import com.amma.service.UpdateService;

@Controller
public class shopController {
	
	@Autowired
	private LoginService loginService;
	@Autowired
	private SignService signService;
	@Autowired
	private AddFloService addFloService;
	@Autowired
	private UpdateService updateService;
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public ModelAndView doStart(){
		return new ModelAndView("index");
	}

	
	@RequestMapping(value="/chk",method=RequestMethod.POST)
	public String doLog(@ModelAttribute User logbean){
		
		if(loginService.dolog(logbean)){
		return "option";}
		
		return "index";
		
	}
	
	
	
	@RequestMapping(value="/newUser")
	public String doSign(){
		return "sign";
	}
	
	
	@RequestMapping(value="/sign",method=RequestMethod.POST)
	public String doSign(@ModelAttribute User signbean){
		
		if(signService.dosign(signbean)){
			return "index";
		}
		return "sign";
	}
	
	
	

	@RequestMapping(value="/addFlower")
	public String doaddFlo(){
		return "Add";
	}
	

	@RequestMapping(value="/updateFlower")
	public String dodelFlo(){
		return "Update";
	}
	
	@RequestMapping(value="/flower",method=RequestMethod.POST)
	public String doaddFlower(@ModelAttribute Flower addbean)
	{
		
		if(addFloService.doaddflo(addbean)){
		return "option";}
		
		return "Add";
							
	}
	
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public String doUpdate(@ModelAttribute Flower updatebean){
		
		if(updateService.doupdate(updatebean)){
			return "option";
		}
		return "update";
	}
	
	
}
