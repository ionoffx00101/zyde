package com.coffee.zyde.service;

import javax.servlet.http.HttpSession;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class ZydeService {

	//@������Ʈ
	@RequestMapping
	public String nine(HttpSession session,HttpRequest request){
		
		
		return null; //�ּ�
	}
	
	@RequestMapping()
	//@RequestBody()
	public String ten(HttpSession session,HttpRequest request){
		
		
		return null; //�ּ�
	}
}
