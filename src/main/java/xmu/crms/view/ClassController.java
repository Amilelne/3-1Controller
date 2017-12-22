package xmu.crms.view;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import xmu.crms.entity.Topic;
import xmu.crms.exception.InfoIllegalException;
import xmu.crms.exception.TopicNotFoundException;
import xmu.crms.view.vo.ClassProportionsVO;
import xmu.crms.view.vo.ClassVO;
import xmu.crms.view.vo.GroupVO;
import xmu.crms.view.vo.MeVO;
import xmu.crms.view.vo.Member;
import xmu.crms.view.vo.TopicVO;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.*;
import xmu.crms.entity.ClassInfo;
import xmu.crms.exception.*;
import xmu.crms.service.ClassService;
import xmu.crms.service.TopicService;

/**
 *
 * @author status200
 * @date 2017/11/29
 */
@RestController
public class ClassController {

	private ClassService classService;
	 
    @GetMapping("/class")
    public ResponseEntity<List<ClassInfo>> getClassController(String courseName,String teacherName) {
    		List<ClassInfo> classes=new ArrayList<ClassInfo>();
    		classes=classService.listClassByName(courseName, teacherName);
        return new ResponseEntity<List<ClassInfo>>(classes, HttpStatus.OK);
    }
    
    @GetMapping("/class/{classId}")
    public ResponseEntity<ClassInfo> getClassById(@PathVariable int classId) {
    		ClassInfo fclass = new ClassInfo();
    		BigInteger classid=BigInteger.valueOf(classId);
		fclass = classService.getClassByClassId(classid);
		return new ResponseEntity<ClassInfo>(fclass,HttpStatus.OK);
		
    }
    /*没有要修改的实体*/
    @PutMapping("/class/{classId}")
    public ResponseEntity updateClass(@PathVariable("classId") int classId) {
    		

    return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
    
    @DeleteMapping("/class/{classId}")
    public ResponseEntity deleteClass(@PathVariable("classId") int classId) {
       classService.deleteClassByClassId(BigInteger.valueOf(classId));
    	return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
    /*不是classservice中的内容*/
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
    
    /*不是classservice的内容*/
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
    /*不是classservice中的内容*/
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
    /*不是classservice中的内容*/
    @PutMapping("/class/{classId}/classgroup/resign")
    public ResponseEntity resign(@PathVariable("classId") int classId) {


        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
    
    @PutMapping("/class/{classId}/classgroup/assign")
    public ResponseEntity assign(@PathVariable("classId") int classId) {


        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
   
    /*不是classservice中的内容*/
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