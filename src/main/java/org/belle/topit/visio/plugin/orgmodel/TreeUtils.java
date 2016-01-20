package org.belle.topit.visio.plugin.orgmodel;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;

public class TreeUtils {

	private List<? extends AbstractNode> listNode;

	public List<? extends AbstractNode> getListNode() {
		return listNode;
	}

	public void setListNode(List<? extends AbstractNode> listNode) {
		this.listNode = listNode;
	}

	public Tree excute(DocumentConfig documentConfig) {
		documentConfig.getRootCode();
		return null;
	}

	public Tree buildTree(DocumentConfig documentConfig) {
		Tree tree = new Tree();
		for (int i = 0; i < listNode.size(); i++) {
			AbstractNode node = listNode.get(i);
			if (node.getFatherId().equals(documentConfig.getRootCode())) {
				listNode.remove(node);
				tree.setId(node.getId());
				tree.setAbstractNode(node);
				List<Tree> list = this
						.addNode(tree, listNode);
				tree.setListNode(list);
				return tree;
			}
		}
		return tree;
	}

	@SuppressWarnings("null")
	private List<Tree> addNode(Tree tree,List<? extends AbstractNode> listNode2) {
		AbstractNode element = null;
		List<Tree> leaftree = null;
		List<Tree> retree = new ArrayList<Tree>();
		for (int j = 0; j < listNode2.size(); j++) {
			element = listNode2.get(j);
			if (tree.getAbstractNode().getId().equals(element.getFatherId())) {
				Tree  tree2 = new Tree();
				tree2.setId(element.getId());
				tree2.setAbstractNode(element);
				leaftree = addNode(tree2, listNode2);
				
				List<Tree>  treelist = tree.getListNode();
				if (treelist == null) {
					treelist = new ArrayList<Tree>();
				}
				tree2.setListNode(leaftree);
				retree.add(tree2);
			}
		}
		return retree;
	}

	
}