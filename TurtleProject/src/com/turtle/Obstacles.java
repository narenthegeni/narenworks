package com.turtle;
/**
 * The X and Y coordinates of a TurtlePoint to move the move over a window.
 *
 */
public class Obstacles {

	private final int x;
	private final int y;

	public Obstacles(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * 
	 * @return the X coordinate
	 */
	public int getX() {
		return this.x;
	}

	/**
	 * 
	 * @return the Y coordinate
	 */
	public int getY() {
		return this.y;
	}

	@Override
	public String toString() {

		return "{x=" + x + ", y=" + y + "}";
	}
}