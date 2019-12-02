package ex8_4;

public class RobotFireGunCommand implements Command {
	private Robot robot = new Robot();
	

	public void setRobot(Robot robot) {
		this.robot = robot;
	}
	
	public void excute() {
		// TODO Auto-generated method stub
		robot.fireGun();
	}
}
