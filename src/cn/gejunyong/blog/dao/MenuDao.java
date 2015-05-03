package cn.gejunyong.blog.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.gejunyong.blog.model.Menu;

@Repository("menuDao")
public class MenuDao extends BaseDao<Menu> implements IMenuDao {

	@Override
	public List<Menu> getMenus() {
		// TODO Auto-generated method stub
		return this.list(" from Menu menu");
	}

}
