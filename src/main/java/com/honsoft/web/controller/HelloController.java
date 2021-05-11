package com.honsoft.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class HelloController extends AbstractController{
	private String hello = "hello";
	
	 @Override
	   protected ModelAndView handleRequestInternal(HttpServletRequest request,
	      HttpServletResponse response) throws Exception {
	      ModelAndView model = new ModelAndView("hello");
	      model.addObject("message", "Hello World!");
	      return model;
	   }
	 
	 public void setHello(String hello) {
		 this.hello = hello;
	 }
}
