package hibernate;
// Generated 2017-3-31 14:34:12 by Hibernate Tools 5.2.0.CR1

import java.util.Date;

/**
 * Risksafepg generated by hbm2java
 */
public class Risksafepg implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String shigstage;
	private Date safeptime;
	private String bzperson;
	private String shperson;
	private String accessory;
	private String projectName;

	public Risksafepg() {
	}

	public Risksafepg(String shigstage, Date safeptime, String bzperson, String shperson, String accessory,
			String projectName) {
		this.shigstage = shigstage;
		this.safeptime = safeptime;
		this.bzperson = bzperson;
		this.shperson = shperson;
		this.accessory = accessory;
		this.projectName = projectName;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getShigstage() {
		return this.shigstage;
	}

	public void setShigstage(String shigstage) {
		this.shigstage = shigstage;
	}

	public Date getSafeptime() {
		return this.safeptime;
	}

	public void setSafeptime(Date safeptime) {
		this.safeptime = safeptime;
	}

	public String getBzperson() {
		return this.bzperson;
	}

	public void setBzperson(String bzperson) {
		this.bzperson = bzperson;
	}

	public String getShperson() {
		return this.shperson;
	}

	public void setShperson(String shperson) {
		this.shperson = shperson;
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
