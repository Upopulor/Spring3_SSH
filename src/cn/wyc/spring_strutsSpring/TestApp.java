package cn.wyc.spring_strutsSpring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:cn/wyc/spring_strutsSpring/applicationContext.xml")
public class TestApp {
	@Autowired
	private UserService userService;
	@Test
	public void demo1() {
		User user = new User();
		user.setUsername("¿¨Ã×¶û");
		user.setAge(10);
		user.setPassword("kakak");
		userService.register(user);
	}
}
