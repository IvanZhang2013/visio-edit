package org.belle.topit.model.organization;

import java.util.List;

public class Organization {

	private String name;
	private String remark;
	private List<Organization> orgs;
	private String orgId;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public List<Organization> getOrgs() {
		return orgs;
	}

	public void setOrgs(List<Organization> orgs) {
		this.orgs = orgs;
	}

	public String getOrgId() {
		return orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

}
