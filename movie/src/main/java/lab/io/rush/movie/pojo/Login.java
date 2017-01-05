package lab.io.rush.movie.pojo;

import java.util.Date;

import javax.jdo.annotations.Column;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable(table = "login")
public class Login {
	/**
     * 用户编号
     */
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private int id;
	/**
     * 用户名
     */
	@Column(length=16)
	private String username;
	/**
     * 密码
     */
	@Column(length=24)
	private String password;
	/**
     * 电子邮箱
     */
	@Column(length=32)
	private String email;
	/**
     * 注册时间
     */
	@Column(name="register_time",allowsNull="false")
	private Date registerTime;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getRegisterTime() {
		return registerTime;
	}
	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}
	@Override
	public String toString() {
		return "Login [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email
				+ ", registerTime=" + registerTime + "]";
	}
	
}
