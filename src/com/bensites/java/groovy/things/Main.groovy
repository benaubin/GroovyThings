package com.bensites.java.groovy.things

class Main {

	static main(args) {
		def ListObject<int> smallest = new ListObject(1,1);
		smallest.setObject(null)
		print(smallest.getObject().getMetaClass().toString())
	}

}
