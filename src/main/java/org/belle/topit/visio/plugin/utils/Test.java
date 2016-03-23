package org.belle.topit.visio.plugin.utils;

import java.util.List;

import org.belle.topit.visio.plugin.config.VisioApplicationContext;
import org.belle.topit.visio.plugin.orgmodel.DocumentConfig;
import org.belle.topit.visio.plugin.orgmodel.TestNode;

public class Test {
	
	public static void main(String[] args) throws Exception {
		List  list  =TestNode.create();
		OrganizationChart organizationChart = new OrganizationChart();
		
		DocumentConfig documentConfig  = new DocumentConfig();
		documentConfig.setListNode(list);
		documentConfig.setxPatch("D:\\st.vsd");
		documentConfig.setRootCode("0");
		
		VisioApplicationContext  vs  = new VisioApplicationContext();
		vs.setDocumentConfig(documentConfig);
		
		organizationChart.setVisioApplicationContext(vs);
		
		
		
		organizationChart.excute();
		
	}

}
