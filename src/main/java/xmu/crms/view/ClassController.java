package xmu.crms.view;

import com.xmu.ooad.classmanagementsystem.dto.ClassDTO;
import com.xmu.ooad.classmanagementsystem.dto.GpsDTO;
import com.xmu.ooad.classmanagementsystem.dto.UrlDTO;
import com.xmu.ooad.classmanagementsystem.vo.*;

import xmu.crms.view.vo.ClassVO;
import xmu.crms.view.vo.GroupVO;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
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
    public ResponseEntity<List<ClassVO>> getClass(@RequestParam("courseName") String courseName,@RequestParam("courseTeacher") string courseTeacher) {
		
		List<ClassVO> classVOs = new ArrayList<>();
		ClassVO temp;
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
    public ResponseEntity<ClassVO> getClass(@PathVariable("classId") BigInteger classId) {
    ClassVO vo = new ClassVO();
    vo.setId(new BigInteger("23"));
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
    public ResponseEntity updateClass(@PathVariable("classId") BigInteger classId, @RequestBody ClassDTO dto) {


    return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
    @DeleteMapping("/class/{classId}")
    public ResponseEntity deleteClass(@PathVariable("classId") BigInteger classId) {

    return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
    @GetMapping("/class/{classId}/student")
    public ResponseEntity<List<StudentVO>> getStudents(@PathVariable("classId") BigInteger classId) {

        List<StudentVO> students = new ArrayList<>();
        StudentVO studentVO = new StudentVO();
        studentVO.setId(new BigInteger("2357"));
        studentVO.setName("张三");
        studentVO.setNumber("24320152202333")
        students.add(studentVO);

        studentVO = new StudentVO();
        studentVO.setId(new BigInteger("8232"));
        studentVO.setName("李四");
        studentVO.setNumber("24320152202334")
        students.add(studentVO);

        return new ResponseEntity<List<StudentVO>>(students, HttpStatus.OK);
    }
    @PostMapping("/class/{classId}/student")
    public ResponseEntity<UrlDto> addStudent(@PathVariable("classId") BigInteger classId,@RequestBody StudentDto dto) {
        UrlDto url = new UrlDto("/class/"+ classId + "/student/" + dto.id);
        return new ResponseEntity<UrlDto>(url, HttpStatus.OK);
    }
    @DeleteMapping("/class/{classId}/student/{studentId}")
    public ResponseEntity deleteStudent(@PathVariable("classId") BigInteger classId, @PathVariable("studentId") BigInteger studentId) {

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
    @GetMapping("/class/{classId}/classgroup")
    public ResponseEntity<GroupVO> getClass(@PathVariable("classId") BigInteger classId) {

        GroupVO group;
        StudentVO studentVO = new StudentVO();
        studentVO.setId(new BigInteger("2357"));
        studentVO.setName("张三");
        studentVO.setNumber("24320152202333");
        group.setLeader(studentVO);

        studentVO = new StudentVO();
        studentVO.setId(new BigInteger("2756"));
        studentVO.setName("李四");
        studentVO.setNumber("23320152202443");
        group.addMember(studentVO);

        studentVO = new StudentVO();
        studentVO.setId(new BigInteger("2777"));
        studentVO.setName("王五");
        studentVO.setNumber("23320152202433");
        group.addMember(studentVO);

        return new ResponseEntity<GroupVO>(group, HttpStatus.OK);
    }


    @PutMapping("/class/{classId}/classgroup/resign")
    public ResponseEntity updateClass(@PathVariable("classId") BigInteger classId, @RequestBody StudentDto dto) {


        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @PutMapping("/class/{classId}/classgroup/assign")
    public ResponseEntity updateClass(@PathVariable("classId") BigInteger classId, @RequestBody StudentDto dto) {


        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @PutMapping("/class/{classId}/classgroup/add")
    public ResponseEntity updateClass(@PathVariable("classId") BigInteger classId, @RequestBody StudentDto dto) {


        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @PutMapping("/class/{classId}/classgroup/remove")
    public ResponseEntity updateClass(@PathVariable("classId") BigInteger classId, @RequestBody StudentDto dto) {


        return new ResponseEntity(HttpStatus.NO_CONTENT);
}