package strings_and_dialogs;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {

	public static void main(String[] args) throws Exception {
		Robot bee = new Robot();
		bee.setSpeed(15);
		bee.penDown();
		bee.turn(25);
		bee.move(200);
		bee.turn(125
			);
		bee.move(200);
		bee.turn(180);
		bee.move(70);
		bee.turn(300);
		bee.move(115);
		bee.penUp();
		bee.hide();
	}

}
