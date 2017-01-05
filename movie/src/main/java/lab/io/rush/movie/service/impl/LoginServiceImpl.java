package lab.io.rush.movie.service.impl;

import java.util.Date;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lab.io.rush.movie.dao.LoginDao;
import lab.io.rush.movie.log.AutoLogger;
import lab.io.rush.movie.pojo.Login;
import lab.io.rush.movie.service.LoginService;

public class LoginServiceImpl implements LoginService{
	@AutoLogger
	private Logger logger;
	@Autowired
	@Qualifier("loginDaoImpl")
	private LoginDao loginDao;
	@Override
	public int loginByEmail(String email) {
		// TODO Auto-generated method stub
		logger.debug("enter into LoginServiceImpl-loginByEmail email:" + email);
		Login login = loginDao.selectByEmail(email);
		int id=0;
		if(login==null){
			//不存在创建新用户
			login = new Login();
			login.setEmail(email);
			login.setRegisterTime(new Date());
			id = loginDao.insert(login);
		}else{
			id = login.getId();
		}
		return id;
	}
	
}
