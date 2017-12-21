package cn.com.taiji.sys.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import cn.com.taiji.domain.Department;
import cn.com.taiji.domain.Employee;
import cn.com.taiji.domain.User;
/**
 * 
 * 类名称：DeptRepository   
 * 类描述：   
 * 创建人：liao
 * 创建时间：2017年12月18日 
 * @version
 */
@Repository
public interface DeptRepository extends JpaRepository<Department,String>,JpaSpecificationExecutor<Department>,PagingAndSortingRepository<Department, String>{
	
}
