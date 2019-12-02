package ex8_4;

public class LampPowerCommand implements Command {
	private Lamp lamp = new Lamp();
	
	public void setlamp(Lamp lamp) {
		this.lamp=lamp;
	}
	public void excute() {
		// TODO Auto-generated method stub
		lamp.power();
	}

}
