package ex8_4;

public class main {

	public static void main(String[] args) {
		MultyButton button = new MultyButton();
		CarEngineCommand carCMD = new CarEngineCommand();
		Car car = new Car();
		carCMD.setTheCar(car);

		RobotFireGunCommand robotCMD = new RobotFireGunCommand();
		Robot robot = new Robot();
		robotCMD.setRobot(robot);
		button.addCommand(robotCMD);
		button.setTheCommand(0, carCMD);

		LampPowerCommand lampCMD = new LampPowerCommand();
		Lamp lamp = new Lamp();
		lampCMD.setlamp(lamp);
		button.addCommand(lampCMD);
		button.setTheCommand(1, lampCMD);

		TvPowerCommand powerCMD = new TvPowerCommand();
		TV tv = new TV();
		powerCMD.setTv(tv);
		button.addCommand(powerCMD);
		button.setTheCommand(2, powerCMD);
		
		button.pressed(2, powerCMD);
		button.pressed(1, powerCMD);
		

		/*
		 * 
		 * button.setTheCommand(0, lampCMD);//lampCMD, robotCMD, carCMD
		 * 
		 * button.pressed(); button.pressed(); button.pressed();
		 * 
		 * Car car = new Car(); button.setCar(car);
		 * 
		 * button.pressed(); button.pressed(); button.pressed(); button.pressed();
		 * button.pressed();
		 */
		/*
		 * Robot robot = new Robot(); button.setFire(robot); button.pressed1();
		 * button.pressed1(); button.pressed1();
		 */

	}

}
