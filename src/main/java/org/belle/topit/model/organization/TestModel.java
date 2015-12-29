package org.belle.topit.model.organization;

import java.util.ArrayList;
import java.util.List;

public class TestModel {

	static Organization getModel() {
		Organization organization = new Organization();
		organization.setName("总部");
		organization.setRemark("总部人员100人");
		organization.setOrgId("01");

		List<Organization> list1 = new ArrayList<Organization>();

		Organization organization1 = new Organization();
		organization1.setName("华南");
		organization1.setRemark("华南人员100人");
		organization1.setOrgId("02");

		Organization organization2 = new Organization();
		organization2.setName("华北");
		organization2.setRemark("华北人员100人");
		organization2.setOrgId("03");

		list1.add(organization1);
		list1.add(organization2);

		organization.setOrgs(list1);

		List<Organization> list2 = new ArrayList<Organization>();

		Organization organization3 = new Organization();
		organization3.setName("北京");
		organization3.setRemark("北京人员100人");
		organization3.setOrgId("03");

		list2.add(organization3);
		organization2.setOrgs(list2);

		return organization;
	}
}
