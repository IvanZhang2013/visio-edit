package org.belle.topit.visio.plugin.orgmodel;

import java.util.List;

public class Tree {

	private String id;

	protected AbstractNode abstractNode;

	protected List<Tree> listNode;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public AbstractNode getAbstractNode() {
		return abstractNode;
	}

	public void setAbstractNode(AbstractNode abstractNode) {
		this.abstractNode = abstractNode;
	}

	public List<Tree> getListNode() {
		return listNode;
	}

	public void setListNode(List<Tree> listNode) {
		this.listNode = listNode;
	}

}
