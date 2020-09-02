package taller3.televisores;

public class Control {
	
	//attributes
	private TV tv;
	
	//get and set
	public TV getTv() {
		return tv;
	}
	public void setTv(TV tv) {
		this.tv = tv;
	}
	
	// link
	public void enlazar(TV tv) {
		this.tv = tv;
		this.tv.setControl(this);
	}
	
	//Methods
	public void turnOn() {
		tv.turnOn();
	}
	public void turnOff() {
		tv.turnOff();
	}
	public void canalUp() {
		tv.canalUp();
	}
	public void canalDown() {
		tv.canalDown();
	}
	public void setCanal(int can) {
		tv.setCanal(can);
	}
	public void volumenUp() {
		tv.volumenUp();
	}
	public void volumenDown() {
		tv.volumenDown();
	}
	public void setVolumen(int vol) {
		tv.setVolumen(vol);
	}
	
}
