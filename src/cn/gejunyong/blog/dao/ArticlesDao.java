package cn.gejunyong.blog.dao;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.gejunyong.blog.model.Articles;

@Repository("articlesDao")
public class ArticlesDao extends BaseDao<Articles> implements IArticlesDao {

	@Override
	public void addArticles(Articles articles) {
		this.add(articles);
	}

}
