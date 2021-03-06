package hibernate;
// Generated 2017-4-19 10:22:30 by Hibernate Tools 5.2.0.CR1

import java.util.Date;

/**
 * Saveproplan generated by hbm2java
 */
public class Saveproplan implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Date anweihui;
	private Date threeGroup;
	private Date fourBuild;
	private Date saveBuild;
	private Date savePlan;
	private Date saveCheck;
	private Date buildPlan;
	private Date handlePlan;
	private Date saveBuildPlan;
	private Date dangerPublic;
	private Date executePlan;
	private Date workPlan;
	private String accessory;
	private String projectName;

	public Saveproplan() {
	}

	public Saveproplan(Date anweihui, Date threeGroup, Date fourBuild, Date saveBuild, Date savePlan, Date saveCheck,
			Date buildPlan, Date handlePlan, Date saveBuildPlan, Date dangerPublic, Date executePlan, Date workPlan,
			String accessory, String projectName) {
		this.anweihui = anweihui;
		this.threeGroup = threeGroup;
		this.fourBuild = fourBuild;
		this.saveBuild = saveBuild;
		this.savePlan = savePlan;
		this.saveCheck = saveCheck;
		this.buildPlan = buildPlan;
		this.handlePlan = handlePlan;
		this.saveBuildPlan = saveBuildPlan;
		this.dangerPublic = dangerPublic;
		this.executePlan = executePlan;
		this.workPlan = workPlan;
		this.accessory = accessory;
		this.projectName = projectName;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getAnweihui() {
		return this.anweihui;
	}

	public void setAnweihui(Date anweihui) {
		this.anweihui = anweihui;
	}

	public Date getThreeGroup() {
		return this.threeGroup;
	}

	public void setThreeGroup(Date threeGroup) {
		this.threeGroup = threeGroup;
	}

	public Date getFourBuild() {
		return this.fourBuild;
	}

	public void setFourBuild(Date fourBuild) {
		this.fourBuild = fourBuild;
	}

	public Date getSaveBuild() {
		return this.saveBuild;
	}

	public void setSaveBuild(Date saveBuild) {
		this.saveBuild = saveBuild;
	}

	public Date getSavePlan() {
		return this.savePlan;
	}

	public void setSavePlan(Date savePlan) {
		this.savePlan = savePlan;
	}

	public Date getSaveCheck() {
		return this.saveCheck;
	}

	public void setSaveCheck(Date saveCheck) {
		this.saveCheck = saveCheck;
	}

	public Date getBuildPlan() {
		return this.buildPlan;
	}

	public void setBuildPlan(Date buildPlan) {
		this.buildPlan = buildPlan;
	}

	public Date getHandlePlan() {
		return this.handlePlan;
	}

	public void setHandlePlan(Date handlePlan) {
		this.handlePlan = handlePlan;
	}

	public Date getSaveBuildPlan() {
		return this.saveBuildPlan;
	}

	public void setSaveBuildPlan(Date saveBuildPlan) {
		this.saveBuildPlan = saveBuildPlan;
	}

	public Date getDangerPublic() {
		return this.dangerPublic;
	}

	public void setDangerPublic(Date dangerPublic) {
		this.dangerPublic = dangerPublic;
	}

	public Date getExecutePlan() {
		return this.executePlan;
	}

	public void setExecutePlan(Date executePlan) {
		this.executePlan = executePlan;
	}

	public Date getWorkPlan() {
		return this.workPlan;
	}

	public void setWorkPlan(Date workPlan) {
		this.workPlan = workPlan;
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
