package hibernate;
// Generated Oct 22, 2016 11:58:15 PM by Hibernate Tools 5.1.0.Beta1

/**
 * Trainplan generated by hbm2java
 */
public class Trainplan implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String content;
	private String employee;
	private String method;
	private String classDate;
	private String classTime;
	private String budget;
	private String result;
	private String accessory;
	private String tableId;

	public Trainplan() {
		
	}

	public Trainplan(String content, String employee, String method, String classDate, String classTime, String budget,
			String result, String accessory, String tableId) {
		this.content = content;
		this.employee = employee;
		this.method = method;
		this.classDate = classDate;
		this.classTime = classTime;
		this.budget = budget;
		this.result = result;
		this.accessory = accessory;
		this.tableId = tableId;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getEmployee() {
		return this.employee;
	}

	public void setEmployee(String employee) {
		this.employee = employee;
	}

	public String getMethod() {
		return this.method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getClassDate() {
		return this.classDate;
	}

	public void setClassDate(String classDate) {
		this.classDate = classDate;
	}

	public String getClassTime() {
		return this.classTime;
	}

	public void setClassTime(String classTime) {
		this.classTime = classTime;
	}

	public String getBudget() {
		return this.budget;
	}

	public void setBudget(String budget) {
		this.budget = budget;
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

	public String getTableId() {
		return this.tableId;
	}

	public void setTableId(String tableId) {
		this.tableId = tableId;
	}

}