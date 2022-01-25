package com.newlecture.web.controller.notice;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.newlecture.web.entity.Notice;
import com.newlecture.web.service.NoticeService;
import com.newlecture.web.service.jdbc.JDBCNoticeService;

public class ListController implements Controller{

	
	@Autowired // DI를 이곳에서 한다. 만약 무언가 수행하고 싶으면 함수에 autowired하면 된다.
	private NoticeService noticeService;
	
//	public void setNoticeService(NoticeService noticeService) {
//		this.noticeService = noticeService;
//		System.out.println("Hello");
//	}


	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("ListController");
		
		ModelAndView mv = new ModelAndView("notice.list");
		//mv.setViewName("/WEB-INF/view/notice/list.jsp"); // 상대경로로 쓰면 url과 겹쳐서 망가짐.
		List<Notice> list = noticeService.getList(1, "TITLE", "");
		mv.addObject("list", list);
		
		return mv;
	}

}
