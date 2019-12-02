package ex8_4;

public class Robot {
	private boolean gun = false;
	public void fireGun() {
		gun = !gun;
		if(gun) {
			System.out.println("fireGun on");
		}
		else {
			System.out.println("fireGun off");
		}
	}

}
