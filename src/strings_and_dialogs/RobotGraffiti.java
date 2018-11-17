package strings_and_dialogs;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {

	public static void main(String[] args) throws Exception {
		Robot bee = new Robot();
		bee.penDown();
		bee.turn(25);
		bee.move(200);
		bee.turn(95);
		bee.move(200);
	}

}
