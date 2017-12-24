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
	 public List<ClassInfo> listClassByName(String courseName, String teacherName) throws UserNotFoundException, CourseNotFoundException
	 {
		return classDao.listClassByName(courseName, teacherName);
	 }
	 public List<ClassInfo> listClassByCourseId(BigInteger courseId) throws CourseNotFoundException 
	 {
		 return classDao.listClassByCourseId(courseId);
	}
	 public ClassInfo getClassByClassId(BigInteger classId) throws ClassNotFoundException 
	 {
		return classDao.getClassByClassId(classId);
	}
	 public void updateClassByClassId(BigInteger classId,ClassInfo newClass) throws ClassNotFoundException
	 {
		 classDao.updateClassByClassId(classId,newClass);
		 
	 }
	 public void deleteClassByClassId(BigInteger classId) throws ClassNotFoundException
	 {
		 classDao.deleteClassByClassId(classId);
	 }
	 public BigInteger insertCourseSelectionById(BigInteger userId, BigInteger classId) throws ClassNotFoundException, UserNotFoundException
	 {
		 return classDao.insertCourseSelectionById(userId, classId);
	 }
	 public void deleteCourseSelectionById(BigInteger userId, BigInteger classId) throws ClassNotFoundException, UserNotFoundException
	 {
		 classDao.deleteCourseSelectionById(userId, classId);
	 }
	 public Location getCallStatusById(BigInteger classId,BigInteger seminarId)
	throws SeminarNotFoundException
	 {
		 return classDao.getCallStatusById(classId,seminarId);
		 
	 }
	 public BigInteger insertClassById(BigInteger userId, BigInteger courseId,ClassInfo classInfo) throws UserNotFoundException, CourseNotFoundException
	 {
		 return classDao.insertClassById(userId, courseId, classInfo);
	 }

	 public void deleteClassByCourseId(BigInteger courseId) throws CourseNotFoundException
	 {
		 classDao.deleteClassByCourseId(courseId);
	 }
	 public void deleteScoreRuleById(BigInteger classId) throws ClassNotFoundException
	 {
		 classDao.deleteScoreRuleById(classId);
	 }

	 public ClassInfo getScoreRule(BigInteger classId) throws ClassNotFoundException
	 {
		 return classDao.getScoreRule(classId);
	 }
	 public BigInteger insertScoreRule(BigInteger classId, ClassInfo proportions) throws ClassNotFoundException, InvalidOperationException
	 {
		 return classDao.insertScoreRule(classId, proportions);
	 }
	 public void updateScoreRule(BigInteger classId, ClassInfo proportions) throws ClassNotFoundException, InvalidOperationException
	 {
		 classDao.updateScoreRule(classId, proportions);
	 }
	 public BigInteger CallInRollById(Location location) throws SeminarNotFoundException, ClassNotFoundException {
			return classDao.CallInRollById(location);
		}
	
	 @Override
	 public List<ClassInfo> listClassByUserId(BigInteger userId)
				throws IllegalArgumentException, ClassesNotFoundException {
		 return classDao.listClassByUserId(userId);
	}
}
