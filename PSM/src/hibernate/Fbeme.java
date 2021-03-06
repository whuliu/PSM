package hibernate;
// Generated 2017-3-9 20:18:50 by Hibernate Tools 5.1.0.Beta1

import java.util.Date;

/**
 * Fbeme generated by hbm2java
 */
public class Fbeme implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private String ename;
	private Date time;
	private String person;
	private String result;
	private String accessory;

	public Fbeme() {
	}

	public Fbeme(String name, String ename, Date time, String person, String result, String accessory) {
		this.name = name;
		this.ename = ename;
		this.time = time;
		this.person = person;
		this.result = result;
		this.accessory = accessory;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEname() {
		return this.ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Date getTime() {
		return this.time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String getPerson() {
		return this.person;
	}

	public void setPerson(String person) {
		this.person = person;
	}

	public String getResult() {
		return this.result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getAccessory() {
		return this.accessory;
	}

	public void setAccessory(String accessory) {
		this.accessory = accessory;
	}

}
