package cn.gejunyong.blog.dao;

import org.springframework.stereotype.Repository;

import cn.gejunyong.blog.model.User;

@Repository("userDao")
public class UserDao extends BaseDao<User> implements IUserDao {
	
	@Override
	public User loadUser(int id) {
		// 根据Id 加载信息
		return this.load(id);
	}


}
