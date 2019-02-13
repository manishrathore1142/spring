package com.springboot.rest.SpringBoot_1.Bean;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class TestBean {
	
	public void hi(){
		System.out.println("Hello Bean");
	}
	
	public List person(){
		List<String>  al = new ArrayList<String>();
		al.add("manish");
        al.add("lavy");
        al.add("Harshit");
		
		return al; 
		
	}
	
}
