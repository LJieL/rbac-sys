package cn.com.taiji.sys.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import cn.com.taiji.domain.User;

/**        
 * 类名称：UserRepository   
 * 类描述：   User的数据库操作层
 * 创建人：liao  
 * 创建时间：2017年12月8日
 * @version      
 */ 
@Repository
public interface UserRepository extends JpaRepository<User,String>,JpaSpecificationExecutor<User>,PagingAndSortingRepository<User, String>{
	
}
