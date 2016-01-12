package org.belle.topit.visio.plugin.orgmodel;

public abstract class DocumentConfig {

	private String xPatch;

	private Node<?> node;

	public String getxPatch() {
		return xPatch;
	}

	public void setxPatch(String xPatch) {
		this.xPatch = xPatch;
	}

	public Node<?> getNode() {
		return node;
	}

	public void setNode(Node<?> node) {
		this.node = node;
	}

}
