package xmu.crms.mapper;

import java.math.BigInteger;
import java.util.List;

import xmu.crms.entity.School;

public interface SchoolMapper {

	public List<School> listSchoolByCity(String city);
	
	public Boolean insertSchool(School school);
	
	public List<String> listProvince();
	
	public List<String> listCity(String province);
	
	public School getSchoolBySchoolId(BigInteger SchoolId);
}
