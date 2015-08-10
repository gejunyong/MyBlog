package cn.gejunyong.blog.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.gejunyong.blog.dao.IArticlesDao;
import cn.gejunyong.blog.model.Articles;

@Service("articlesService")
public class ArticlesService implements IArticlesService {
	private IArticlesDao articlesDao;
	public IArticlesDao getArticlesDao() {
		return articlesDao;
	}
	@Resource
	public void setArticlesDao(IArticlesDao articlesDao) {
		this.articlesDao = articlesDao;
	}

	@Override
	public void addArticles(Articles articles) {
		articlesDao.addArticles(articles);
		
	}

}
