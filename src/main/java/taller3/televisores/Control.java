package taller3.televisores;

public class Control {
	
	//attributes
	private TV tv;
	
	//get and set
	public TV getTV() {
		return this.tv;
	}
	public void setTV(TV tv) {
		this.tv = tv;
	}
	
	// link
	public void enlazar(TV tv) {
		tv.control = this;
        this.tv = tv;
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
