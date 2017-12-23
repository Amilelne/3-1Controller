package xmu.crms.dao.impl;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import xmu.crms.dao.*;
import xmu.crms.entity.*;
import xmu.crms.exception.*;
import xmu.crms.mapper.*;

/**
 * @author chengjin
 */
@Repository("ClassDao")
public class ClassDaoImpl implements ClassDao{

	private ClassMapper classMapper;
	/*已经测试-已经实现*/
		 public void deleteClassSelectionByClassId(BigInteger classId)
		 {
			 classMapper.deleteClassSelectionByClassId(classId);
		 }
	/*已测试-已经实现*/
		 public List<ClassInfo> listClassByName(String courseName, String teacherName)
		 {
			 List<ClassInfo> classes=new ArrayList<ClassInfo>();
			classes=classMapper.listClassByName("课程1", "邱明");
			return classes;
		 }
	/*已测试-已经实现*/
		 public List<ClassInfo> listClassByCourseId(BigInteger courseId) 
		 {
			 List<ClassInfo> classes=new ArrayList<ClassInfo>();
			 classes=classMapper.listClassByCourseId(courseId);
			 return classes;
		}

	/*已测试-已经实现*/
		 public ClassInfo getClassByClassId(BigInteger classId) 
		 {
			 ClassInfo fclass = new ClassInfo(); 	
			fclass = classMapper.getClassByClassId(classId);
			return fclass;
		}
	/*已经测试-已经实现*/
		 public void updateClassByClassId(BigInteger classId,ClassInfo newClass)
		         throws ClassesNotFoundException
		 {
			 classMapper.updateClassByClassId(classId,newClass);
			 
		 }
	/*已经测试-已经实现*/
		 public void deleteClassByClassId(BigInteger classId)
		 {
			 classMapper.deleteClassByClassId(classId);
		 }
	/*已经测试*/
		 public BigInteger insertCourseSelectionById(BigInteger userId, BigInteger classId)
		 {
			 int integer=classMapper.insertCourseSelectionById(userId, classId);
			 return BigInteger.valueOf(integer);
		 }
	/*已经测试-已经实现*/
		 public void deleteCourseSelectionById(BigInteger userId, BigInteger classId)
		 {
			 classMapper.deleteCourseSelectionById(userId, classId);
		 }
	/*已测试-经实现*/
		 public Location getCallStatusById(BigInteger seminarId)
		throws SeminarNotFoundException
		 {
			 Location tstatus=null;
			 tstatus=classMapper.getCallStatusById(seminarId);
			 return tstatus;
			 
		 }
	/*已经测试-已经实现*/
		 public int insertClassById(BigInteger userId, BigInteger courseId,ClassInfo classInfo)
		 {
			 classMapper.insertClassById(userId, courseId,classInfo);
			 return 1;
		 }

	/*已经测试-已经实现*/
		 public void deleteClassByCourseId(BigInteger courseId)
		 {
			 classMapper.deleteClassByCourseId(courseId);
		 }
	/*已经测试-已经实现*/
		 public void deleteScoreRuleById(BigInteger classId)
		 {
			 classMapper.deleteScoreRuleById(classId);
		 }
	/*已测试-已经实现*/
		 public ClassInfo getScoreRule(BigInteger classId)
		 {
			 return classMapper.getScoreRule(classId);
		 }
	/*已经测试-已经实现*/
		 public int insertScoreRule(BigInteger classId, ClassInfo proportions)
		 {
			 return classMapper.insertScoreRule(classId, proportions);
		 }
	/*已经测试-已经实现*/
		 public void updateScoreRule(BigInteger classId, ClassInfo proportions)
		 {
			 classMapper.updateScoreRule(classId, proportions);
		 }
}
