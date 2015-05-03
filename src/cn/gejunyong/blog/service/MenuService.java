package cn.gejunyong.blog.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.gejunyong.blog.dao.IMenuDao;
import cn.gejunyong.blog.model.Menu;

@Service("menuService")
public class MenuService implements IMenuService {
	private IMenuDao menuDao;
	

	public IMenuDao getMenuDao() {
		return menuDao;
	}

	@Resource
	public void setMenuDao(IMenuDao menuDao) {
		this.menuDao = menuDao;
	}


	@Override
	public List<Menu> getMenus() {
		// TODO Auto-generated method stub
		return menuDao.getMenus();
	}

}
