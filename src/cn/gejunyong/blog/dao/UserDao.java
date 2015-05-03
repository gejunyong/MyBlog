package cn.gejunyong.blog.dao;

import org.springframework.stereotype.Repository;

import cn.gejunyong.blog.model.User;

@Repository("userDao")
public class UserDao extends BaseDao<User> implements IUserDao {
	
	@Override
	public User loadUser(String userName) {
		// 根据Id 加载信息
		return (User)this.queryByHql(" from User where username=? ",userName);
	}


}
