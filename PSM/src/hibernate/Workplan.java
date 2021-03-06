package hibernate;
// Generated 2016-12-20 11:09:48 by Hibernate Tools 5.1.0.Beta1

import java.util.Date;

/**
 * Workplan generated by hbm2java
 */
public class Workplan implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String taskContent;
	private String dutyMan;
	private String taskScale;
	private Date timeYear;
	private Date planFinishTime;
	private Date realFinishTime;
	private String type;
	private String finishedTask;
	private String accessory;

	public Workplan() {
	}

	public Workplan(String taskContent, String dutyMan, String taskScale, Date timeYear, Date planFinishTime,
			Date realFinishTime, String type, String finishedTask, String accessory) {
		this.taskContent = taskContent;
		this.dutyMan = dutyMan;
		this.taskScale = taskScale;
		this.timeYear = timeYear;
		this.planFinishTime = planFinishTime;
		this.realFinishTime = realFinishTime;
		this.type = type;
		this.finishedTask = finishedTask;
		this.accessory = accessory;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTaskContent() {
		return this.taskContent;
	}

	public void setTaskContent(String taskContent) {
		this.taskContent = taskContent;
	}

	public String getDutyMan() {
		return this.dutyMan;
	}

	public void setDutyMan(String dutyMan) {
		this.dutyMan = dutyMan;
	}

	public String getTaskScale() {
		return this.taskScale;
	}

	public void setTaskScale(String taskScale) {
		this.taskScale = taskScale;
	}

	public Date getTimeYear() {
		return this.timeYear;
	}

	public void setTimeYear(Date timeYear) {
		this.timeYear = timeYear;
	}

	public Date getPlanFinishTime() {
		return this.planFinishTime;
	}

	public void setPlanFinishTime(Date planFinishTime) {
		this.planFinishTime = planFinishTime;
	}

	public Date getRealFinishTime() {
		return this.realFinishTime;
	}

	public void setRealFinishTime(Date realFinishTime) {
		this.realFinishTime = realFinishTime;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFinishedTask() {
		return this.finishedTask;
	}

	public void setFinishedTask(String finishedTask) {
		this.finishedTask = finishedTask;
	}

	public String getAccessory() {
		return this.accessory;
	}

	public void setAccessory(String accessory) {
		this.accessory = accessory;
	}

}
