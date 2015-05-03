package cn.gejunyong.blog.dao;

import org.springframework.stereotype.Repository;

import cn.gejunyong.blog.model.Blog;

@Repository("blogDao")
public class BlogDao extends BaseDao<Blog> implements IBlogDao {

	@Override
	public Blog getBlog() {
		return this.get(1);
	}

}
