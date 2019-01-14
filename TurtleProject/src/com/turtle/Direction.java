package com.turtle;
public enum Direction {

	NORTH(1),

	EAST(2),

	SOUTH(3),

	WEST(4);

	private int direction = 1;

	/**
	 * @param direction the direction to set
	 */
	private Direction(int direction) {
		this.direction = direction;
	}

	/**
	 * @return the direction
	 */
	public int getDirection() {
		return direction;
	}


	public boolean isNorth() {
		if( this == Direction.NORTH ) {
			return true;
		}
		return false;
	}

	public boolean isEast() {
		if( this == Direction.EAST ) {
			return true;
		}
		return false;
	}

	public boolean isSouth() {
		if( this == Direction.SOUTH ) {
			return true;
		}
		return false;
	}
	public boolean isWest() {
		if( this == Direction.WEST ) {
			return true;
		}
		return false;
	}

}