package com.newlecture.web.controller.admin.board;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;


@Controller("adminNoticeController")
@RequestMapping("/admin/board/notice/")
public class NoticeController { // 이 이름에 따라 IOC컨테이너 안에서 생성되는데 이떄 같은 클래스를 가지면 문제가 발생할 수 있다.

	@Autowired
	private ServletContext ctx;

	@RequestMapping("list")
	public String list() {
		return "admin.board.notice.list";
	}

	@RequestMapping("reg")
//	@ResponseBody
	public String reg(String title, String content, MultipartFile file, HttpServletRequest request) {

		long filesize = file.getSize();
		String filename= file.getOriginalFilename();
		System.out.printf("filename %s, fileSize: %d\n", filename, filesize);
		//ServletCOntext ctx = request.getServletContext();
		String webPath = "/static/upload";
		String realPath = ctx.getRealPath(webPath);
		System.out.printf("realPath: %s\n",realPath);

		File savePath = new File(realPath); // 파일이 있는지 없는지 폴더 확
		if(!savePath.exists()) 
			savePath.mkdirs();// 중간에 없는게 있으면 전체 경로를 만들어 준다.


		realPath += File.separator + filename;
		File saveFile = new File(realPath); // 이를 통해 파일 객체를 만든다.

		try {
			file.transferTo(saveFile);
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}// 객체를 저장한다.



		//return String.format("title:%s, content:%s<br>", title, content);
		return "admin.board.notice.list";
	}

	@RequestMapping("edit")
	public String edit() {

		return "admin.board.notice.edit";
	}

	@RequestMapping("del")
	public String del() {

		return "";
	}
}
