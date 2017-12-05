package xmu.crms.view;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.locks.ReentrantLock;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import xmu.crms.entity.Course;

@RestController
public class CourseController {

	@RequestMapping(value="/course",method=GET)
	public Course getCourse() {
		return new Course(1, "OOAD", 3, 60,"2017-9-1","2017-9-1");
	}
	
	@RequestMapping(value="/course/{courseId}",method=GET)
	public Course getCourseById(@PathVariable int courseId) {
		return new Course(1, "OOAD", 3, 60,"2017-9-1","2017-9-1");
	}
}
