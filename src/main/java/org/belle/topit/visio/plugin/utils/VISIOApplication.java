package org.belle.topit.visio.plugin.utils;

import java.util.ArrayList;
import java.util.List;

import org.belle.topit.visio.base.ClassFactory;
import org.belle.topit.visio.base.IVApplication;
import org.belle.topit.visio.base.IVCell;
import org.belle.topit.visio.base.IVDocument;
import org.belle.topit.visio.base.IVMaster;
import org.belle.topit.visio.base.IVMasters;
import org.belle.topit.visio.base.IVPage;
import org.belle.topit.visio.base.IVShape;
import org.belle.topit.visio.plugin.orgmodel.AbstractNode;
import org.belle.topit.visio.plugin.orgmodel.DocumentConfig;
import org.belle.topit.visio.plugin.orgmodel.Tree;
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

	public void creatRoot(DocumentConfig documentConfig,
			List<? extends AbstractNode> listNode) throws Exception {
		Tree tree = new Tree();
		for (int i = 0; i < listNode.size(); i++) {
			AbstractNode node = listNode.get(i);
			if (node.getFatherId().equals(documentConfig.getRootCode())) {
				listNode.remove(node);
				String docText = node.createText();
				// 画上级节点
				IVMaster farthorNode = this.getMaster(this.model, "矩形");
				IVShape farthorShape = this.drop(this.template, farthorNode, 2,
						3, true, docText);
				List<IVShape> list = this.creatNode(node, listNode);
				for (int j = 0; j < list.size(); j++) {
					IVShape sonShape = list.get(j);
					// 画动态连接线
					IVMaster line = this.getMaster(model, "动态连接线");
					IVShape lineShape = this.drop(template, line, 1, 1, false,
							null);
					// 画线连接
					this.visioDrawOrthLine(template, farthorShape,
							"Connections.X1", sonShape, "Connections.X3",
							lineShape, false);
				}
			}
		}
	}

	public List<IVShape> creatNode(AbstractNode node,
			List<? extends AbstractNode> listNode) throws Exception {
		List<IVShape> listShape = new ArrayList<IVShape>();

		AbstractNode element = null;

		List<IVShape> sonShapeList = null;

		for (int j = 0; j < listNode.size(); j++) {
			element = listNode.get(j);
			// 画节点
			IVMaster farthorNode = this.getMaster(this.model, "矩形");
			IVShape farthorShape = this.drop(this.template, farthorNode, 2, 3,
					true, element.createText());
			if (node.getId().equals(element.getFatherId())) {
				sonShapeList = creatNode(element, listNode);
				listNode.remove(element);
				j = j - 1;
				for (int i = 0; i < sonShapeList.size(); j++) {
					IVShape sonShape = sonShapeList.get(j);
					// 画动态连接线
					IVMaster line = this.getMaster(model, "动态连接线");
					IVShape lineShape = this.drop(template, line, 1, 1, false,null);
					// 画线连接
					this.visioDrawOrthLine(template, farthorShape,
							"Connections.X1", sonShape, "Connections.X3",
							lineShape, false);
				}
				listShape.add(farthorShape);
			}
		}
		return listShape;
	}

	public IVMaster getMaster(IVDocument document, String masterNameUIDOrIndex) {
		IVMasters masters = document.pages().item(new Integer(1)).document()
				.masters();
		IVMaster master = masters.item(masterNameUIDOrIndex);
		logger.info("Get the master :"
				+ (master == null ? null : master.name()));
		return master;
	}

	public IVShape drop(IVDocument document, IVMaster master, double xPos,
			double yPos, boolean flag, String docText) {
		IVPage tpage = document.pages().item(new Integer(1));
		IVShape ivShape = tpage.drop(master, xPos, yPos);
		if (flag) {
			ivShape.cells("Height").resultIU(0.3);
			ivShape.cells("Width").resultIU(0.6);
			ivShape.text(docText);
		}
		return ivShape;
	}

	public void visioDrawOrthLine(IVDocument document, IVShape fromShape,
			String fromPointName, IVShape toShape, String toPointName,
			IVShape connectLine, boolean needTab) {
		// 要连线的起点
		IVCell fromCell = fromShape.cells(fromPointName);
		// 要连线的终点
		IVCell toCell = toShape.cells(toPointName);
		// 线的起终点
		IVCell beginOfLine = connectLine.cells("BeginX");
		IVCell endOfLine = connectLine.cells("EndX");
		// 连接
		beginOfLine.glueTo(fromCell);
		endOfLine.glueTo(toCell);
		if (needTab) {
			IVCell x2 = connectLine.cells("Geometry1.X2");
			double k = x2.resultIU();
			String v = String.valueOf(k * 2);
			x2.formulaU(v);
			connectLine.cells("Geometry1.X3").formulaU(v);
		}
	}
}
