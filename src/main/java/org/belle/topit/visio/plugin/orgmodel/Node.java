package org.belle.topit.visio.plugin.orgmodel;

import java.util.List;

public class Node<Entry extends NodeText> {

	private String id;

	private List<Entry> children;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Entry> getChildren() {
		return children;
	}

	public void setChildren(List<Entry> children) {
		this.children = children;
	}

}
