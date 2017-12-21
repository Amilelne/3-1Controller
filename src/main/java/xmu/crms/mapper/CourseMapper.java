package xmu.crms.mapper;

import java.math.BigInteger;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import xmu.crms.entity.ClassInfo;
import xmu.crms.entity.Course;

public interface CourseMapper {
	
	public List<Course> listCourseByUserId(BigInteger userId);
	
	public Boolean insertCourseByUserId(@Param("userId")BigInteger userId,@Param("course")Course course);
	
	public Course getCourseByCourseId(BigInteger courseId);
	
	public Boolean updateCourseByCourseId(BigInteger courseId,Course course);
	
	public Boolean deleteCourseByCourseId(BigInteger courseId);
	
	public List<Course> listCourseByCourseName(String courseName);
	
	public List<ClassInfo> listClassByCourseName(String courseName);
	
	public List<ClassInfo> listClassByTeacherName(String teacherName);
	
	public List<ClassInfo> listClassByUserId(BigInteger userId);
}
