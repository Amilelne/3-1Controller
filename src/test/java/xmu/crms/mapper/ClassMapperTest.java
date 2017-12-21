package xmu.crms.mapper;

import java.math.BigInteger;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ClassMapperTest {
	@Autowired
	private ClassMapper classMapper;
	
	/*
	@Test
	public void testDeleteClassSelectionByClassId() {
		Boolean delete=classMapper.deleteClassSelectionByClassId(new BigInteger("1"));
		Assert.assertEquals(true, delete);
	}*/
	
	
}
