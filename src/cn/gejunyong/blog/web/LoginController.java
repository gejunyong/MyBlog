package cn.gejunyong.blog.web;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;




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

	@RequestMapping(value={"/","/login"},method=RequestMethod.GET)
	public String login() {
		
		log.info(" in ..");
		User u=userService.load(1);
		log.info(" u"+u.getNickname());
		return "login";
	}
	
//	@RequestMapping(value={"/","/login"},method=RequestMethod.POST)
//	public String login(String username,String password,Model model){
//		if("".equals(username)||"".equals(password)){
//			model.addAttribute("error","用户名 密码不能为空!");
//			return "/login";
//		}
//		User u =userDao.load(username);
//		if(u==null){
//			model.addAttribute("error","用户名不存在!");
//			return "/login";
//		}
//		if(!u.getPassword().equals(DigestUtils.md5Hex(password+username).toUpperCase())){
//			model.addAttribute("error","用户密码错误!");
//			return "/login";
//		}
//		model.addAttribute("loginUser", u);
//		return "redirect:/user/main";
//	}
	
	@RequestMapping("/logout")
	public String logout(Model model,HttpSession session) {
		model.asMap().remove("loginUser");
		session.invalidate();
		return "redirect:/login";
	}
}
