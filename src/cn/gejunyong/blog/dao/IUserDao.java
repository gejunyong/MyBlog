package cn.gejunyong.blog.dao;

import cn.gejunyong.blog.model.User;

public interface IUserDao extends IBaseDao<User> {
	public User loadUser(int id);
}
