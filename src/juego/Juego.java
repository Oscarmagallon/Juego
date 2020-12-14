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


}
