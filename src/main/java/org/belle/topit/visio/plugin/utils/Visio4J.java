package org.belle.topit.visio.plugin.utils;

import org.belle.topit.visio.base.ClassFactory;
import org.belle.topit.visio.base.IVApplication;
import org.belle.topit.visio.base.IVCell;
import org.belle.topit.visio.base.IVDocument;
import org.belle.topit.visio.base.IVMaster;
import org.belle.topit.visio.base.IVMasters;
import org.belle.topit.visio.base.IVPage;
import org.belle.topit.visio.base.IVShape;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Visio4J {

	private static Logger log = LoggerFactory.getLogger(Visio4J.class);

	IVApplication visioApp = null;

	public Visio4J() {
		this(false);
	}

	public Visio4J(boolean visible) {
		this.visioApp = ClassFactory.createApplication();
		this.visioApp.visible(visible);
		visioApp.commandBars();
	}

	public void quit() {
		this.visioApp.quit();
	}

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

	public short saveAs(IVDocument document, String distFile) {
		IVPage tpage = document.pages().item(new Integer(1));
		tpage.autoSizeDrawing();
		return document.saveAs(distFile);
	}

	public IVMaster getMaster(IVDocument document, String masterNameUIDOrIndex) {
		IVMasters masters = document.pages().item(new Integer(1)).document()
				.masters();
		IVMaster master = masters.item(masterNameUIDOrIndex);
		log.info("Get the master :" + (master == null ? null : master.name()));
		return master;
	}

	public IVCell getCells(IVMaster master, String localeSpecificCellName) {
		return master.pageSheet().cells(localeSpecificCellName);
	}

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
