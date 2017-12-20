package xmu.crms.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FixGroupMapperTest {
	@Autowired
	private FixGroupMapper fixGroupMapper;
	
	@Test
	public void testDeleteFixGroupMemberByFixGroupId() {
		System.out.println("测试开始");
        //简单验证结果集是否正确
        
	}
}
