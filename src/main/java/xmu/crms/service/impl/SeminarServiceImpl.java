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
		/**
		 * 根据courseId获得所有的seminar信息
		 */
		List<Seminar> seminars = seminarMapper.listSeminarByCourseId(courseId);
		Iterator<Seminar> it = seminars.iterator();
		/**
		 * 根据seminarId删除相关的topic记录，删除seminarGroup表记录
		 * 最后再将seminar记录删除
		 */
		while(it.hasNext()) {
			try {
				seminarMapper.deleteTopicBySeminarId(it.next().getId());
				seminarMapper.deleteSeminarGroupBySeminarId(it.next().getId());
				this.deleteSeminarBySeminarId(it.next().getId());
			} catch (SeminarNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return true;
	}

	public Seminar getMySeminarBySeminarId(BigInteger seminarId, BigInteger userId)
			throws InfoIllegalException, SeminarNotFoundException {
		
		return seminarMapper.getSeminarBySeminarId(seminarId);
	}

	public Seminar getSeminarDetailBySeminarId(BigInteger seminarId, BigInteger userId)
			throws InfoIllegalException, SeminarNotFoundException {

		return seminarMapper.getSeminarDetailBySeminarId(seminarId, userId);
	}

	public Seminar getSeminarBySeminarId(BigInteger seminarId) throws InfoIllegalException, SeminarNotFoundException {
		
		return seminarMapper.getSeminarBySeminarId(seminarId);
	}

	public Boolean updateSeminarBySeminarId(BigInteger seminarId, Seminar seminar)
			throws InfoIllegalException, SeminarNotFoundException {
		
		return seminarMapper.updateSeminarBySeminarId(seminarId, seminar);
	}

	public Boolean deleteSeminarBySeminarId(BigInteger seminarId)
			throws InfoIllegalException, SeminarNotFoundException {
		
		return seminarMapper.deleteSeminarBySeminarId(seminarId);
	}

	public BigInteger insertSeminarByCourseId(BigInteger courseId, Seminar seminar)
			throws InfoIllegalException, CourseNotFoundException {
		
		return seminarMapper.insertSeminarByCourseId(courseId, seminar);
	}

}
