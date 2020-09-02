package taller3.televisores;

public class Control {
	// Attributes
	private TV tv;
	
	// Getters
	public TV getTv() {
		return tv;
	}
	
	
	// Setters
	public void setTv(TV tv) {
		this.tv = tv;
	}
	
	// Methods
	public void enlazar(TV tv) {
		this.tv = tv;
		this.tv.setControl(this);
	}
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
	public void setCanal(int ca) {
		tv.setCanal(ca);
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
