package dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import Contract.dao.LoginLog;

public class LoginDao {
	private JdbcTemplate jdbcTemplate;
	
	//保存登录日志SQL
	private final static String INSERT_LOGIN_LOG_SQL="INSERT INTO"
			+ " t_login_log(user_id,ip,login_datetime)"
			+ "values(?,?,?)";
	
	public void insertLoginLog(LoginLog loginlog) {
		Object[] args = {loginlog.getUserId(),loginlog.getIp(),loginlog.getLoginDate()};
		jdbcTemplate.update(INSERT_LOGIN_LOG_SQL, args);
	}
	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate=jdbcTemplate;
		
	}
}
