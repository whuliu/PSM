package hibernate;

// Generated 2016-7-27 17:52:25 by Hibernate Tools 3.4.0.CR1

/**
 * Menus generated by hbm2java
 */
public class Menus implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private int pid;
	private int ppid;
	private String orderId;
	private String role;

	public Menus() {
	}

	public Menus(int id, String name, int pid, int ppid, String orderId,
			String role) {
		this.id = id;
		this.name = name;
		this.pid = pid;
		this.ppid = ppid;
		this.orderId = orderId;
		this.role = role;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPid() {
		return this.pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public int getPpid() {
		return this.ppid;
	}

	public void setPpid(int ppid) {
		this.ppid = ppid;
	}

	public String getOrderId() {
		return this.orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}