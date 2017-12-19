package xmu.crms.mapper;

import java.math.BigInteger;
import java.util.List;

public interface GradeMapper {
	public Boolean deleteStudentScoreGroupByTopicId(BigInteger topicId);

    public List<BigInteger> listSeminarGradeBySeminarGroupId(BigInteger userId, BigInteger seminarGroupId);

    public Boolean insertGroupGradeByUserId(BigInteger userId,BigInteger seminarId,BigInteger groupId,BigInteger grade) ;

    public Boolean updateGroupByGroupId(BigInteger seminar_group_id, BigInteger grade) ;

    public List<BigInteger> listSeminarGradeByStudentId(BigInteger userId);

}
