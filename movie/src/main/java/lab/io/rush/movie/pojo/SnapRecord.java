package lab.io.rush.movie.pojo;

import java.util.Date;

import javax.jdo.annotations.Column;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable(table="snap_record")
public class SnapRecord {
	/**
     * 抢购编号
     */
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private int id;
	/**
     * 用户编号
     */
	private int uid;
	/**
     * 电影票编号
     */
	@Column(name = "movie_id")
	private int movieId;
	/**
     * 数量
     */
	private int num;
	/**
     * 抢购时间
     */
	@Column(name = "snap_time", allowsNull = "false")
	private Date snapTime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public Date getSnapTime() {
		return snapTime;
	}
	public void setSnapTime(Date snapTime) {
		this.snapTime = snapTime;
	}
	@Override
	public String toString() {
		return "SnapRecord [id=" + id + ", uid=" + uid + ", movieId=" + movieId + ", num=" + num + ", snapTime="
				+ snapTime + "]";
	}
	
}
