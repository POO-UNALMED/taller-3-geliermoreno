package taller3.televisores;

public class TV {
	
	//Atributos
	private Marca marca;
	private int canal = 1;
	private int precio = 500;
	private boolean estado;
	private int volumen = 1;
	private Control control;
	private static int numTV;
	
	//Constructor
	public TV(Marca marca, boolean estado){
		this.marca = marca;
		this.estado = estado;
		numTV ++;
	}
	
	//Get's
	public Marca getMarca() {
		return marca;
	}
	public Control getControl() {
		return control;
	}
	public int getPrecio() {
		return precio;
	}
	public int getVolumen() {
		return volumen;
	}
	public int getCanal() {
		return canal;
	}
	public static int getNumTV() {
		return numTV;
	}
	
	//Set's
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	public void setControl(Control control) {
		this.control = control;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public void setVolumen(int volumen) {
		if ((estado == true) && (volumen >= 0 && volumen <= 7)) {
			this.volumen = volumen;	
		}
	}
	public void setCanal(int canal) {
		if ((estado == true) && (canal >= 1 && canal <= 120)) {
			this.canal = canal;	
		}
	}
	public static void setNumTV(int num) {
		numTV = num;
	}
	
	//Methods turnON and TurnOff
	public void turnOn() {
		estado = true;
	}
	public void turnOff() {
		estado = false;
	}
	public boolean getEstado() {
		return estado;
	}
	
	//Methods canalUp and canalDown
	public void canalUp() {
		if ((estado == true) && (canal >= 1 && canal <= 120)) {
			this.canal ++;	
		}
		
	}
	public void canalDown() {
		if ((estado == true) && (canal >= 1 && canal <= 120)) {
			this.canal --;	
		}
	}
		

	public void volumenUp() {
		if ((estado == true) && (volumen >= 0 && volumen <= 6)) {
			this.volumen ++;	
		}
		
	}
	public void volumenDown() {
		if ((estado == true) && (volumen >= 1 && volumen <= 7)) {
			this.volumen --;	
		}
	}

	
}
