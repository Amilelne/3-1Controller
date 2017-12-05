package xmu.crms.view;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

/**
 * @author zimu
 * @date 12/03
 * @description:test controller of seminar resource
 */

@RunWith(SpringRunner.class)
@WebMvcTest(SeminarController.class)
public class SeminarControllerTest {

	@Autowired 
	private MockMvc mockMvc;
	
	
	@Test
	public void testGetSeminarById() throws Exception{
		mockMvc.perform(get("/seminar/1"))
				.andExpect(status().isOk())
				.andExpect(jsonPath("id").exists())
				.andExpect(jsonPath("name").exists())
				.andExpect(jsonPath("startTime").exists())
				.andExpect(jsonPath("endTime").exists());
	}
	
}
