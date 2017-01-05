package lab.io.rush.movie.pojo;

import java.util.Date;

import javax.jdo.annotations.Column;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable(table = "movie_tickets")
public class MovieTicket {
	/**
     * 电影票编号
     */
    @PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private int id;

    /**
     * 电影票名称
     */
    @Column(length = 64)
    private String name;

    /**
     * 数量
     */
    private int num;

    /**
     * 添加时间
     */
    @Column(name = "add_time", allowsNull = "false")
    private Date addTime;

    /**
     * 抢购开始时间
     */
    @Column(name = "start_time", allowsNull = "false")
    private Date startTime;

    /**
     * 抢购结束时间
     */
    @Column(name = "end_time", allowsNull = "false")
    private Date endTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "MovieTicke{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", num=" + num +
                ", addTime=" + addTime +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}
