package com.collection.serialization_process;
//class Test

//class Test2-- again using for new eg
import java.io.Serializable;

class Emp implements Serializable {
	int eid;
	transient String ename;
	/*
	 * Transient Keyword= If variable dwclared as Transient, that variable will not
	 * participate on serialization instead of original values the default values
	 * will be transfered
	 */

	public Emp(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}

}
