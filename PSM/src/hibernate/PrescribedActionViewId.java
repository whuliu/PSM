package hibernate;
// Generated 2017-9-9 19:26:20 by Hibernate Tools 5.1.4.Final

import java.util.Date;

/**
 * PrescribedActionViewId generated by hbm2java
 */
public class PrescribedActionViewId implements java.io.Serializable {

	private String project;
	private Integer actionId;
	private Boolean isDone;
	private String prescribedAction;
	private String relatedMenu;
	private String promptRole;
	private String promptCycle;

	public PrescribedActionViewId() {
	}

	public PrescribedActionViewId(String project, Integer actionId, Boolean isDone,
			String prescribedAction, String relatedMenu, String promptRole, String promptCycle) {
		this.project = project;
		this.actionId = actionId;
		this.isDone = isDone;
		this.prescribedAction = prescribedAction;
		this.relatedMenu = relatedMenu;
		this.promptRole = promptRole;
		this.promptCycle = promptCycle;
	}

	public String getProject() {
		return this.project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public Integer getActionId() {
		return this.actionId;
	}

	public void setActionId(Integer actionId) {
		this.actionId = actionId;
	}

	public Boolean getIsDone() {
		return this.isDone;
	}

	public void setIsDone(Boolean isDone) {
		this.isDone = isDone;
	}

	public String getPrescribedAction() {
		return this.prescribedAction;
	}

	public void setPrescribedAction(String prescribedAction) {
		this.prescribedAction = prescribedAction;
	}

	public String getRelatedMenu() {
		return this.relatedMenu;
	}

	public void setRelatedMenu(String relatedMenu) {
		this.relatedMenu = relatedMenu;
	}

	public String getPromptRole() {
		return this.promptRole;
	}

	public void setPromptRole(String promptRole) {
		this.promptRole = promptRole;
	}

	public String getPromptCycle() {
		return this.promptCycle;
	}

	public void setPromptCycle(String promptCycle) {
		this.promptCycle = promptCycle;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PrescribedActionViewId))
			return false;
		PrescribedActionViewId castOther = (PrescribedActionViewId) other;

		return ((this.getProject() == castOther.getProject()) || (this.getProject() != null
				&& castOther.getProject() != null && this.getProject().equals(castOther.getProject())))
				&& ((this.getActionId() == castOther.getActionId()) || (this.getActionId() != null
						&& castOther.getActionId() != null && this.getActionId().equals(castOther.getActionId())))
				&& ((this.getIsDone() == castOther.getIsDone()) || (this.getIsDone() != null
						&& castOther.getIsDone() != null && this.getIsDone().equals(castOther.getIsDone())))
				&& ((this.getPrescribedAction() == castOther.getPrescribedAction())
						|| (this.getPrescribedAction() != null && castOther.getPrescribedAction() != null
								&& this.getPrescribedAction().equals(castOther.getPrescribedAction())))
				&& ((this.getRelatedMenu() == castOther.getRelatedMenu())
						|| (this.getRelatedMenu() != null && castOther.getRelatedMenu() != null
								&& this.getRelatedMenu().equals(castOther.getRelatedMenu())))
				&& ((this.getPromptRole() == castOther.getPromptRole()) || (this.getPromptRole() != null
						&& castOther.getPromptRole() != null && this.getPromptRole().equals(castOther.getPromptRole())))
				&& ((this.getPromptCycle() == castOther.getPromptCycle())
						|| (this.getPromptCycle() != null && castOther.getPromptCycle() != null
								&& this.getPromptCycle().equals(castOther.getPromptCycle())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getProject() == null ? 0 : this.getProject().hashCode());
		result = 37 * result + (getActionId() == null ? 0 : this.getActionId().hashCode());
		result = 37 * result + (getIsDone() == null ? 0 : this.getIsDone().hashCode());
		result = 37 * result + (getPrescribedAction() == null ? 0 : this.getPrescribedAction().hashCode());
		result = 37 * result + (getRelatedMenu() == null ? 0 : this.getRelatedMenu().hashCode());
		result = 37 * result + (getPromptRole() == null ? 0 : this.getPromptRole().hashCode());
		result = 37 * result + (getPromptCycle() == null ? 0 : this.getPromptCycle().hashCode());
		return result;
	}

}
