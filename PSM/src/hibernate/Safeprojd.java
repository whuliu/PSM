package hibernate;
// Generated 2017-2-17 18:33:50 by Hibernate Tools 5.1.0.Beta1

import java.util.Date;

/**
 * Safeprojd generated by hbm2java
 */
public class Safeprojd implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String person;
	private String jdperson;
	private Date time;
	private String accessory;

	public Safeprojd() {
	}

	public Safeprojd(String person, String jdperson, Date time, String accessory) {
		this.person = person;
		this.jdperson = jdperson;
		this.time = time;
		this.accessory = accessory;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPerson() {
		return this.person;
	}

	public void setPerson(String person) {
		this.person = person;
	}

	public String getJdperson() {
		return this.jdperson;
	}

	public void setJdperson(String jdperson) {
		this.jdperson = jdperson;
	}

	public Date getTime() {
		return this.time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String getAccessory() {
		return this.accessory;
	}

	public void setAccessory(String accessory) {
		this.accessory = accessory;
	}

}
