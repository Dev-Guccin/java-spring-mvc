package com.newlecture.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HomeController{ // 컨트롤들을 담는 컨테이너로서 사용한다.

	@RequestMapping("index")
	public String index() {
		System.out.println("index!!");
		
		return "root.index"; // tiles에서 resolving이 가능하므로 문자열을 반환하면 된다.
	}
	
//	@Override
//	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		// TODO Auto-generated method stub
//		System.out.println("IndexController");
//		
//		ModelAndView mv = new ModelAndView("root.index");
//		mv.addObject("data", "Hello Spring MVC"); // model을 만들어준다. 즉, 데이터를 바인딩해준다.
//		//mv.setViewName("/WEB-INF/view/index.jsp"); // 상대경로로 쓰면 url과 겹쳐서 망가짐.
//		return mv;
//	}
	
}
