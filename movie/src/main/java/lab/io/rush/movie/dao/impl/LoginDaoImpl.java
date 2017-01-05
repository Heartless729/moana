package lab.io.rush.movie.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lab.io.rush.movie.dao.LoginDao;
import lab.io.rush.movie.dao.datanucleus.dao.DataNucleusDao;
import lab.io.rush.movie.pojo.Login;

public class LoginDaoImpl implements LoginDao{
	@Autowired
	@Qualifier("dataNucleusDaoImpl")
	private DataNucleusDao dataNucleusDao;

	@Override
	public int insert(Login login) {
		// TODO Auto-generated method stub
		return (int)dataNucleusDao.insert(login);
	}

	@Override
	public boolean update(Login login) {
		// TODO Auto-generated method stub
		return dataNucleusDao.update(login);
	}

	@Override
	public Login selectById(int id) {
		// TODO Auto-generated method stub
		return dataNucleusDao.selectByPrimaryKey(Login.class, id);
	}

	@Override
	public Login selectByUsername(String username) {
		// TODO Auto-generated method stub
		String query = "username=='"+username.trim()+"'";
		List<Login> logins = dataNucleusDao.selectByQuery(Login.class, query);
		if(logins!=null&&!logins.isEmpty()){
			return logins.get(0);
		}
		return null;
	}

	@Override
	public Login selectByEmail(String email) {
		// TODO Auto-generated method stub
		String query = "email=='"+email.trim()+"'";
		List<Login> logins = dataNucleusDao.selectByQuery(Login.class, query);
		if(logins!=null&&!logins.isEmpty()){
			return logins.get(0);
		}
		return null;
	}
	
}
