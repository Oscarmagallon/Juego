package juego;

public class Juego {
	
	private String nombre;
	private int registro;
	private boolean multijugador;
	
	

	public Juego(String nombre) {
		this.nombre=nombre;
		this.registro=0;
		this.multijugador=false;
		
		
		
	}



	public Juego(int record,String nombre, int registro, boolean multijugador) {
		super();
		this.nombre = nombre;
		this.registro = registro;
		this.multijugador = multijugador;
	}
	public void ponerRecord(int puntuacion) {
		record = puntuacion;
	}
	public void setRecord (int record) {
		this.registro=registro;
	}


	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getRegistro() {
		return registro;
	}



	public void setRegistro(int registro) {
		this.registro = registro;
	}



	public boolean isMultijugador() {
		return multijugador;
	}



	public void setMultijugador(boolean multijugador) {
		this.multijugador = multijugador;
	}



	@Override
	public String toString() {
		return nombre + "------" + registro;
	}
	



}
