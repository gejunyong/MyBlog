package cn.gejunyong.blog.service;

import org.springframework.stereotype.Service;

import cn.gejunyong.blog.model.Articles;


public interface IArticlesService {
	//添加文章
	public void addArticles(Articles articles);
}
