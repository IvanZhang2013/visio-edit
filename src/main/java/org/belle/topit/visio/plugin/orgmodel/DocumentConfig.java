package org.belle.topit.visio.plugin.orgmodel;

import java.util.List;

public class DocumentConfig {

	protected String xPatch;

	List<? extends AbstractNode> listNode;

	protected String rootCode;

	public String getxPatch() {
		return xPatch;
	}

	public void setxPatch(String xPatch) {
		this.xPatch = xPatch;
	}

	public String getRootCode() {
		return rootCode;
	}

	public void setRootCode(String rootCode) {
		this.rootCode = rootCode;
	}

	public List<? extends AbstractNode> getListNode() {
		return listNode;
	}

	public void setListNode(List<? extends AbstractNode> listNode) {
		this.listNode = listNode;
	}

}
