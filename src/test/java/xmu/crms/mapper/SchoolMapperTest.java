package xmu.crms.mapper;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import xmu.crms.entity.School;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
@Rollback
public class SchoolMapperTest {

	@Autowired
	private SchoolMapper schoolMapper;
	@Test
	public void testGetSchoolByCity() {
		School school;
		school = schoolMapper.getSchoolBySchoolId(1);
		System.out.println(school.getName());
		assertNotNull(school);
	}
	
	@Test
	public void testInsertSchool() {
		School school = new School();
		school.setCity("北京");
		school.setName("清华大学");
		school.setProvince("直辖市");
		boolean result = schoolMapper.insertSchool(school);
		assertEquals(result, true);
	}
	
}
