package xmu.crms.mapper;

import java.math.BigInteger;
import java.util.List;

import xmu.crms.entity.ClassInfo;
import xmu.crms.entity.Course;

public interface CourseMapper {
	public String getCourseNameByCourseId(BigInteger userId);
	
	public List<Course> listCourseByUserId(BigInteger userId);
	
	public BigInteger insertCourseByUserId(BigInteger userId,Course course);
	
	public Course getCourseByCourseId(BigInteger courseId);
	
	public Boolean updateCourseByCourseId(BigInteger courseId,Course course);
	
	public Boolean deleteCourseByCourseId(BigInteger courseId);
	
	public List<Course> listCourseByCourseName(String courseName);
	
	public List<ClassInfo> listClassByCourseName(String courseName);
	
	public List<ClassInfo> listClassByTeacherName(String teacherName);
	
	public List<ClassInfo> listClassByUserId(BigInteger userId);
}
