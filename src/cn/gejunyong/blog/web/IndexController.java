package cn.gejunyong.blog.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.gejunyong.blog.model.Blog;
import cn.gejunyong.blog.model.Menu;
import cn.gejunyong.blog.service.IBlogService;
import cn.gejunyong.blog.service.IMenuService;

@Controller
public class IndexController {
	private IMenuService menuService;
	private IBlogService blogService;
	public IMenuService getMenuService() {
		return menuService;
	}
	@Resource
	public void setMenuService(IMenuService menuService) {
		this.menuService = menuService;
	}
	public IBlogService getBlogService() {
		return blogService;
	}
	@Resource
	public void setBlogService(IBlogService blogService) {
		this.blogService = blogService;
	}
	
	//首页进行数据加载
	@ModelAttribute
	public void loadData(Model model){
		//加载博客标题
		Blog blog=blogService.getBlog();
		model.addAttribute("blog",blog);
		
		//加载菜单数据
		List<Menu> menus=menuService.getMenus();
		model.addAttribute("menus",menus);
		
	}
	
	//首页
	@RequestMapping(value={"/","/index"},method=RequestMethod.GET)
	public String getIndex(){
		
		return "/index/index";
	}
	
//	@RequestMapping(value={"/","/index"},method=RequestMethod.POST)
//	public String PostIndex(){
//		return "/index/index";
//	}
}
