package org.belle.topit.visio.plugin.utils;

import org.belle.topit.model.organization.Organization;
import org.belle.topit.visio.plugin.config.VisioApplicationContext;

public class OrganizationChart {
	
	private VisioApplicationContext visioApplicationContext;

	public VisioApplicationContext getVisioApplicationContext() {
		return visioApplicationContext;
	}

	public void setVisioApplicationContext(
			VisioApplicationContext visioApplicationContext) {
		this.visioApplicationContext = visioApplicationContext;
	}

	// 使用的模型
	private final static String MODEL_VSS = "..//model/BASIC_M.VSS";
	// 使用的窗口模版
	private final static String MODEL_VST = "..//model/BASICD_M.VST";

	// 生成文件根据路径
	public boolean excute(String filePath, Organization organization) {
		return true;
	}

}
