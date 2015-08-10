package cn.gejunyong.blog.web;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.gejunyong.blog.model.Articles;
import cn.gejunyong.blog.service.IArticlesService;

@Controller
public class AdminController {
	private IArticlesService articlesService;
	
	
	public IArticlesService getArticlesService() {
		return articlesService;
	}
	
	@Resource
	public void setArticlesService(IArticlesService articlesService) {
		this.articlesService = articlesService;
	}

	//管理主页面
	@RequestMapping("/admin")
	public String main(){
		return "/admin/main";
	}
	
	//添加文章页面
	@RequestMapping(value={"/admin/articleadd"},method=RequestMethod.GET)
	public String add(){
		System.out.print("add ....");
		return "/admin/articleadd";
	}
	
	//添加文章提交
	@RequestMapping(value={"/admin/articleadd"},method=RequestMethod.POST)
	public String addSubmit(int cateGoriesId,String labelIds,int menuId,String title,String content
			,String reproducedUrl,int topLabel,int enabled){
		Articles articles=new Articles();
		articles.setCateGoriesId(cateGoriesId);
		articles.setLabelIds(labelIds);
		articles.setMenuId(menuId);
		articles.setTitle(title);
		articles.setContent(content);
		articles.setReproducedUrl(reproducedUrl);
		articles.setTopLabel(topLabel);
		articles.setEnabled(enabled);
		articles.setCreateDate(new Date());
		articles.setUpdtaeDate(new Date());
		articlesService.addArticles(articles);
		System.out.print("submit  ...."+content);
		return "/admin/articleadd";
	}
	
//管理权限返回首页
//	@RequestMapping("/admin/*")
//	public String reIndex(){
//		return "/index/index";
//	}
}
