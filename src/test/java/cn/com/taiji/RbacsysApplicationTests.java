package cn.com.taiji;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.omg.CORBA.OMGVMCID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import cn.com.taiji.domain.Department;
import cn.com.taiji.domain.Employee;
import cn.com.taiji.sys.dto.EmployeeDto;
import cn.com.taiji.sys.repository.DeptRepository;
import cn.com.taiji.sys.service.DeptService;
import cn.com.taiji.sys.service.EmpService;
import cn.com.taiji.sys.service.InitExcel;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RbacsysApplicationTests {

	@Autowired
	InitExcel initExcel;
	@Autowired
	DeptRepository deptRepo;
	@Autowired
	ObjectMapper om;
	@Autowired
	DeptService deptService;
	
	@Test
	public void sendQA() throws IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException, IOException {
		String path = "C:/Users/ren/Desktop/通讯录.xlsx";
		initExcel.print(path);
	}

	
	
	@Test
	public void getEmployees() {
		List<Employee> list = deptService.findById("");
		System.out.println(list.size());
	}
}
