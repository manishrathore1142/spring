package com.springboot.rest.SpringBoot_1.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.rest.SpringBoot_1.Bean.TestBean;

@RestController
public class Maincontroller {
	
	@Autowired
	private TestBean testbean ;
	 
	@RequestMapping("/user")
     public List  Hello(){
		return testbean.person();
	}
	
}
