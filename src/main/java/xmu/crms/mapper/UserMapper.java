package xmu.crms.mapper;

import java.math.BigInteger;
import java.util.List;

import xmu.crms.entity.*;
import xmu.crms.exception.*;

public interface UserMapper {
	public Boolean insertAttendanceById(BigInteger classId, BigInteger seminarId,
            BigInteger userId, double longitude, double latitude) throws
	InfoIllegalException,ClassesNotFoundException,SeminarNotFoundException;

	public List<Attendance> listAttendanceById(BigInteger classId, BigInteger seminarId)
	throws InfoIllegalException,ClassesNotFoundException,
	SeminarNotFoundException;

	public User signUpPhone(User user);

	public boolean deleteTeacherAccount(BigInteger userId) throws InfoIllegalException,
	UserNotFoundException;

	public Boolean deleteStudentAccount(BigInteger userId) throws InfoIllegalException,
	UserNotFoundException;

	public User getUserByUserId(BigInteger userId) throws InfoIllegalException,
	UserNotFoundException;

	public List<BigInteger> listUserIdByUserName(String userName)throws
	InfoIllegalException,UserNotFoundException;

	public Boolean updateUserByUserId(BigInteger userId, User user) throws
	UserNotFoundException;

	public List<User> listUserByClassId(BigInteger classId,String numBeginWith,
	            String nameBeginWith) throws InfoIllegalException,
	ClassesNotFoundException;

	public List<User> listUserByUserName(String userName) throws UserNotFoundException;

	public List<User> listPresentStudent(BigInteger seminarId, BigInteger classId)
	throws InfoIllegalException;

	public List<User> listAbsenceStudent(BigInteger seminarId,BigInteger classId) throws
	InfoIllegalException;
	
	public List<Course> listCourseByTeacherName(String teacherName);

}
