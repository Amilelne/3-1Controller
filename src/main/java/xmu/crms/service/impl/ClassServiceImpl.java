package xmu.crms.service.impl;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import xmu.crms.dao.ClassDao;
import xmu.crms.entity.*;
import xmu.crms.exception.*;
import xmu.crms.mapper.ClassMapper;
import xmu.crms.service.ClassService;
import xmu.crms.service.FixGroupService;
import xmu.crms.service.SeminarGroupService;
import org.springframework.web.bind.annotation.*;
import xmu.crms.entity.ClassInfo;
import xmu.crms.exception.*;
import xmu.crms.service.ClassService;
import java.math.BigInteger;

@Service("ClassService")
public class ClassServiceImpl implements ClassService{
	@Autowired
	private ClassDao classDao;
	
	 public void deleteClassSelectionByClassId(BigInteger classId)
	 {
		 classDao.deleteClassSelectionByClassId(classId);
	 }
	 public List<ClassInfo> listClassByName(String courseName, String teacherName)
	 {
		return classDao.listClassByName(courseName, teacherName);
	 }
	 public List<ClassInfo> listClassByCourseId(BigInteger courseId) 
	 {
		 return classDao.listClassByCourseId(courseId);
	}
	 public ClassInfo getClassByClassId(BigInteger classId) 
	 {
		return classDao.getClassByClassId(classId);
	}
	 public void updateClassByClassId(BigInteger classId,ClassInfo newClass)
	         throws ClassesNotFoundException
	 {
		 classDao.updateClassByClassId(classId,newClass);
		 
	 }
	 public void deleteClassByClassId(BigInteger classId)
	 {
		 classDao.deleteClassByClassId(classId);
	 }
	 public BigInteger insertCourseSelectionById(BigInteger userId, BigInteger classId)
	 {
		 return classDao.insertCourseSelectionById(userId, classId);
	 }
	 public void deleteCourseSelectionById(BigInteger userId, BigInteger classId)
	 {
		 classDao.deleteCourseSelectionById(userId, classId);
	 }
	 public Location getCallStatusById(BigInteger seminarId)
	throws SeminarNotFoundException
	 {
		 return classDao.getCallStatusById(seminarId);
		 
	 }
	 public int insertClassById(BigInteger userId, BigInteger courseId,ClassInfo classInfo)
	 {
		 return classDao.insertClassById(userId, courseId, classInfo);
	 }

	 public void deleteClassByCourseId(BigInteger courseId)
	 {
		 classDao.deleteClassByCourseId(courseId);
	 }
	 public void deleteScoreRuleById(BigInteger classId)
	 {
		 classDao.deleteScoreRuleById(classId);
	 }

	 public ClassInfo getScoreRule(BigInteger classId)
	 {
		 return classDao.getScoreRule(classId);
	 }
	 public int insertScoreRule(BigInteger classId, ClassInfo proportions)
	 {
		 return classDao.insertScoreRule(classId, proportions);
	 }
	 public void updateScoreRule(BigInteger classId, ClassInfo proportions)
	 {
		 classDao.updateScoreRule(classId, proportions);
	 }
	
}
