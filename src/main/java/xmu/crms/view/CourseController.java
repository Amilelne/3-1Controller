package xmu.crms.view;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import xmu.crms.entity.Course;

@Controller
public class CourseController {

	@RequestMapping(value="/course",method=GET)
	public Course getCourse() {
		return new Course(1, "OOAD", 3, 60,new Date("2017-9-1"),new Date("2017-9-1"));
	}
	
	@RequestMapping(value="/course/{courseId}",method=GET)
	public Course getCourseById(@PathVariable int courseId) {
		return new Course(1, "OOAD", 3, 60,new Date("2017-9-1"),new Date("2017-9-1"));
	}
}
