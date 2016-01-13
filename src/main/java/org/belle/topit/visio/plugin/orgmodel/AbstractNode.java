package org.belle.topit.visio.plugin.orgmodel;

public abstract class AbstractNode implements NodeText {

	protected String id;

	protected String fatherId;
	
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFatherId() {
		return fatherId;
	}

	public void setFatherId(String fatherId) {
		this.fatherId = fatherId;
	}

}
