package xin.lobinson.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import xin.lobinson.springboot.entity.TCjxUser;
import xin.lobinson.springboot.mapper.TCjxUserMapper;


import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@WebAppConfiguration
public class SpringbootApplicationTests {

	@Autowired
	private TCjxUserMapper userMapper;

	@Test
	public void contextLoads() {
		List<TCjxUser> users = userMapper.selectAll();
		for (TCjxUser user : users) {
			System.out.println(user.toString());
		}
	}


}
