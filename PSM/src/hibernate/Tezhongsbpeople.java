package hibernate;
// Generated 2017-4-18 10:04:40 by Hibernate Tools 5.2.0.CR1

import java.util.Date;

/**
 * Tezhongsbpeople generated by hbm2java
 */
public class Tezhongsbpeople implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String no;
	private String fbName;
	private String type;
	private String project;
	private String name;
	private String gender;
	private String cardNo;
	private Date beginTime;
	private Date validTime;
	private String unit;
	private String peixun;
	private String ps;
	private String accessory;
	private String projectName;

	public Tezhongsbpeople() {
	}

	public Tezhongsbpeople(String no, String fbName, String type, String project, String name, String gender,
			String cardNo, Date beginTime, Date validTime, String unit, String peixun, String ps, String accessory,
			String projectName) {
		this.no = no;
		this.fbName = fbName;
		this.type = type;
		this.project = project;
		this.name = name;
		this.gender = gender;
		this.cardNo = cardNo;
		this.beginTime = beginTime;
		this.validTime = validTime;
		this.unit = unit;
		this.peixun = peixun;
		this.ps = ps;
		this.accessory = accessory;
		this.projectName = projectName;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNo() {
		return this.no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getFbName() {
		return this.fbName;
	}

	public void setFbName(String fbName) {
		this.fbName = fbName;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getProject() {
		return this.project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCardNo() {
		return this.cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public Date getBeginTime() {
		return this.beginTime;
	}

	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}

	public Date getValidTime() {
		return this.validTime;
	}

	public void setValidTime(Date validTime) {
		this.validTime = validTime;
	}

	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getPeixun() {
		return this.peixun;
	}

	public void setPeixun(String peixun) {
		this.peixun = peixun;
	}

	public String getPs() {
		return this.ps;
	}

	public void setPs(String ps) {
		this.ps = ps;
	}

	public String getAccessory() {
		return this.accessory;
	}

	public void setAccessory(String accessory) {
		this.accessory = accessory;
	}

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

}
