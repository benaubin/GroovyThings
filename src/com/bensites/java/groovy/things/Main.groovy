package com.bensites.java.groovy.things

class Main {

	static main(args) {
		Person Ben = new Person("Ben", "Aubin", "Male")
		Person Mitch = new Person("Mitch", "Aubin", "Male")
		Ben.relateTo(Mitch, Relation.Son, false)
		Mitch.relateTo(Ben, Relation.Dad, false)
		println(Ben)
		println(Mitch)
		println("$Ben is related to $Mitch as " + Ben.pronoun() + " " + Ben.relatedAs(Mitch).toString())
		println("$Mitch is related to $Ben as " + Mitch.pronoun() + " " + Mitch.relatedAs(Ben).toString()) 
	}

}
