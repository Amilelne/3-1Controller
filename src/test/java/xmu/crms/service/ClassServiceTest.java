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
		/*Topic topic=new Topic();
		topic.setName("话题14");
		topic.setDescription("话题14描述");
		topic.setGroupNumberLimit(4);
		topic.setGroupStudentLimit(5);
		BigInteger insert=topicService.insertTopicBySeminarId(new BigInteger("1"), topic);
		System.out.println(topic.getId());
		System.out.println(insert);
		Assert.assertNotNull(insert);*/
		BigInteger userId=new BigInteger("100");
		BigInteger classId=new BigInteger("100");
		String insert=classService.insertCourseSelectionById(userId, classId);
		Assert.assertNotNull(insert);
	}
	/*其实本质是修改-不能直接测试
	@Test
	public void testInsertClassById()
	{
		BigInteger userId=new BigInteger("200");
		BigInteger courseId=new BigInteger("200");
		BigInteger insert=classService.insertClassById(userId, courseId);
		Assert.assertNotNull(insert);
	}*/
	/*其实本质是修改-不能直接测试
	@Test void testInsertScoreRule()
	{
		BigInteger classId=new BigInteger("300");
		ClassInfo proportions=classService.getClassByClassId(new BigInteger("1"));
		BigInteger insert=classService.insertScoreRule(classId, proportions);
		Assert.assertNotNull(insert);
	}*/
}
