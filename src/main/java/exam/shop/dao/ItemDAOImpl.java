package exam.shop.dao;

import java.sql.*;
import java.util.*;

import org.springframework.jdbc.core.*;

import exam.shop.dto.*;

public class ItemDAOImpl implements ItemDAO {
	
	private JdbcTemplate jdbcTemplate;

	// DataSource 이용해서 DataBase 연결
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<Item> findAll() {
		// TODO Auto-generated method stub
		
		
		String sql ="select * from items";
		
		List<Item> list = jdbcTemplate.query(sql, new RowMapper<Item>() {

			@Override
			public Item mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				
				Item item 
					= new Item(rs.getInt("item_id"), 
							   rs.getString("item_name"),
							   rs.getInt("price"),
							   rs.getString("description"),
							   rs.getString("pictureUrl"));
				
				return item;
			}
		});
		
		return list;
	}

	@Override
	public Item findByItemId(int itemId) {
		// TODO Auto-generated method stub
		String sql = "select * from items where item_id=?";
		
		/*Object[] obj = new Object[1];
		obj[0] = itemId;
		new Object[] {itemId, itemName}
		*/
		Item item =jdbcTemplate.queryForObject(sql, new Object[] {itemId},new RowMapper<Item>(){
			public Item mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				Item item 
					= new Item(rs.getInt("item_id"), 
							   rs.getString("item_name"),
							   rs.getInt("price"),
							   rs.getString("description"),
							   rs.getString("pictureUrl"));
				
				return item;
			}
		});
		return item;
	}
}
