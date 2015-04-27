package cn.gejunyong.blog.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {
	
	//管理主页面
	@RequestMapping("/admin")
	public String main(){
		return "/admin/main";
	}
}
