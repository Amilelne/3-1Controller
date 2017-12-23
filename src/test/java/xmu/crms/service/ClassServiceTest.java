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
/*
	@Test
	public void testInsertCourseSelectionById() {
		BigInteger userId=new BigInteger("100");
		BigInteger classId=new BigInteger("100");
		String insert=classService.insertCourseSelectionById(userId, classId);
		Assert.assertNotNull(insert);
	}
*/
/*
	@Test
	public void testInsertClassById()
	{
		BigInteger userId=new BigInteger("200");
		BigInteger courseId=new BigInteger("200");
		ClassInfo classInfo=new ClassInfo();
		classInfo.setName("222");
		classInfo.setReportPercentage(5);
		classInfo.setFivePointPercentage(5);
		classInfo.setFourPointPercentage(5);
		classInfo.setThreePointPercentage(5);
		classInfo.setPresentationPercentage(5);
		int insert=classService.insertClassById(userId, courseId,classInfo);
		Assert.assertNotNull(insert);
	}
*/
/////////////////////////************************下面一个存在测试问题的函数
/*
	@Test void testInsertScoreRule()
	{
		BigInteger classId=new BigInteger("5");
		ClassInfo proportions=new ClassInfo();
		proportions.setName("cccc");
		proportions.setReportPercentage(4);
		proportions.setFivePointPercentage(4);
		proportions.setFourPointPercentage(4);
		proportions.setThreePointPercentage(4);
		proportions.setReportPercentage(4);
		classService.insertScoreRule(classId, proportions);
	}
*/
	//update
/*
	@Test
	public void testUpdateClassByClassId() throws ClassesNotFoundException
	{
		BigInteger classId=new BigInteger("6");
		ClassInfo proportions=new ClassInfo();
		proportions.setName("111");
		proportions.setReportPercentage(4);
		proportions.setFivePointPercentage(4);
		proportions.setFourPointPercentage(4);
		proportions.setThreePointPercentage(4);
		proportions.setReportPercentage(4);
		classService.updateClassByClassId(classId, proportions);
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
		classService.deleteClassSelectionByClassId(new BigInteger("200"));
	}
*/
/*
	@Test
	public void testDeleteClassByClassId()
	{
		classService.deleteClassByClassId(new BigInteger("6"));
	}
*/
/*
	@Test
	public void testDeleteCourseSelectionById()
	{
		BigInteger userId=new BigInteger("100");
		BigInteger classId=new BigInteger("100");
		classService.deleteCourseSelectionById(userId, classId);
	}
*/
/*
	@Test
	public void testDeleteClassByCourseId()
	{
		BigInteger courseId=new BigInteger("200");
		classService.deleteClassByCourseId(courseId);
	}
*/
/*
	//其实本质是update
	@Test
	public void testDeleteScoreRuleById()
	{
		BigInteger classId=new BigInteger("2");
		classService.deleteScoreRuleById(classId);
	}
*/
}
