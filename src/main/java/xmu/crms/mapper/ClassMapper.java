package xmu.crms.mapper;

import java.math.BigInteger;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import xmu.crms.entity.ClassInfo;

public interface ClassMapper {
	public Boolean deleteClassSelectionByClassId(BigInteger classId);
	
    public List<ClassInfo> listClassByName(@Param("courseName")String courseName, @Param("teacherName")String teacherName);
    
    public List<ClassInfo> listClassByCourseId(BigInteger courseId);
    
    public ClassInfo getClassByClassId(BigInteger classId);
    
    public Boolean updateClassByClassId(BigInteger classId);
    
    public Boolean deleteClassByClassId(BigInteger classId);
    
    public String insertCourseSelectionById(BigInteger userId, BigInteger classId);
    
    public Boolean deleteCourseSelectionById(BigInteger userId, BigInteger classId);
    
    public ClassInfo getCallGroupStatusById(BigInteger seminarId);
    
    public BigInteger insertClassById(BigInteger userId, BigInteger courseId);
    
    public Boolean deleteClassByCourseId(BigInteger courseId);
    
    public Boolean deleteScoreRuleById(BigInteger classId);
    
    public ClassInfo getScoreRule(BigInteger classId);
    
    public BigInteger insertScoreRule(BigInteger classId, ClassInfo proportions);
    
    public Boolean updateScoreRule(@Param("classId")BigInteger classId, @Param("proportions")ClassInfo proportions);
}
