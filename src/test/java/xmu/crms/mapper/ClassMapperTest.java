package xmu.crms.mapper;

import java.math.BigInteger;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import xmu.crms.entity.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
@Rollback(true)
public class ClassMapperTest {
	@Autowired
	private ClassMapper classMapper;
	
	@Test
	public void testInsertCourseSelectionById() {
		BigInteger userId=new BigInteger("100");
		BigInteger classId=new BigInteger("100");
		int insert=0;
		insert=classMapper.insertCourseSelectionById(userId, classId);
		Assert.assertNotEquals(0, insert);
	}
}

