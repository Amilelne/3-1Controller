package xmu.crms.mapper;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import xmu.crms.entity.Course;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional(transactionManager="transactionManager")
@Rollback(value=true)
public class CourseMapperTest {
	@Autowired
	private CourseMapper courseMapper;
	
	@Test
	public void testListCourseByUserId() {
		BigInteger userId=new BigInteger("1");
		List<Course> course=courseMapper.listCourseByUserId(userId);
		Assert.assertEquals("课程1",course.get(0).getName());
	}
	
	@Test
	public void testInsertCourseByUserId() {
		Course course=new Course();
		course.setName("课程4");
		course.setStartDate(new Date());
		course.setEndDate(new Date());
		course.setDescription("课程4说明");
		course.setReportPercentage(50);
		course.setPresentationPercentage(50);
		course.setFivePointPercentage(10);
		course.setFourPointPercentage(30);
		course.setThreePointPercentage(60);
		BigInteger userId=new BigInteger("1");
		Boolean insert=courseMapper.insertCourseByUserId(userId, course);
		Assert.assertEquals(true, insert);
	}
	
	@Test
	public void testGetCourseByCourseId() {
		Course course=courseMapper.getCourseByCourseId(new BigInteger("1"));
		System.out.println(course.getId());
		System.out.println(course.getName());
		System.out.println(course.getStartDate());
		System.out.println(course.getEndDate());
		System.out.println(course.getTeacher());
		System.out.println(course.getTeacher().getName());
		System.out.println(course.getTeacher().getPhone());
		System.out.println(course.getTeacher().getNumber());
		System.out.println(course.getTeacher().getGender());
		System.out.println(course.getTeacher().getType());
		System.out.println(course.getTeacher().getTitle());
		System.out.println(course.getTeacher().getEducation());
		System.out.println(course.getTeacher().getEmail());
		System.out.println(course.getTeacher().getSchool());
		System.out.println(course.getDescription());
		System.out.println(course.getReportPercentage());
		System.out.println(course.getPresentationPercentage());
		System.out.println(course.getFivePointPercentage());
		System.out.println(course.getFourPointPercentage());
		System.out.println(course.getThreePointPercentage());
		Assert.assertEquals("课程1", course.getName());
	}
	
	
	
	
}
