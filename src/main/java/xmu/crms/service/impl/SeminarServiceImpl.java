package xmu.crms.service.impl;

import java.math.BigInteger;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import xmu.crms.entity.Seminar;
import xmu.crms.entity.Topic;
import xmu.crms.exception.CourseNotFoundException;
import xmu.crms.exception.InfoIllegalException;
import xmu.crms.exception.SeminarNotFoundException;
import xmu.crms.mapper.SeminarMapper;
import xmu.crms.service.SeminarService;

public class SeminarServiceImpl implements SeminarService {
	@Autowired
	private SeminarMapper seminarMapper;

	public List<Seminar> listSeminarByCourseId(BigInteger courseId)
			throws InfoIllegalException, CourseNotFoundException {
		
		return seminarMapper.listSeminarByCourseId(courseId);
	}

	public Boolean deleteSeminarByCourseId(BigInteger courseId) throws InfoIllegalException, CourseNotFoundException {
		List<Seminar> seminars = seminarMapper.listSeminarByCourseId(courseId);
		Iterator<Seminar> it = seminars.iterator();
		while(it.hasNext()) {
			
		}
		return null;
	}

	public Seminar getMySeminarBySeminarId(BigInteger seminarId, BigInteger userId)
			throws InfoIllegalException, SeminarNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	public Seminar getSeminarDetailBySeminarId(BigInteger seminarId, BigInteger userId)
			throws InfoIllegalException, SeminarNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	public Seminar getSeminarBySeminarId(BigInteger seminarId) throws InfoIllegalException, SeminarNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean updateSeminarBySeminarId(BigInteger seminarId, Seminar seminar)
			throws InfoIllegalException, SeminarNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean deleteSeminarBySeminarId(BigInteger seminarId)
			throws InfoIllegalException, SeminarNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	public BigInteger insertSeminarByCourseId(BigInteger courseId, Seminar seminar)
			throws InfoIllegalException, CourseNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
