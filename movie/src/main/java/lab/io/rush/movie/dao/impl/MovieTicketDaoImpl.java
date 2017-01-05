package lab.io.rush.movie.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lab.io.rush.movie.dao.MovieTicketDao;
import lab.io.rush.movie.dao.datanucleus.dao.DataNucleusDao;
import lab.io.rush.movie.pojo.MovieTicket;

public class MovieTicketDaoImpl implements MovieTicketDao{
	@Autowired
	@Qualifier("dataNucleusDaoImpl")
	private DataNucleusDao dataNucleusDao;

	@Override
	public int insert(MovieTicket movieTicket) {
		// TODO Auto-generated method stub
		return (int)dataNucleusDao.insert(movieTicket);
	}

	@Override
	public boolean update(MovieTicket movieTicket) {
		// TODO Auto-generated method stub
		return dataNucleusDao.update(movieTicket);
	}

	@Override
	public MovieTicket selectById(int id) {
		// TODO Auto-generated method stub
		return dataNucleusDao.selectByPrimaryKey(MovieTicket.class, id);
	}

	@Override
	public List<MovieTicket> selectAll() {
		// TODO Auto-generated method stub
		return dataNucleusDao.selectByQuery(MovieTicket.class, "");
	}

	@Override
	public int getMovieTicketNum(int id) {
		// TODO Auto-generated method stub
		MovieTicket tickets = dataNucleusDao.selectByPrimaryKey(MovieTicket.class, id);
		if(tickets==null){
			return 0;
		}else{
			return tickets.getNum();
		}
	}
	
}
