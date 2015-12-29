package org.belle.topit.visio.plugin.utils;

import org.belle.topit.visio.base.ClassFactory;
import org.belle.topit.visio.base.IVApplication;
import org.belle.topit.visio.base.IVDocument;
import org.belle.topit.visio.base.IVPage;
import org.slf4j.LoggerFactory;

public class VISIOApplication {

	private static org.slf4j.Logger logger = LoggerFactory
			.getLogger(JVisio.class);
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

	public VISIOApplication() {
		this(WINDOWNO_VISIBLE);
	}

	// 在visio程序打开程序的操作
	public VISIOApplication(boolean visible) {
		this.visioApp = ClassFactory.createApplication();
		this.visioApp.visible(visible);
		try {
			// 打开模具
			this.model = this.visioApp.documents().add(MODEL_VSS);
			// 打开模板
			this.template = this.visioApp.documents().add(MODEL_VST);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.quit();
		}

	}

	// 在visio程序打开程序的操作
	public VISIOApplication(boolean visible, String modelPath, String windowPath) {
		this.visioApp = ClassFactory.createApplication();
		this.visioApp.visible(visible);
		try {
			// 打开模具
			this.model = this.visioApp.documents().add(modelPath);
			// 打开模板
			this.template = this.visioApp.documents().add(windowPath);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.quit();
		}

	}

	// 在visio程序打开程序的操作
	public VISIOApplication(String modelPath, String windowPath) {
		this.visioApp = ClassFactory.createApplication();
		this.visioApp.visible(WINDOWNO_VISIBLE);
		try {
			// 打开模具
			this.model = this.visioApp.documents().add(modelPath);
			// 打开模板
			this.template = this.visioApp.documents().add(windowPath);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.quit();
		}

	}

	// 保存文档 distFile是绝对路径
	public short saveAs(String distFile) {
		IVPage tpage = this.template.pages().item(new Integer(1));
		tpage.autoSizeDrawing();
		return this.template.saveAs(distFile);
	}

	// 结束完之后退出程序
	public void quit() {
		this.visioApp.quit();
	}

}