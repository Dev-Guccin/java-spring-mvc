package com.newlecture.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class IndexController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("IndexController");
		
		ModelAndView mv = new ModelAndView("root.index");
		mv.addObject("data", "Hello Spring MVC"); // model을 만들어준다. 즉, 데이터를 바인딩해준다.
		//mv.setViewName("/WEB-INF/view/index.jsp"); // 상대경로로 쓰면 url과 겹쳐서 망가짐.
		return mv;
	}
}
