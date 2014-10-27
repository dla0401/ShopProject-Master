package exam.shop.service;

import org.springframework.validation.BindingResult;

import exam.shop.dto.User;

public interface UserCatalog {
	User getUserByUserId(String userId, String userPwd);
	void registerUser(User user, BindingResult bindingResult);
}
