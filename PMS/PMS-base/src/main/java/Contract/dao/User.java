package Contract.dao;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable{
	private  int id;
	private  String username;
	private  String password;
	private  int credits;
	private  String lastIp;
	private  Date lastVisit;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
	public String getLastIp() {
		return lastIp;
	}
	public void setLastIp(String lastIp) {
		this.lastIp = lastIp;
	}
	public Date getLastVisit() {
		return lastVisit;
	}
	public void setLastVisit(Date lastCisit) {
		this.lastVisit = lastCisit;
	}
	
	
}
