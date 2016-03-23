package org.belle.topit.visio.plugin.utils;

import org.belle.topit.model.organization.Organization;
import org.belle.topit.visio.plugin.config.VisioApplicationContext;

@SuppressWarnings("unused")
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
	public void excute() throws Exception {
		VISIOApplication visioApplication  = new VISIOApplication(false);
		visioApplication.creatRoot(visioApplicationContext.getDocumentConfig());
		visioApplication.saveAs(visioApplicationContext.getDocumentConfig());
		visioApplication.quit();
	}

}
