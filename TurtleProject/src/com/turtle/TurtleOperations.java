package com.turtle;
import java.util.ArrayList;
import java.util.List;

public class TurtleOperations {

	private int x = 1;
	private int y = 1;
	private String[] directionList = new String[] {"NORTH", "EAST", "SOUTH", "WEST"};

	private List<Obstacles> obstacleCoordinates = new ArrayList<Obstacles>();
	private Turtle turtle;

	public TurtleOperations(Turtle turtle, List<Obstacles> obstacleCoordinates) {
		this.obstacleCoordinates= obstacleCoordinates;
		this.turtle = turtle;
	}

	public TurtleOperations(Turtle turtle) {
		this.turtle = turtle;
	}

	public void moveForward() {

		if(turtle.getTurtleDirection() == Direction.NORTH.getDirection() && !hasObstacles(x, y+1)) {
			y++;
		} else if(turtle.getTurtleDirection() == Direction.EAST.getDirection() && !hasObstacles(x+1, y)) {
			x++;
		} else if(turtle.getTurtleDirection() == Direction.SOUTH.getDirection() && !hasObstacles(x, y-1)) {
			y--;
		} else if(turtle.getTurtleDirection() == Direction.WEST.getDirection() && !hasObstacles(x-1, y)) {
			x--;
		}
	}

	private boolean hasObstacles(int x, int y ) {

		for( Obstacles obs : obstacleCoordinates ) {
			if( x == obs.getX() && y == obs.getY() ) {
				return true;
			}
		}
		return false;
	}

	public void moveRight() {

		int currentDirection = turtle.getTurtleDirection();
		int setDirection = (currentDirection + 1) > 4 ? 1 : currentDirection;
		turtle.setTurtleDirection(setDirection);
	}

	public void moveLeft() {

		int currentDirection = turtle.getTurtleDirection();
		int setDirection = (currentDirection - 1) < 1 ? 4 : currentDirection;
		turtle.setTurtleDirection(setDirection);
	}

	public void move() {

		String input = turtle.getInputs();
		for( int move = 0; move < input.length(); move++ ) {

			char inputchar = input.charAt(move);
			switch(inputchar) {
			case 'F':
				moveForward();
				break;
			case 'R':
				moveRight();
				break;
			case 'L':
				moveLeft();
				break;
			}
		}
		System.out.println("{x=" + this.x + ", y=" + this.y + "} Direction = " + directionList[this.turtle.getTurtleDirection()-1]);
	}
}
