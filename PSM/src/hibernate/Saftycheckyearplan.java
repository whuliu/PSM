package hibernate;
// Generated 2017-3-31 14:34:12 by Hibernate Tools 5.2.0.CR1

import java.util.Date;

/**
 * Saftycheckyearplan generated by hbm2java
 */
public class Saftycheckyearplan implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String bzren;
	private Date bztime;
	private String spren;
	private Date sptime;
	private String accessory;
	private String projectName;

	public Saftycheckyearplan() {
	}

	public Saftycheckyearplan(String bzren, Date bztime, String spren, Date sptime, String accessory,
			String projectName) {
		this.bzren = bzren;
		this.bztime = bztime;
		this.spren = spren;
		this.sptime = sptime;
		this.accessory = accessory;
		this.projectName = projectName;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBzren() {
		return this.bzren;
	}

	public void setBzren(String bzren) {
		this.bzren = bzren;
	}

	public Date getBztime() {
		return this.bztime;
	}

	public void setBztime(Date bztime) {
		this.bztime = bztime;
	}

	public String getSpren() {
		return this.spren;
	}

	public void setSpren(String spren) {
		this.spren = spren;
	}

	public Date getSptime() {
		return this.sptime;
	}

	public void setSptime(Date sptime) {
		this.sptime = sptime;
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
