package com.turtle;
import java.util.ArrayList;
import java.util.List;

public class VhiTech {

	public static void main(String[] args) {

		Turtle turle = new Turtle();
		turle.setInputs("FFFRRFLF");

		List<Obstacles> obstacleList = new ArrayList<>();
		//Add obstacles like this
		/*obstacleList.add(new Obstacles(2, 3));
		obstacleList.add(new Obstacles(2, 3));
		obstacleList.add(new Obstacles(2, 3));*/
		TurtleOperations turleOps = new TurtleOperations(turle);
		turleOps.moveForward();
//		turleOps.move();
	}

}
