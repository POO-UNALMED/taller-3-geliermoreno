package taller3.televisores;

public class TV {
	// Attributes
	private Marca marca;
	private Control control;
	private int canal = 1;
	private int precio = 500;
	private boolean estado;
	private int volumen = 1;
	
	private static int numTV;
	
	// Constructors
	public TV(Marca marca, boolean estado){
		this.marca = marca;
		this.estado = estado;
		numTV ++;
	}
	
	// Getters
	public Marca getMarca() {
		return marca;
	}
	public Control getControl() {
		return control;
	}
	public int getCanal() {
		return canal;
	}
	public int getPrecio() {
		return precio;
	}
	public int getVolumen() {
		return volumen;
	}
	public boolean getEstado() {
		return estado;
	}
	public static int getNumTV() {
		return numTV;
	}
	// Setters
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	public void setControl(Control control) {
		this.control = control;
	}
	public void setCanal(int canal) {
		if(canal >= 1 && canal <= 120 && this.getEstado() == true) {
			this.canal = canal;
		}
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public void setVolumen(int volumen) {
		if(volumen >= 0 && volumen <= 7 && this.getEstado() == true) {
			this.volumen = volumen;
		}
	}
	public static void setNumTV(int num) {
		numTV = num;
	}
	// Methods
	public static int numTv() {
		return numTV;
	}
	public void turnOn() {
		estado = true;
	}
	public void turnOff() {
		estado = false;
	}
	public void canalUp() {
		if(canal >= 1 && canal <= 120 && this.getEstado() == true) {
			canal += 1;
		}
	}
	public void canalDown() {
		if(canal >= 1 && canal <= 120 && this.getEstado() == true) {
			canal -= 1;
		}
	}
	public void volumenUp() {
		if(volumen >= 0 && volumen <= 6 && this.getEstado() == true) {
			volumen += 1;
		}
	}
	public void volumenDown() {
		if(volumen >= 1 && volumen <= 7 && this.getEstado() == true) {
			volumen -= 1;
		}
	}
}