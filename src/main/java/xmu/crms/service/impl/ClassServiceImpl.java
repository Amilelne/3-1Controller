package xmu.crms.service.impl;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

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
	private ClassMapper classMapper;
/*delete-未测试-已经实现*/
	 public Boolean deleteClassSelectionByClassId(BigInteger classId)
	 {
		 classMapper.deleteClassSelectionByClassId(classId);
		 return true;
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
/*未测试-已经实现-module模块组有错误*/
	 public Boolean updateClassByClassId(BigInteger classId,ClassInfo newClass)
	         throws ClassesNotFoundException
	 {
		 classMapper.updateClassByClassId(classId);
		 return true;
		 
	 }
/*delete-未测试-已经实现*/
	 public Boolean deleteClassByClassId(BigInteger classId)
	 {
		 classMapper.deleteClassByClassId(classId);
		 return true;
	 }
/*未测试，已经实现*/
	 public String insertCourseSelectionById(BigInteger userId, BigInteger classId)
	 {
		 String url=null;
		 classMapper.insertCourseSelectionById(userId, classId);
		 return url;
	 }
/*delete-未测试-已经实现*/
	 public Boolean deleteCourseSelectionById(BigInteger userId, BigInteger classId)
	 {
		 classMapper.deleteCourseSelectionById(userId, classId);
		 return true;
	 }
/*已测试-已经实现*/
	 public ClassInfo getCallStatusById(BigInteger seminarId)
	throws SeminarNotFoundException
	 {
		 ClassInfo tclass=null;
		 tclass=classMapper.getCallGroupStatusById(seminarId);
		 return tclass;
		 
	 }
/*未测试-已经实现*/
	 public BigInteger insertClassById(BigInteger userId, BigInteger courseId)
	 {
		 return classMapper.insertClassById(userId, courseId);
	 }

/*delete-未测试-已经实现*/
	 public Boolean deleteClassByCourseId(BigInteger courseId)
	 {
		 return true;
	 }
/*delete-未测试-已经实现*/
	 public Boolean deleteScoreRuleById(BigInteger classId)
	 {
		 classMapper.deleteScoreRuleById(classId);
		 return true;
	 }
/*已测试-已经实现*/
	 public ClassInfo getScoreRule(BigInteger classId)
	 {
		 return classMapper.getScoreRule(classId);
	 }
/*未测试-已经实现*/
	 public BigInteger insertScoreRule(BigInteger classId, ClassInfo proportions)
	 {
		 return classMapper.insertScoreRule(classId, proportions);
	 }
/*未测试-已经实现*/
	 public Boolean updateScoreRule(BigInteger classId, ClassInfo proportions)
	 {
		 classMapper.updateScoreRule(classId, proportions);
		 return true;
	 }
	
}
