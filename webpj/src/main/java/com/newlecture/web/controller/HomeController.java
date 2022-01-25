package com.newlecture.web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HomeController{ // 컨트롤들을 담는 컨테이너로서 사용한다.

	@RequestMapping("index")
	@ResponseBody
	public String index(HttpServletResponse response) { // 파라미터를 받겠다고 하면 servelet에서 필요한 파라미터를 넘겨준다.
		System.out.println("index!!");
		return "BPODY";
	}
//	@RequestMapping("index")
//	public void index(HttpServletResponse response) { // 파라미터를 받겠다고 하면 servelet에서 필요한 파라미터를 넘겨준다.
//		System.out.println("index!!");
//		PrintWriter out;
//		try {
//			out = response.getWriter();
//			out.println("WLE");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	
	
	
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
