package lab.io.rush.movie.service;

public interface EmailService {
	/**
     * 给指定邮箱发邮件发送
     * @param email 邮箱
     * @param content 邮件内容
     * @return 状态 底层用队列实现，这里是加入队列状态
     */
	boolean sendEmail(String email,String content);
	/**
     * 给指定邮箱发邮件发送
     * @param email 邮箱
     * @param title 邮件主题
     * @param content 邮件内容
     * @return 状态 底层用队列实现，这里是加入队列状态
     */
	boolean sendEmail(String email,String title,String content);
}
