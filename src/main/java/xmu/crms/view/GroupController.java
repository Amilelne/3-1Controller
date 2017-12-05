package xmu.crms.view;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import xmu.crms.view.vo.GroupVO;
import xmu.crms.view.vo.Member;
import xmu.crms.view.vo.PresentationGradeVO;
import xmu.crms.view.vo.SeminarGradeVO;
import xmu.crms.view.vo.TopicVO;

@RestController
public class GroupController {
	
	/**
	 * 按小组ID获取小组详情4
	 * @param groupId
	 * @return
	 */
	@GetMapping("/group/{groupId}")
	public ResponseEntity<GroupVO> groupGetDetailById(@PathVariable int groupId) {
		Member leader = new Member(1, "张三");
		List<Member> member = new ArrayList<Member>();
		member.add(new Member(2, "李四"));
		member.add(new Member(3, "王二"));
		List<TopicVO> topics = new ArrayList<TopicVO>();
		GroupVO groupVO=new GroupVO(1,leader,member,topics);
		return new ResponseEntity<GroupVO>(groupVO,HttpStatus.OK);
	}

	/**
	 * 组长辞职
	 */
	@PutMapping("/group/{groupId}/resign")
	public ResponseEntity groupLeaderResign(@PathVariable int groupId) {
		return new ResponseEntity(HttpStatus.NO_CONTENT);
	}
	/**
	 * 成为组长
	 */
	@PutMapping("/group/{groupId}/assign")
	public ResponseEntity groupLeaderassign(@PathVariable int groupId) {
		return new ResponseEntity(HttpStatus.NO_CONTENT);
	}
	/**
	 * 添加成员
	 */
	@PutMapping("/group/{groupId}/add")
	public ResponseEntity groupAddMember(@PathVariable int groupId) {
		return new ResponseEntity(HttpStatus.NO_CONTENT);
	}
	/**
	 * 移除成员
	 */
	@PutMapping("/group/{groupId}/remove")
	public ResponseEntity groupRemoveMember(@PathVariable int groupId) {
		return new ResponseEntity(HttpStatus.NO_CONTENT);
	}
	/**
	 * 小组按ID选择话题
	 */
	@PostMapping("/group/{groupId}/topic")
	public ResponseEntity groupChooseTopicById(@PathVariable int groupId) {
		return new ResponseEntity(HttpStatus.CREATED);
	}
	/**
	 * 小组按ID取消选择话题
	 * @param groupId
	 * @param topicId
	 * @return
	 */
	@DeleteMapping("/group/{groupId}/topic/{topicId}")
	public ResponseEntity groupCancelTopicById(@PathVariable int groupId,@PathVariable int topicId) {
		return new ResponseEntity(HttpStatus.NO_CONTENT);
	}
	/**
	 * 按ID获取小组的讨论课成绩
	 * @param groupId
	 * @return
	 */
	@GetMapping("/group/{groupId}/grade")
	public ResponseEntity<SeminarGradeVO> groupGetGradeById(@PathVariable int groupId) {
		List<PresentationGradeVO> presentationGradeVOs = new ArrayList<PresentationGradeVO>();
		presentationGradeVOs.add(new PresentationGradeVO(257, 4));
		presentationGradeVOs.add(new PresentationGradeVO(258, 5));
		presentationGradeVOs.add(new PresentationGradeVO(1, 2));
		SeminarGradeVO seminarGradeVO = new SeminarGradeVO(presentationGradeVOs, 3, 4);
		return new ResponseEntity<SeminarGradeVO>(seminarGradeVO,HttpStatus.OK);
	}
	/**
	 * 按ID设置小组的报告分
	 * @param groupId
	 * @return
	 */
	@PutMapping("/group/{groupId}/grade/report")
	public ResponseEntity groupSetReportGrade(@PathVariable int groupId) {
		return new ResponseEntity(HttpStatus.NO_CONTENT);
	}
	
	/**
	 * 提交对其他小组的打分
	 * @param groupId
	 * @param studentId
	 * @return
	 */
	@PutMapping("/group/{groupId}/grade/presentation/{studentId}")
	public ResponseEntity groupSetReportGrade(@PathVariable int groupId,@PathVariable int studentId) {
		return new ResponseEntity(HttpStatus.NO_CONTENT);
	}
	
}
