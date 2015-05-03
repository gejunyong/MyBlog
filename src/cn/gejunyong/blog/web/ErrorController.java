package cn.gejunyong.blog.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ErrorController {
	//404页面
	@RequestMapping("/error/404")
	public String get404(){
		
		return "/error/404";
	}
	
//	//505页面
//	@RequestMapping("/error/505")
//	public String get505(){
//		
//		return "/error/505";
//	}
}
