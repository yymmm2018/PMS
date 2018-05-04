package dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import Contract.dao.User;

@Repository
public class UserDao {
	private JdbcTemplate jdbcTemplate;
	private final static String MATCH_COUNT_SQL = "SELECT count(*) FROM " +
				"t_user WHERE user_name = ? and password=?";
	private final static String UPDATE_LOGIN_INFO_SQL = "UPDATE t_user SET" +
				" last_visit=?,last_ip=?,credits=? WHERE user_id=?";

	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public int getMatchCount(String userName,String password)  {
		String sqlStr = "select count(*) from t_user"
				+ "where user_name = ? and password=?";
		return jdbcTemplate.queryForObject(sqlStr, new Object[] {userName,password},Integer.class);
	}
	
	public User findByUserName(final String username) {
		final User user = new User();
		jdbcTemplate.query(MATCH_COUNT_SQL, new Object[] {username},
				new RowCallbackHandler() {
			public void pricessRow(ResultSet rs) throws SQLException {
				user.setId(rs.getInt("user_id"));
				user.setUsername(username);
				user.setCredits(rs.getInt("credits"));
			}

			@Override
			public void processRow(ResultSet rs) throws SQLException {
				// TODO Auto-generated method stub
				user.setId(rs.getInt("user_id"));
				user.setUsername(username);
				user.setCredits(rs.getInt("credits"));
			}
		});
		return null;
	}
	public void updateLoginInfo(User user) {
		jdbcTemplate.update(UPDATE_LOGIN_INFO_SQL, new Object[] {user.getLastVisit(),
				user.getLastIp(),user.getCredits(),user.getId()});
	}
	
}
