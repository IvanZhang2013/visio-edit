package org.belle.topit.visio.plugin.orgmodel;

import java.util.ArrayList;
import java.util.List;

public class TestNode  extends AbstractNode{


	public static List<AbstractNode> create(){
		TestNode  testNode  = new TestNode();
		testNode.setId("0");
		testNode.setFatherId("0");
		TestNode  testNode1  = new TestNode();
		testNode1.setId("1");
		testNode1.setFatherId("0");
		TestNode  testNode2  = new TestNode();
		testNode2.setId("2");
		testNode2.setFatherId("1");
		TestNode  testNode3  = new TestNode();
		testNode3.setId("3");
		testNode3.setFatherId("1");
		TestNode  testNode4  = new TestNode();
		testNode4.setId("4");
		testNode4.setFatherId("2");
		List<AbstractNode>  list = new ArrayList<AbstractNode>();
		list.add(testNode);
		list.add(testNode1);
		list.add(testNode2);
		list.add(testNode3);
		list.add(testNode4);
		return list;
	}


	@Override
	public String createText() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}
