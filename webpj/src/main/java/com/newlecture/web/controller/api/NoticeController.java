package com.newlecture.web.controller.api;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.newlecture.web.entity.Notice;
import com.newlecture.web.service.NoticeService;

@RestController("apiNoticeController") // REST API같은 경우에 이런 형태로 선언하면 된다.
@RequestMapping("/api/notice/")
public class NoticeController {
	
	@Autowired
	private NoticeService service;
	
	@RequestMapping("list")
	public List<Notice> list() throws ClassNotFoundException, SQLException{
		
		List<Notice> list = service.getList(1,"title", "");
		
		return list;
	}	// NoticeController noticeController = new NoticeController
		// <bean id="noticeController"  class=".....NoticeController"> 가 되는데 중복되는게 있으면 오류가 날 수 있다.
	
}
