package houses;

import org.jointheleague.graphical.robot.Robot;

public class houses {
	static Robot rob = new Robot();
public static void main(String[] args) {
	
	rob.setWindowSize(900, 900);
	rob.setX(800);   
	rob.setY(800);
	
	rob.setSpeed(100);
	rob.turn(270);
	rob.setPenColor(0,137,41);
	rob.setPenWidth(10);
	rob.penDown();
	rob.move(25);
	
	for (int i = 0; i < 10; i++) {
		drawHouses();
	}
	
}
static void drawHouses() {
	rob.turn(90);
	rob.move(100);
	rob.turn(270);
	rob.move(50);
	rob.turn(270);
	rob.move(100);
	rob.turn(90);
	rob.move(25);
}

}
