import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Graffiti {
	public static void main(String[] args) {
		Robot wally = new Robot();

		wally.setPenColor(Color.magenta);
		wally.penDown();
		wally.setSpeed(10);
		wally.move(500);
		wally.turn(90);
		wally.move(500);
		wally.turn(90);
		wally.move(500);
		wally.setPenColor(Color.GREEN);
		wally.turn(90);
		wally.move(500);
		wally.turn(90);
		wally.move(250);
		wally.turn(90);
		wally.setPenColor(Color.BLUE);
		wally.move(500);
		wally.turn(90);
		wally.move(250);
		wally.turn(90);
		wally.move(250);
		wally.turn(90);
		wally.move(500);
		wally.setPenColor(Color.BLACK);
		wally.turn(205);
	wally.move(520);
wally.turn(-110);
	wally.move(500);
wally.turn(-125);
wally.move(530);	
	}
}
