package xmu.crms.view.vo;

import java.util.List;

public class SeminarGradeVO {

	public List<PresentationGradeVO> presentationGrade;
	public int reportGrade;
	public float grade;
	public SeminarGradeVO(List<PresentationGradeVO> presentationGrade, int reportGrade, float grade) {
		this.presentationGrade = presentationGrade;
		this.reportGrade = reportGrade;
		this.grade = grade;
	}
	
}
