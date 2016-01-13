package org.belle.topit.visio.plugin.utils;

import org.belle.topit.visio.base.ClassFactory;
import org.belle.topit.visio.base.IVApplication;
import org.belle.topit.visio.base.IVDocument;
import org.belle.topit.visio.base.IVPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VISIOApplication {

	private static Logger logger = LoggerFactory
			.getLogger(VISIOApplication.class);
	// 窗口是否显示 默认查窗口不显示
	private final static boolean WINDOWNO_VISIBLE = false;
	// 使用的模型
	private final static String MODEL_VSS = "..//model/BASIC_M.VSS";
	// 使用的窗口模版
	private final static String MODEL_VST = "..//model/BASICD_M.VSS";

	// 应用程序
	IVApplication visioApp = null;
	// 标准模版
	IVDocument model;
	// 创口模版
	IVDocument template;

	public VISIOApplication() throws Exception {
		this(WINDOWNO_VISIBLE);
	}

	public VISIOApplication(boolean visible) throws Exception {
		this.visioApp = ClassFactory.createApplication();
		this.visioApp.visible(visible);
		try {
			this.model = this.visioApp.documents().add(MODEL_VSS);
			this.template = this.visioApp.documents().add(MODEL_VST);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("创建visio程序应用失败！");
			throw new Exception(e);
		} finally {
			this.quit();
		}

	}

	public VISIOApplication(boolean visible, String modelPath, String windowPath)
			throws Exception {
		this.visioApp = ClassFactory.createApplication();
		this.visioApp.visible(visible);
		try {
			this.model = this.visioApp.documents().add(modelPath);
			this.template = this.visioApp.documents().add(windowPath);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("创建visio程序应用失败！");
			throw new Exception(e);
		} finally {
			this.quit();
		}

	}

	public VISIOApplication(String modelPath, String windowPath)
			throws Exception {
		this.visioApp = ClassFactory.createApplication();
		this.visioApp.visible(WINDOWNO_VISIBLE);
		try {
			this.model = this.visioApp.documents().add(modelPath);
			this.template = this.visioApp.documents().add(windowPath);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("创建visio程序应用失败！");
			throw new Exception(e);
		} finally {
			this.quit();
		}

	}

	public short saveAs(String distFile) {
		IVPage tpage = this.template.pages().item(new Integer(1));
		tpage.autoSizeDrawing();
		return this.template.saveAs(distFile);
	}

	public void quit() {
		this.visioApp.quit();
	}

}
