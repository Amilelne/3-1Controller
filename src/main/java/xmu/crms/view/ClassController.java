package xmu.crms.view;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import xmu.crms.view.vo.ClassProportionsVO;
import xmu.crms.view.vo.ClassVO;
import xmu.crms.view.vo.GroupVO;
import xmu.crms.view.vo.MeVO;
import xmu.crms.view.vo.Member;
import xmu.crms.view.vo.TopicVO;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author status200
 * @date 2017/11/29
 */
@RestController
public class ClassController {


    @GetMapping("/class")
    public ResponseEntity<List<ClassVO>> getClassController() {
		
		List<ClassVO> classVOs = new ArrayList<ClassVO>();
		ClassVO temp = new ClassVO();
		temp.setId(23);
		temp.setName("周三1-2节");
		temp.setNumStudent(60);
		temp.setTime("周三1-2,周五1-2");
		temp.setSite("公寓405");
		temp.setCourseName("OOAD");
		temp.setCourseTeacher("邱明");
		classVOs.add(temp);
		
        temp.setId(42);
		temp.setName("一班");
		temp.setNumStudent(60);
		temp.setTime("周三34节,周五12节");
		temp.setSite("海韵202");
		temp.setCourseName(".Net 平台开发");
		temp.setCourseTeacher("杨律青");
		classVOs.add(temp);
		
        return new ResponseEntity<List<ClassVO>>(classVOs, HttpStatus.OK);
    }
    
    @GetMapping("/class/{classId}")
    public ResponseEntity<ClassVO> getClassById(@PathVariable int classId) {
    ClassVO vo = new ClassVO();
    vo.setId(23);
    vo.setName("周三1-2节");
    vo.setNumStudent(120);
    vo.setSite("海韵201");
    vo.setTime("周三1-2节");
    vo.setCalling(-1);
    vo.setRoster("/roster/周三12班.xlsx");


    ClassProportionsVO classProportionsVO = new ClassProportionsVO();
    classProportionsVO.setA(20);
    classProportionsVO.setB(60);
    classProportionsVO.setC(20);
    classProportionsVO.setReport(50);
    classProportionsVO.setPresentation(50);
    vo.setProportions(classProportionsVO);

    return new ResponseEntity<ClassVO>(vo, HttpStatus.OK);
    }
    
    @PutMapping("/class/{classId}")
    public ResponseEntity updateClass(@PathVariable("classId") int classId) {


    return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/class/{classId}")
    public ResponseEntity deleteClass(@PathVariable("classId") int classId) {
       return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
    
    @GetMapping("/class/{classId}/student")
    public ResponseEntity<List<MeVO>> getStudents(@PathVariable("classId") int classId) {

        List<MeVO> students = new ArrayList<MeVO>();
        MeVO me = new MeVO();
        me.setId((2357));
        me.setName("张三");
        me.setNumber("24320152202333");
        students.add(me);

        me = new MeVO();
        me.setId(8232);
        me.setName("李四");
        me.setNumber("24320152202334");
        students.add(me);

        return new ResponseEntity<List<MeVO>>(students, HttpStatus.OK);
    }
    
    @PostMapping("/class/{classId}/student")
    public ResponseEntity<urlTest> addStudent(@PathVariable("classId") int classId) {
    	urlTest test=new urlTest();
    	test.setUrl("/class/"+ classId);
        return new ResponseEntity<urlTest>(test, HttpStatus.CREATED);
    }
    
    @DeleteMapping("/class/{classId}/student/{studentId}")
    public ResponseEntity deleteStudent(@PathVariable("classId") int classId, @PathVariable("studentId") int studentId) {

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
    
    @GetMapping("/class/{classId}/classgroup")
    public ResponseEntity<GroupVO> getClass(@PathVariable int classId) {
    	Member me = new Member(2357,"张三","24320152202333");
    	Member me1 = new Member(2357,"张三","24320152202333");
    	Member me2 = new Member(2357,"张三","24320152202333");
    	List<Member> mes=new ArrayList<Member>();
        mes.add(me1);
        mes.add(me2);
        List<TopicVO> topics=new ArrayList<TopicVO>();
        GroupVO group = new GroupVO(199,me,mes,topics);

        return new ResponseEntity<GroupVO>(group, HttpStatus.OK);
    }

    @PutMapping("/class/{classId}/classgroup/resign")
    public ResponseEntity resign(@PathVariable("classId") int classId) {


        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
    
    @PutMapping("/class/{classId}/classgroup/assign")
    public ResponseEntity assign(@PathVariable("classId") int classId) {


        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
    
    @PutMapping("/class/{classId}/classgroup/add")
    public ResponseEntity add(@PathVariable("classId") int classId) {


        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
    
    @PutMapping("/class/{classId}/classgroup/remove")
    public ResponseEntity remove(@PathVariable("classId") int classId) {


        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
class urlTest
{
	private String url;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
}