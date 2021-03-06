package hibernate;
// Generated 2017-3-2 14:37:29 by Hibernate Tools 5.1.0.Final

import java.util.Date;

/**
 * Testpaper generated by hbm2java
 */
public class Testpaper implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Integer testId;
	private Integer projectId;
	private String name;
	private String idno;
	private Integer score1;
	private Integer score2;
	private Integer score3;
	private Integer score4;
	private String answerList1;
	private String answerList2;
	private String answerList3;
	private String answerList4;
	private Date testDate;

	public Testpaper() {
	}

	public Testpaper(Integer testId, Integer projectId, String name, String idno, Integer score1, Integer score2,
			Integer score3, Integer score4, String answerList1, String answerList2, String answerList3,
			String answerList4, Date testDate) {
		this.testId = testId;
		this.projectId = projectId;
		this.name = name;
		this.idno = idno;
		this.score1 = score1;
		this.score2 = score2;
		this.score3 = score3;
		this.score4 = score4;
		this.answerList1 = answerList1;
		this.answerList2 = answerList2;
		this.answerList3 = answerList3;
		this.answerList4 = answerList4;
		this.testDate = testDate;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getTestId() {
		return this.testId;
	}

	public void setTestId(Integer testId) {
		this.testId = testId;
	}

	public Integer getProjectId() {
		return this.projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdno() {
		return this.idno;
	}

	public void setIdno(String idno) {
		this.idno = idno;
	}

	public Integer getScore1() {
		return this.score1;
	}

	public void setScore1(Integer score1) {
		this.score1 = score1;
	}

	public Integer getScore2() {
		return this.score2;
	}

	public void setScore2(Integer score2) {
		this.score2 = score2;
	}

	public Integer getScore3() {
		return this.score3;
	}

	public void setScore3(Integer score3) {
		this.score3 = score3;
	}

	public Integer getScore4() {
		return this.score4;
	}

	public void setScore4(Integer score4) {
		this.score4 = score4;
	}

	public String getAnswerList1() {
		return this.answerList1;
	}

	public void setAnswerList1(String answerList1) {
		this.answerList1 = answerList1;
	}

	public String getAnswerList2() {
		return this.answerList2;
	}

	public void setAnswerList2(String answerList2) {
		this.answerList2 = answerList2;
	}

	public String getAnswerList3() {
		return this.answerList3;
	}

	public void setAnswerList3(String answerList3) {
		this.answerList3 = answerList3;
	}

	public String getAnswerList4() {
		return this.answerList4;
	}

	public void setAnswerList4(String answerList4) {
		this.answerList4 = answerList4;
	}

	public Date getTestDate() {
		return this.testDate;
	}

	public void setTestDate(Date testDate) {
		this.testDate = testDate;
	}

}
