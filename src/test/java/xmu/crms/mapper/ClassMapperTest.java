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
	public void testDeleteClassSelectionByClassId() {
		//
	}
	
	@Test
	public void testListClassByName() {
		
	}
	
	@Test
	public void testListClassByCourseId() {
		
	}
	
	@Test
	public void testGetClassByClassId() {
		
	}
	
	@Test
	public void testUpdateClassByClassId() {
		//
	}
	
	@Test
	public void testDeleteClassByClassId() {
		//
	}
	
	@Test
	public void testInsertCourseSelectionById() {
		BigInteger userId=new BigInteger("200");
		BigInteger classId=new BigInteger("200");
		int insert=0;
		insert=classMapper.insertCourseSelectionById(userId, classId);
		Assert.assertNotEquals(0, insert);
	}
	
	@Test
	public void testDeleteCourseSelectionById() {
		//
	}
	
	@Test
	public void testGetCallStatusById() {
		
	}
	
	@Test
	public void testInsertClassById() {
		//
	}
	
	@Test
	public void testInsertClassByIdWithTeacher() {
		//
	}
	
	@Test
	public void testDeleteClassByCourseId() {
		//
	}
	
	@Test
	public void testDeleteScoreRuleById() {
		//
	}
	
	@Test
	public void testGetScoreRule() {
		
	}
	
	@Test
	public void testInsertScoreRule() {
		//
	}
	
	@Test
	public void testUpdateScoreRule() {
		//
	}
}

