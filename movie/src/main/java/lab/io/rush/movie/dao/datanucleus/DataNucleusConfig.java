package lab.io.rush.movie.dao.datanucleus;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManagerFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

/**
 * DataNucleus持久层配置文件
 * */
public class DataNucleusConfig {
	/**
     * 产生PersistenceManagerFactory Bean
     *
     * @return PersistenceManagerFactory对象
     */
	@Bean
	@Scope
	public PersistenceManagerFactory getPersistenceManagerFactory(){
		return JDOHelper.getPersistenceManagerFactory("Tutorial");
	}
}
