package cn.gejunyong.blog.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.gejunyong.blog.dao.IBlogDao;
import cn.gejunyong.blog.model.Blog;

@Service("blogService")
public class BlogService implements IBlogService {
	private IBlogDao blogDao;
	
	public IBlogDao getBlogDao() {
		return blogDao;
	}
	@Resource
	public void setBlogDao(IBlogDao blogDao) {
		this.blogDao = blogDao;
	}

	@Override
	public Blog getBlog() {
		// TODO Auto-generated method stub
		return blogDao.getBlog();
	}

}
