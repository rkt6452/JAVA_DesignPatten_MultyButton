package ex8_4;

public class CarEngineCommand implements Command {
	private Car theCar;
	public void setTheCar(Car theCar) {
		this.theCar = theCar;
	}
	
	public void excute() {
		// TODO Auto-generated method stub
		theCar.engine();
		
	}

}
