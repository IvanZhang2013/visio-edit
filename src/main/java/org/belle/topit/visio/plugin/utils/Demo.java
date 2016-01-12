package org.belle.topit.visio.plugin.utils;

import org.belle.topit.visio.base.IVDocument;
import org.belle.topit.visio.base.IVMaster;
import org.belle.topit.visio.base.IVShape;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Demo {

	private static Logger log = LoggerFactory.getLogger(Demo.class);

	public static void main(String[] args) {

		JVisio visio = new JVisio();

		String basedir = "Y:\\workpaces-jq\\q\\src\\main\\java\\";

		try {
			// 打开模具 基本的流程图
			IVDocument model = visio.addDocument(basedir + "BASIC_M.VSS");
			// 打开模板
			IVDocument template = visio.addDocument(basedir + "BASICD_M.VST");

			// 获取两个流程 模型
			IVMaster bts = visio.getMaster(model, "矩形");
			IVMaster gfq = visio.getMaster(model, "矩形");
			IVMaster gfq1 = visio.getMaster(model, "矩形");
			IVMaster gfq2 = visio.getMaster(model, "矩形");
			IVMaster gfq3 = visio.getMaster(model, "矩形");
			IVMaster gfq4 = visio.getMaster(model, "矩形");
			IVMaster gfq5 = visio.getMaster(model, "矩形");
			IVMaster gfq6 = visio.getMaster(model, "矩形");
			IVMaster gfq7 = visio.getMaster(model, "矩形");
			IVMaster gfq8 = visio.getMaster(model, "矩形");
			IVMaster gfq9 = visio.getMaster(model, "矩形");

			log.info(bts.name());
			log.info(gfq.name());
			// 标注文字

			// Rectangle rectangle = new Rectangle();
			// rectangle.setX(6);
			// rectangle.setY(7);
			// visio.visioDrawText(template, "哈哈", rectangle, 0, 0,
			// "RGB(128,32,64)");

			// 连线
			IVShape btsShape = visio.drop(template, bts, -11, -3, true);
			IVShape gfqShape = visio.drop(template, gfq, 2, 3, true);

			IVShape gfqShape1 = visio.drop(template, gfq1, 2, 3, true);
			IVShape gfqShape2 = visio.drop(template, gfq2, 2, 3, true);
			IVShape gfqShape3 = visio.drop(template, gfq3, 2, 3, true);
			IVShape gfqShape4 = visio.drop(template, gfq4, 2, 3, true);
			IVShape gfqShape5 = visio.drop(template, gfq6, 2, 3, true);

			IVMaster line = visio.getMaster(model, "动态连接线");
			IVMaster line5 = visio.getMaster(model, "动态连接线");
			IVMaster line6 = visio.getMaster(model, "动态连接线");
			IVMaster line7 = visio.getMaster(model, "动态连接线");
			IVMaster line8 = visio.getMaster(model, "动态连接线");
			IVMaster line9 = visio.getMaster(model, "动态连接线");

			IVShape lineShape5 = visio.drop(template, line5, 1, 1, false);

			IVShape lineShape6 = visio.drop(template, line6, 1, 1, false);
			IVShape lineShape7 = visio.drop(template, line7, 1, 1, false);
			IVShape lineShape8 = visio.drop(template, line8, 1, 1, false);
			IVShape lineShape9 = visio.drop(template, line9, 1, 1, false);

			IVShape lineShape = visio.drop(template, line, 1, 1, false);

			visio.visioDrawOrthLine(template, gfqShape1, "Connections.X1",
					gfqShape2, "Connections.X3", lineShape9, false);
			visio.visioDrawOrthLine(template, gfqShape2, "Connections.X1",
					gfqShape3, "Connections.X3", lineShape8, false);
			visio.visioDrawOrthLine(template, gfqShape3, "Connections.X1",
					gfqShape4, "Connections.X3", lineShape7, false);
			visio.visioDrawOrthLine(template, gfqShape4, "Connections.X1",
					gfqShape5, "Connections.X3", lineShape6, false);
			visio.visioDrawOrthLine(template, gfqShape5, "Connections.X1",
					gfqShape, "Connections.X3", lineShape5, false);

			visio.visioDrawOrthLine(template, gfqShape, "Connections.X1",
					btsShape, "Connections.X3", lineShape, false);

			// 另存为
			visio.saveAs(template, basedir + "out.vsd");

		} catch (Exception ex) {// 捕捉Runtime Exception,并关闭visio.
			ex.printStackTrace();

		} finally {
			visio.quit();
		}

	}

}