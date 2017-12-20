package xmu.crms.mapper;

import java.math.BigInteger;

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
public class CourseMapperTest {
	@Autowired
	private CourseMapper courseMapper;
	
	@Test
	public void testGetCourseNameByCourseId() {
		Assert.assertEquals("课程1", courseMapper.getCourseNameByCourseId(new BigInteger("1")));
	}
	
	@Test
	@Transactional
	@Rollback
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
	
	@Test
	@Transactional
	@Rollback
	public void testInsertCourseByUserId() {
		
	}
}
