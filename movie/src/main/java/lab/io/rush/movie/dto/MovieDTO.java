package lab.io.rush.movie.dto;

import java.util.Date;

import lab.io.rush.movie.pojo.MovieTicket;

/**
 * 电影票服务层DTO
 * */
public class MovieDTO {
	/**
     * 电影票对象
     */
    private MovieTicket movieTicket;
    /**
     * 电影票校验码
     */
    private String md5;

    /**
     * 现在时间
     */
    private Date nowTime;

    public MovieTicket getMovieTicket() {
        return movieTicket;
    }

    public void setMovieTicket(MovieTicket movieTicket) {
        this.movieTicket = movieTicket;
    }

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public Date getNowTime() {
        return nowTime;
    }

    public void setNowTime(Date nowTime) {
        this.nowTime = nowTime;
    }
}
