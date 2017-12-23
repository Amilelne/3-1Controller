package xmu.crms.mapper;

import java.math.BigInteger;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;

import xmu.crms.entity.ClassInfo;
import xmu.crms.entity.Location;

public interface ClassMapper {
	public Boolean deleteClassSelectionByClassId(BigInteger classId);
	
    public List<ClassInfo> listClassByName(@Param("courseName")String courseName, @Param("teacherName")String teacherName);
    
    public List<ClassInfo> listClassByCourseId(@Param("courseId")BigInteger courseId);
    
    public ClassInfo getClassByClassId(@Param("classId")BigInteger classId);
    
    public Boolean updateClassByClassId(@Param("classId")BigInteger classId);
    
    public Boolean deleteClassByClassId(@Param("classId")BigInteger classId);
    
    public int insertCourseSelectionById(@Param("userId")BigInteger userId, @Param("classId")BigInteger classId);
    
    public Boolean deleteCourseSelectionById(@Param("userId")BigInteger userId, @Param("classId")BigInteger classId);
    
    public Location getCallStatusById(@Param("seminarId")BigInteger seminarId);
    
    public BigInteger insertClassById(@Param("userId")BigInteger userId, @Param("courseId")BigInteger courseId,@Param("classInfo")ClassInfo classInfo);
    
    public void insertClassByIdWithTeacher(@Param("userId")BigInteger userId, @Param("courseId")BigInteger courseId,@Param("classInfo")ClassInfo classInfo);
    
    public Boolean deleteClassByCourseId(@Param("courseId")BigInteger courseId);
    
    public Boolean deleteScoreRuleById(@Param("classId")BigInteger classId);
    
    public ClassInfo getScoreRule(@Param("classId")BigInteger classId);
    
    public BigInteger insertScoreRule(@Param("classId")BigInteger classId, @Param("proportions")ClassInfo proportions);
    
    public Boolean updateScoreRule(@Param("classId")BigInteger classId, @Param("proportions")ClassInfo proportions);
}
