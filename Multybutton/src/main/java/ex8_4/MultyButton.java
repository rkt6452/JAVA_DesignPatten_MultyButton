package ex8_4;

import java.util.ArrayList;
import java.util.List;

public class MultyButton {
	private List<Command> theCommand = new ArrayList<Command>();
	
	public void addCommand(Command cmd) {
		theCommand.add(cmd);
	}
	public void setTheCommand(int pos, Command cmd) {
		theCommand.set(pos, cmd);
	}
	
	public void pressed(int pos, Command cmd) {
		theCommand.get(pos).excute();
	}
	
	/* private Command theCommand; */
	/*
	 * private Car theCar; private Robot robot; public void setCar(Car theCar) {
	 * this.theCar = theCar; }
	 * 
	 * public void setFire(Robot robot) { this.robot = robot; }
	 * 
	 * public void pressed() { theCar.engine(); } public void pressed1() {
	 * robot.fireGun(); }
	 */	
	/*
	 * public void pressed() { theCommand.excute(); }
	 *///이 코드는 이제 더 이상 변하지 않는다.FrameWork 고칠 필요가 없다.
}
