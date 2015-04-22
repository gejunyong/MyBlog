package cn.gejunyong.blog.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.gejunyong.blog.dao.IUserDao;
import cn.gejunyong.blog.model.User;

@Service("userService")
public class UserService implements IUserService {
	private IUserDao userDao;
	
	public IUserDao getUserDao() {
		return userDao;
	}
	@Resource
	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public User load(int id) {
		// TODO Auto-generated method stub
		return userDao.load(id);
	}

}
