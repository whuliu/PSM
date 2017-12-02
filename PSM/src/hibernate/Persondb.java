package hibernate;
// Generated 2017-3-3 16:20:40 by Hibernate Tools 5.1.0.Beta1

import java.util.Date;

/**
 * Persondb generated by hbm2java
 */
public class Persondb implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String ptype;
	private String name;
	private String sex;
	private String idcard;
	private String birthday;
	private String phone;
	private String phoneUrgent;
	private String papersType;
	private String papersNo;
	private Date papersDate;
	private String userPwd;
	private String papersTypeTwo;
	private String papersNoTwo;
	private Date papersDateTwo;

	public Persondb() {
	}

	public Persondb(String ptype, String name, String sex, String idcard, String birthday, String phone,
			String phoneUrgent, String papersType, String papersNo, Date papersDate, String userPwd,
			String papersTypeTwo, String papersNoTwo, Date papersDateTwo) {
		this.ptype = ptype;
		this.name = name;
		this.sex = sex;
		this.idcard = idcard;
		this.birthday = birthday;
		this.phone = phone;
		this.phoneUrgent = phoneUrgent;
		this.papersType = papersType;
		this.papersNo = papersNo;
		this.papersDate = papersDate;
		this.userPwd = userPwd;
		this.papersTypeTwo = papersTypeTwo;
		this.papersNoTwo = papersNoTwo;
		this.papersDateTwo = papersDateTwo;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPtype() {
		return this.ptype;
	}

	public void setPtype(String ptype) {
		this.ptype = ptype;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getIdcard() {
		return this.idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	public String getBirthday() {
		return this.birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPhoneUrgent() {
		return this.phoneUrgent;
	}

	public void setPhoneUrgent(String phoneUrgent) {
		this.phoneUrgent = phoneUrgent;
	}

	public String getPapersType() {
		return this.papersType;
	}

	public void setPapersType(String papersType) {
		this.papersType = papersType;
	}

	public String getPapersNo() {
		return this.papersNo;
	}

	public void setPapersNo(String papersNo) {
		this.papersNo = papersNo;
	}

	public Date getPapersDate() {
		return this.papersDate;
	}

	public void setPapersDate(Date papersDate) {
		this.papersDate = papersDate;
	}

	public String getUserPwd() {
		return this.userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getPapersTypeTwo() {
		return this.papersTypeTwo;
	}

	public void setPapersTypeTwo(String papersTypeTwo) {
		this.papersTypeTwo = papersTypeTwo;
	}

	public String getPapersNoTwo() {
		return this.papersNoTwo;
	}

	public void setPapersNoTwo(String papersNoTwo) {
		this.papersNoTwo = papersNoTwo;
	}

	public Date getPapersDateTwo() {
		return this.papersDateTwo;
	}

	public void setPapersDateTwo(Date papersDateTwo) {
		this.papersDateTwo = papersDateTwo;
	}

}