package ex8_4;

public class Lamp {
	private boolean on = false;
	public void power() {
		on=!on;
		if(on) {
			System.out.println("LampON");
		}
		else {
			System.out.println("LampOFF");
		}
	}
}
