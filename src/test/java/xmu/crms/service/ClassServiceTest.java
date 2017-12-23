package xmu.crms.service;

import java.math.BigInteger;
import java.util.List;

import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import xmu.crms.entity.*;
import xmu.crms.exception.*;
import xmu.crms.mapper.*;
@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
@Rollback
public class ClassServiceTest {
	@Autowired
	private ClassService classService;
	//insert 

	@Test
	public void testInsertCourseSelectionById() {
		BigInteger userId=new BigInteger("100");
		BigInteger classId=new BigInteger("100");
		String insert=classService.insertCourseSelectionById(userId, classId);
		Assert.assertNotNull(insert);
	}


	@Test
	public void testInsertClassById()
	{
		BigInteger userId=new BigInteger("200");
		BigInteger courseId=new BigInteger("200");
		ClassInfo classInfo=null;
		BigInteger insert=classService.insertClassById(userId, courseId,classInfo);
		Assert.assertNotNull(insert);
	}

	/*其实本质是修改-不能直接测试
	@Test void testInsertScoreRule()
	{
		BigInteger classId=new BigInteger("300");
		ClassInfo proportions=classService.getClassByClassId(new BigInteger("1"));
		BigInteger insert=classService.insertScoreRule(classId, proportions);
		Assert.assertNotNull(insert);
	}*/
	
	//update
/*
	@Test
	public void testUpdateClassByClassId() throws ClassesNotFoundException
	{
		BigInteger classId=new BigInteger("400");
		ClassInfo newClass=new ClassInfo();
		classService.updateClassByClassId(classId, newClass);
	}
*/
/*
	@Test
	public void testupdateScoreRule()
	{
		BigInteger classId=new BigInteger("500");
		ClassInfo proportions=new ClassInfo();
		classService.updateScoreRule(classId, proportions);
	}
*/
/*
	//delete
	@Test
	public void testDeleteClassSelectionByClassId()
	{
		classService.deleteClassSelectionByClassId(new BigInteger("100"));
	}
*/
/*
	@Test
	public void testDeleteClassByClassId()
	{
		classService.deleteClassByClassId(new BigInteger("200"));
	}
	@Test
	public void testDeleteCourseSelectionById()
	{
		BigInteger userId=new BigInteger("600");
		BigInteger classId=new BigInteger("600");
		classService.deleteCourseSelectionById(userId, classId);
	}
	@Test
	public void testDeleteClassByCourseId()
	{
		BigInteger courseId=new BigInteger("700");
		classService.deleteClassByCourseId(courseId);
	}
*/
/*
	//其实本质是update
	@Test
	public void testDeleteScoreRuleById()
	{
		BigInteger classId=new BigInteger("800");
		classService.deleteScoreRuleById(classId);
	}
*/
}
