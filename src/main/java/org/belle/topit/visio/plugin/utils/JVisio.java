package org.belle.topit.visio.plugin.utils;

import org.belle.topit.visio.base.ClassFactory;
import org.belle.topit.visio.base.IVApplication;
import org.belle.topit.visio.base.IVCell;
import org.belle.topit.visio.base.IVDocument;
import org.belle.topit.visio.base.IVMaster;
import org.belle.topit.visio.base.IVMasters;
import org.belle.topit.visio.base.IVPage;
import org.belle.topit.visio.base.IVShape;
import org.slf4j.LoggerFactory;

public class JVisio {

	private static org.slf4j.Logger log = LoggerFactory.getLogger(JVisio.class);

	/**
	 * Visio 程序
	 */
	IVApplication visioApp = null;

	/**
	 * 
	 * 默认visio可见
	 * 
	 */
	public JVisio() {
		this(true);
	}

	/**
	 * 
	 * @param visible
	 */
	public JVisio(boolean visible) {
		this.visioApp = ClassFactory.createApplication();
		this.visioApp.visible(visible);

	}

	/**
	 * 退出
	 * 
	 */
	public void quit() {
		this.visioApp.quit();
	}

	/**
	 * 打开文档
	 * 
	 * @param visioFile
	 *            visio file name.
	 * @return
	 */
	public IVDocument addDocument(String visioFile) {
		IVDocument doc = null;
		try {
			doc = this.visioApp.documents().add(visioFile);
		} catch (Exception ex) {
			log.error("Error of open the file '" + visioFile + "'!");
			ex.printStackTrace();
		}
		return doc;
	}

	/**
	 * 文件另存为
	 * 
	 * @param document
	 * @param distFile
	 *            这里的路径分隔符一定是要是 \\,例如E:\\workspace\\jvisio\\test\\tt_out.vsd
	 * @return
	 */
	public short saveAs(IVDocument document, String distFile) {
		IVPage tpage = document.pages().item(new Integer(1));
		tpage.autoSizeDrawing();

		return document.saveAs("Y:\\work.vsd");
	}

	/**
	 * 获取visio文档里的一个master
	 * 
	 * @param document
	 *            文档
	 * @param masterNameUIDOrIndex
	 *            master的索引或者名称
	 * @return
	 */
	public IVMaster getMaster(IVDocument document, String masterNameUIDOrIndex) {
		IVMasters masters = document.pages().item(new Integer(1)).document()
				.masters();
		IVMaster master = masters.item(masterNameUIDOrIndex);
		log.info("Get the master :" + (master == null ? null : master.name()));
		return master;
	}

	/**
	 * 获取单元格
	 * 
	 * 
	 * 
	 * for example :
	 * 
	 * 
	 * 
	 * double pageWidth = getCells(bts,"PageWidth").getResultIU();
	 * 
	 * @param master
	 * @param localeSpecificCellName
	 * @return
	 */
	public IVCell getCells(IVMaster master, String localeSpecificCellName) {
		return master.pageSheet().cells(localeSpecificCellName);
	}

	/**
	 * 画模具
	 * 
	 * @param document
	 *            文档
	 * @param master
	 *            模具
	 * @param xPos
	 *            x坐标
	 * @param yPos
	 *            y坐标
	 * @return
	 */
	public IVShape drop(IVDocument document, IVMaster master, double xPos,
			double yPos, boolean flag) {
		IVPage tpage = document.pages().item(new Integer(1));
		IVShape ivShape = tpage.drop(master, xPos, yPos);
		if (flag) {
			ivShape.cells("Height").resultIU(0.3);
			ivShape.cells("Width").resultIU(0.6);
			ivShape.text("测试看会是什么");
		}
		return ivShape;
	}

	/**
	 * 画折线
	 * 
	 * @param document
	 *            目标document
	 * @param fromShape
	 *            起点的模具
	 * @param fromPointName
	 *            起点的名称
	 * @param toShape
	 *            目标点的模具
	 * @param toPointName
	 *            目标点的名称
	 * @param connectLine
	 *            线模具
	 * @param needTab
	 */
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