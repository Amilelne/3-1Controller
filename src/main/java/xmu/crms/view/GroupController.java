package xmu.crms.view;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GroupController {
	
	/**
	 * 按小组ID获取小组详情
	 * @param groupId
	 * @return
	 */
	@GetMapping("/group/{groupId}")
	public String groupGetDetailById(@PathVariable int groupId) {
		return "";
	}

	/**
	 * 组长辞职
	 */
	@PutMapping("/group/{groupId}/resign")
	public boolean groupLeaderResign(@PathVariable int groupId) {
		return true;
	}
	/**
	 * 成为组长
	 */
	@PutMapping("/group/{groupId}/assign")
	public boolean groupLeaderassign(@PathVariable int groupId) {
		return true;
	}
	/**
	 * 添加成员
	 */
	@PutMapping("/group/{groupId}/add")
	public boolean groupAddMember(@PathVariable int groupId) {
		return true;
	}
	/**
	 * 移除成员
	 */
	@PutMapping("/group/{groupId}/remove")
	public boolean groupRemoveMember(@PathVariable int groupId) {
		return true;
	}
	/**
	 * 小组按ID选择话题
	 */
	@PostMapping("/group/{groupId}/topic")
	public boolean groupChooseTopicById(@PathVariable int groupId) {
		return true;
	}
	/**
	 * 小组按ID取消选择话题
	 * @param groupId
	 * @param topicId
	 * @return
	 */
	@DeleteMapping("/group/{groupId}/topic/{topicId}")
	public boolean groupCancelTopicById(@PathVariable int groupId,int topicId) {
		return true;
	}
	/**
	 * 按ID获取小组的讨论课成绩
	 * @param groupId
	 * @return
	 */
	@GetMapping("/group/{groupId}/grade")
	public String groupGetGradeById(@PathVariable int groupId) {
		return "";
	}
	/**
	 * 按ID设置小组的报告分
	 * @param groupId
	 * @return
	 */
	@PutMapping("/group/{groupId}/grade/report")
	public boolean groupSetReportGrade(@PathVariable int groupId) {
		return true;
	}
	@PutMapping("/group/{groupId}/grade/presentation/{studentId}")
	public boolean groupSetReportGrade(@PathVariable int groupId,int studentId) {
		return true;
	}
	
}
