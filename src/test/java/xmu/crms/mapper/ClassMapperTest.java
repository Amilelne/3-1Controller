package xmu.crms.mapper;

import java.math.BigInteger;
import java.util.ArrayList;
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
	public void testGetCourseIdByName() {
		List<BigInteger> courseIds=classMapper.getCourseIdByName("课程1");
		Assert.assertNotEquals(true, courseIds.isEmpty());
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
	public void testDeleteFixGroupMemberByFixGroupId() {
		//
		List<BigInteger> fixGroupIds=new ArrayList<BigInteger>();
		fixGroupIds.add(new BigInteger("17"));
		fixGroupIds.add(new BigInteger("18"));
		int delete=classMapper.deleteFixGroupMemberByFixGroupId(fixGroupIds);
		Assert.assertNotEquals(0, delete);
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
		BigInteger classId=new BigInteger("3");
		ClassInfo proportions=new ClassInfo();
		proportions.setName("cccc");
		proportions.setReportPercentage(5);
		proportions.setFivePointPercentage(3);
		proportions.setFourPointPercentage(4);
		proportions.setThreePointPercentage(4);
		proportions.setReportPercentage(4);
		classMapper.insertScoreRule(classId, proportions);
	}
	
	@Test
	public void testUpdateScoreRule() {
		//
	}
}

