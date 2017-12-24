package xmu.crms.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.math.BigInteger;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import xmu.crms.entity.School;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
@Rollback
public class SchoolServiceTest {

	@Autowired
	private SchoolService schoolService;
	
	@Test
	public void testListSchoolByCity() {
		List<School> schools = schoolService.listSchoolByCity("北京");
		assertNotNull(schools);
	}
	
	@Test
	public void testInsertSchool() {
		School school = new School();
		school.setCity("北京");
		school.setName("清华大学");
		school.setProvince("直辖市");
		BigInteger result = schoolService.insertSchool(school);
		System.out.println(result);
		assertNotNull(result);
	}
	
	@Test
	public void testListProvince() {
		List<String> provinces = schoolService.listProvince();
		assertNotNull(provinces);
	}
	
	@Test
	public void testListCity() {
		List<String> citys = schoolService.listCity("直辖市");
		assertNotNull(citys);
	}
	
	@Test
	public void testGetSchoolBySchoolId() {
		School school;
		school = schoolService.getSchoolBySchoolId(new BigInteger("1"));
		System.out.println(school.getName());
		assertNotNull(school);
	}
}
