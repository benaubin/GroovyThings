package com.bensites.java.groovy.things

class HeyRobot {
	
	Direction2D d
	
	HeyRobot(Direction2D D) {
		d = D
	}
	void turnLeft() {
		d = d.turn(Direction2D.left)
	}

}
