package exam.shop.service;

import java.util.*;

import exam.shop.dto.*;

public class ShopServiceImpl implements ShopService {
	private ItemCatalog itemCatalog;
	private UserCatalog userCatalog;
	
	public void setItemCatalog(ItemCatalog itemCatalog) {
		this.itemCatalog = itemCatalog;
	}

	@Override
	public List<Item> getItemList() {
		// TODO Auto-generated method stub
		
		List<Item> list = itemCatalog.getItemList();
		
		return list;
	}

	@Override
	public Item getItemByItemId(int itemId) {
		Item item = itemCatalog.getItemByItemId(itemId);
		return item;
	}

	@Override
	public User getUserByUserId(String userId, String userPwd, String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void registerUser(User user) {
		// TODO Auto-generated method stub
		
	}

}
