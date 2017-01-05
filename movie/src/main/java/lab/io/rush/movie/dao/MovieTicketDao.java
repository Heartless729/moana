package lab.io.rush.movie.dao;

import java.util.List;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;

import lab.io.rush.movie.pojo.MovieTicket;

/**
 * 电影票表持久层
 * */
public interface MovieTicketDao {
	/**
     * 插入电影票
     *
     * @param movieTicke 电影票对象
     * @return 电影票编号
     */
	int insert(MovieTicket movieTicket);
	/**
     * 更新电影票
     *
     * @param movieTicke 电影票对象
     * @return 更新状态
     */
	@CacheEvict(value="MovieTicket",key="'MovieTicket-id:'+#movieTicket.id",beforeInvocation=true)
	boolean update(MovieTicket movieTicket);
	/**
     * 根据编号选择电影票
     *
     * @param id 电影票编号
     * @return 电影票对象
     */
	@Cacheable(value="MovieTicket",key="'MovieTicket-id:'+#id")
	MovieTicket selectById(int id);
	/**
     * 获取所有电影票
     *
     * @return 电影票对象列表
     */
	List<MovieTicket> selectAll();
	/**
     * 获取电影票数量信息
     * @param id 电影票编号
     * @return 数量
     */
	@Cacheable(value="MovieTicket",key="'MovieTicketNum-id:'+#id")
	int getMovieTicketNum(int id);
}
