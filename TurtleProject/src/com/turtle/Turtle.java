package com.turtle;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @author narendar
 *
 */
public class Turtle {

	private int direction = 1;
	private String inputs;
	private List<Obstacles> obstacles;


	/**
	 * @return the inputs
	 */
	public String getInputs() {
		return inputs;
	}


	/**
	 * @param inputs the inputs to set
	 */
	public void setInputs(String inputs) {
		this.inputs = inputs;
	}


	/**
	 * @return the direction
	 */
	public int getTurtleDirection() {
		return direction;
	}


	/**
	 * @param direction the direction to set
	 */
	public void setTurtleDirection(int direction) {
		this.direction = direction;
	}


	/**
	 * @return the obstacles
	 */
	public List<Obstacles> getObstacles() {
		return obstacles;
	}


	/**
	 * @param obstacles the obstacles to set
	 */
	public void setObstacles(List<Obstacles> obstacles) {
		this.obstacles = Collections.unmodifiableList(obstacles);
	}

}
