package hibernate;
// Generated 2017-7-18 10:21:16 by Hibernate Tools 5.1.0.Beta1

/**
 * Fileupload generated by hbm2java
 */
public class Fileupload implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String file;
	private String year;
	private String month;
	private String title;
	private String projectName;

	public Fileupload() {
	}

	public Fileupload(String file, String year, String month, String title, String projectName) {
		this.file = file;
		this.year = year;
		this.month = month;
		this.title = title;
		this.projectName = projectName;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFile() {
		return this.file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public String getYear() {
		return this.year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getMonth() {
		return this.month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

}