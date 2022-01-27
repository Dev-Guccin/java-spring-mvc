package com.newlecture.web.controller.customer;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.newlecture.web.entity.Notice;
import com.newlecture.web.service.NoticeService;


@Controller // 객체화 되기 위해서 반드시 필요하다.
@RequestMapping("/customer/notice/") // 하위 경로와 결합이 되어 요청된다.
public class NoticeController {
	
	@Autowired // DI를 이곳에서 한다. 만약 무언가 수행하고 싶으면 함수에 autowired하면 된다.
	private NoticeService noticeService;

	@RequestMapping("list")
	//public String list(@RequestParam(name="p", defaultValue="1") String page) throws ClassNotFoundException, SQLException{
	public String list(HttpServletRequest request) throws ClassNotFoundException, SQLException{
		//mv.setViewName("/WEB-INF/view/notice/list.jsp"); // 상대경로로 쓰면 url과 겹쳐서 망가짐.
//		
//		String p = request.getParameter("p");
		System.out.println(request);

		
		//List<Notice> list = noticeService.getList(1, "TITLE", "");
		
		return "notice.list";
	}
	@RequestMapping("detail")
	public String detail() {
		return "notice.detail";
		
	}
}
