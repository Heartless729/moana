package lab.io.rush.movie.service;

import java.util.List;

import lab.io.rush.movie.dto.MovieDTO;
import lab.io.rush.movie.dto.SnapMessageDto;
import lab.io.rush.movie.pojo.MovieTicket;

/**
 * 抢购服务层接口
 * */
public interface SnapService {
	/**
     * 抢购方法
     * 会开启事务，先减去库存，再添加抢购记录
     *
     * @param uid     用户编号
     * @param email   电子邮箱
     * @param movieId 电影票编号
     * @param md5     电影票校验码
     * @return 抢购状态
     */
    SnapMessageDto snapMovie(int uid, String email, int movieId, String md5);
    /**
     * 抢购方法
     * 会开启事务，先减去库存，再添加抢购记录
     *
     * @param uid     用户编号
     * @param email   电子邮箱
     * @param movieId 电影票编号
     * @param md5     电影票校验码
     * @param num     抢购数量
     * @return 抢购状态
     */
    SnapMessageDto snapMovie(int uid, String email, int movieId, String md5, int num);
    /**
     * 获取电影票信息
     *
     * @param movieId 电影票编号
     * @return 电影票服务层DTO
     */
    MovieDTO getMovieTicket(int movieId);
    /**
     * 获取所有电影票抢购信息
     *
     * @return 电影票抢购列表
     */
    List<MovieTicket> getAllMovieTicket();
    /**
     * 获取电影票数量信息
     *
     * @param id 电影票编号
     * @return 数量
     */
    int getMovieTicketNum(int id);
}
