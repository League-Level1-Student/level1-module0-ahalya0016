package houses;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class houses {
	static Robot rob = new Robot();
public static void main(String[] args) {
	rob.setWindowColor(Color.BLACK);
	rob.setWindowSize(900, 900);
	rob.setX(800);   
	rob.setY(800);
	rob.setSpeed(100);
	rob.turn(270);
	rob.setPenWidth(10);
	rob.penDown();

	
	for (int i = 0; i < 3; i++) {
		drawHouses(200, Color.RED);
		drawPointyRoof(100, Color.MAGENTA);
		drawHouses(250, Color.CYAN);
	}
	
}
static void drawHouses(int height, Color color) {
	rob.setPenColor(7,117,42);
	rob.move(25);
	rob.setPenColor(color);
	rob.turn(90);
	rob.move(height);
	rob.turn(270);
	rob.move(50);
	rob.turn(270);
	rob.move(height);
	rob.turn(90);

	
}

static void drawPointyRoof(int height, Color color) {
	rob.setPenColor(7,117,42);
	rob.move(25);
	rob.setPenColor(color);
	rob.turn(90);
	rob.move(height);
	rob.turn(315);
	rob.move(30);
	rob.turn(270);
	rob.move(30);
	rob.turn(315);
	rob.move(height);
	rob.turn(90);
}
}
