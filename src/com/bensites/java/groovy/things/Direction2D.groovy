package com.bensites.java.groovy.things


enum Direction2D {
	up(0),
	left(1),
	down(3),
	right(4)
	
	int numeric
	Direction2D(int i){
		numeric = i
	}

	
	public Direction2D turn(Direction2D Direction) {
		int thing = this.getNumeric() + Direction.getNumeric()
		thing.mod(4)
	}
}
