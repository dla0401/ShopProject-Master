package exam.shop.dao;

import exam.shop.dto.Item;
import exam.shop.dto.User;

public interface UserDAO {
	User getUserByUserId(String userId,String userPwd);
	void registerUser(User user);
}
