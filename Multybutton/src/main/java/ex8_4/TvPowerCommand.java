package ex8_4;

public class TvPowerCommand implements Command {
	
	private TV tv = new TV();
	
	public void setTv(TV tv) {
		this.tv = tv;
	}
	public void excute() {
		// TODO Auto-generated method stub
		tv.power();
	}

}
