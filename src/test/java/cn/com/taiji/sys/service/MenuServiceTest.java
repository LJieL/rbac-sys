package cn.com.taiji.sys.service;

import java.lang.reflect.InvocationTargetException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.com.taiji.RbacsysApplication;
import cn.com.taiji.sys.dto.MenuDto;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=RbacsysApplication.class)
public class MenuServiceTest {
	@Autowired
	MenuService mService;
	
	@Test
	public void menuAddTest() {
		MenuDto menuDto = new MenuDto();
		menuDto.setId("0819");
		menuDto.setMenuName("测试");
		
		try {
			mService.addMenu(menuDto);
		} catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}
	}
}
