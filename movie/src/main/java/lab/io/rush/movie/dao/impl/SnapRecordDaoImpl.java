package lab.io.rush.movie.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lab.io.rush.movie.dao.SnapRecordDao;
import lab.io.rush.movie.dao.datanucleus.dao.DataNucleusDao;
import lab.io.rush.movie.pojo.SnapRecord;

public class SnapRecordDaoImpl implements SnapRecordDao{
	@Autowired
	@Qualifier("dataNucleusDaoImpl")
	private DataNucleusDao dataNucleusDao;

	@Override
	public int insert(SnapRecord snapRecord) {
		// TODO Auto-generated method stub
		return (int)dataNucleusDao.insert(snapRecord);
	}

	@Override
	public boolean update(SnapRecord snapRecord) {
		// TODO Auto-generated method stub
		return dataNucleusDao.update(snapRecord);
	}

	@Override
	public SnapRecord selectById(int id) {
		// TODO Auto-generated method stub
		return dataNucleusDao.selectByPrimaryKey(SnapRecord.class, id);
	}

	@Override
	public List<SnapRecord> selectByUid(int uid) {
		// TODO Auto-generated method stub
		String query="uid=="+uid;
		List<SnapRecord> snapRecords = dataNucleusDao.selectByQuery(SnapRecord.class, query);
		return snapRecords;
	}

	@Override
	public List<SnapRecord> selectByMovieId(int movieId) {
		// TODO Auto-generated method stub
		String query="uid=="+movieId;
		List<SnapRecord> snapRecords = dataNucleusDao.selectByQuery(SnapRecord.class, query);
		return snapRecords;
	}

	@Override
	public SnapRecord selectByUidAndMovieId(int uid, int movieId) {
		// TODO Auto-generated method stub
		String query = "uid=="+uid+"&&movieId=="+movieId;
		List<SnapRecord> snapRecords = dataNucleusDao.selectByQuery(SnapRecord.class, query);
		if(snapRecords==null||snapRecords.isEmpty()){
			return null;
		}else{
			return snapRecords.get(0);
		}
	}
	
}
