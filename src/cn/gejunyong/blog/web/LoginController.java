package cn.gejunyong.blog.web;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;





import org.apache.commons.codec.digest.DigestUtils;
import org.apache.log4j.Logger;
//import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import cn.gejunyong.blog.model.User;
import cn.gejunyong.blog.service.IUserService;


@Controller
@SessionAttributes("loginUser")
public class LoginController {
	
	Logger log=Logger.getLogger(getClass());
	private IUserService userService;
	public IUserService getUserService() {
		return userService;
	}
	@Resource
	public void setUserService(IUserService userService) {
		this.userService = userService;
	}

	@RequestMapping(value={"/login"},method=RequestMethod.GET)
	public String login() {
		//User u=userService.loadUser("gejunyong");
		//System.out.println(" pas :"+DigestUtils.md5Hex("ge").toUpperCase());
		return "/login/login";
	}
	
	@RequestMapping(value={"/login"},method=RequestMethod.POST)
	public String login(String username,String password,Model model){
		if("".equals(username)||"".equals(password)){
			model.addAttribute("error","用户名 密码不能为空!");
			return "/login/login";
		}
		User u =userService.loadUser("gejunyong");
		if(u==null){
			model.addAttribute("error","用户名不存在!");
			return "/login/login";
		}
		if(!u.getPassword().equals(DigestUtils.md5Hex("ge"+username+password).toUpperCase())){
			model.addAttribute("error","用户密码错误!");
			return "/login/login";
		}
		model.addAttribute("loginUser",u);
		return "redirect:/admin";
	}
	
	@RequestMapping("/logout")
	public String logout(Model model,HttpSession session) {
		model.asMap().remove("loginUser");
		session.invalidate();
		return "redirect:/index";
	}
	
	
}
