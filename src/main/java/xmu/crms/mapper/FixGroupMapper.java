package xmu.crms.mapper;

import java.math.BigInteger;
import java.util.List;

import xmu.crms.entity.FixGroup;
import xmu.crms.entity.SeminarGroup;
import xmu.crms.entity.User;

public interface FixGroupMapper {
	public Boolean deleteFixGroupMemberByFixGroupId(BigInteger fixGroupId);
	
	public BigInteger insertFixGroupMemberById(BigInteger userId,BigInteger groupId);
	
	public List<User> listFixGroupMemberByGroupId(BigInteger groupId);
	
	public List<FixGroup> listFixGroupByClassId(BigInteger classId);
	
	public Boolean deleteFixGroupByClassId(BigInteger classId);
	
	public Boolean deleteFixGroupByGroupId(BigInteger groupId);
	
	public Boolean updateFixGroupByGroupId(BigInteger groupId,FixGroup fixGroupBO);
	
	public FixGroup getFixGroupByGroupId(BigInteger groupId);
	
	public BigInteger insertStudnetIntoGroup(BigInteger userId,BigInteger groupId);
	
	public Boolean deleteTopicByGroupId(BigInteger groupId);
	
	public FixGroup getFixedGroupById(BigInteger userId,BigInteger classId);
	
	public Boolean updateSeminarGroupById(BigInteger groupId,SeminarGroup group);
}
