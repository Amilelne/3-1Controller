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
	 public Boolean deleteClassSelectionByClassId(BigInteger classId)
	 {
		 return true;
	 }

	 public List<ClassInfo> listClassByName(String courseName, String teacherName)
	 {
		 List<ClassInfo> classes=new ArrayList<ClassInfo>();
		 return classes;
	 }

	 public List<ClassInfo> listClassByCourseId(BigInteger courseId) 
	 {
		 List<ClassInfo> classes=new ArrayList<ClassInfo>();
		 return classes;
	}

/*正在实现*/
	 public ClassInfo getClassByClassId(BigInteger classId) 
	 {
		 ClassInfo fclass = new ClassInfo(); 	
		fclass = classMapper.getClassByClassId(classId);
		return fclass;
	}


	 public Boolean updateClassByClassId(BigInteger classId,ClassInfo newClass)
	         throws ClassesNotFoundException
	 {
		 return true;
		 
	 }

	 public Boolean deleteClassByClassId(BigInteger classId)
	 {
		 return true;
	 }

	 public String insertCourseSelectionById(BigInteger userId, BigInteger classId)
	 {
		 return "1";
	 }

	 public Boolean deleteCourseSelectionById(BigInteger userId, BigInteger classId)
	 {
		 return true;
	 }

	 public ClassInfo getCallStatusById(BigInteger seminarId)
	         throws SeminarNotFoundException
	 {
		 ClassInfo tclass=null;
		 return tclass;
	 }

	
	 public BigInteger insertClassById(BigInteger userId, BigInteger courseId)
	 {
		 return new BigInteger("3");
	 }


	 public Boolean deleteClassByCourseId(BigInteger courseId)
	 {
		 return true;
	 }

 
	 public Boolean deleteScoreRuleById(BigInteger classId)
	 {
		 return true;
	 }

	 public ClassInfo getScoreRule(BigInteger classId)
	 {
		 ClassInfo tclass=null;
		 return tclass;
	 }

	 public BigInteger insertScoreRule(BigInteger classId, ClassInfo proportions)
	 {
		 return new BigInteger("3");
	 }
	 public Boolean updateScoreRule(BigInteger classId, ClassInfo proportions)
	 {
		 return true;
	 }
	
}
