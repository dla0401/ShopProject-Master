package exam.shop.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import exam.shop.dto.Item;
import exam.shop.dto.User;

public class UserDAOImpl implements UserDAO{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public User getUserByUserId(String userId,String userPwd) {
		// TODO Auto-generated method stub
		String sql = "select * from users where user_id=? and user_pwd=?";
		User user = jdbcTemplate.queryForObject(sql, new Object[]{userId,userPwd},new RowMapper<User>(){
			public User mapRow(ResultSet rs, int arg1) throws SQLException{
				User user 
				= new User(rs.getString("user_id"),
						rs.getString("user_pwd"),
						rs.getString("user_name"));				
				return user;
			}
		});
		return user;
	}

	@Override
	public void registerUser(User user) {
		// TODO Auto-generated method stub
		String sql = "insert into users values(?,?,?)";
		int result = jdbcTemplate.update(sql, user.getUserId(),user.getUserPwd(),user.getUserName());		
	}
}
