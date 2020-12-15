package juego;

public class Recreativos {
	
	public static int pintaMenu() {
		
	}
	public static void verTodosJuegos (Juego vJuegos[]) {
		for(int i=0;i<vJuegos.length;i++) {
			if(!vJuegos[i].equals(null)) {
				System.out.println(vJuegos[i].toString());
			}
		}
	}
	public static void guardarJuego (Juego vJuegos[]) {
		//pedir los datos por try-catch
		
		//buscar posicion libre en el vector
		for(int i = 0;i<vJuegos.length;i++) {
			if(vJuegos[i]==null) {
				vJuegos[i]=new Juego();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String vNombre[]= new String[100];
		Juego vJuegos[]= new Juego[100];
		
		Juego juego1 = new Juego("Ciberpunk");
		Juego juego2 = new Juego("Los Sims");
		Juego juego3 = new Juego("Fifa");
		
		vJuegos [ 0 ] = juego1;
		vJuegos [ 1 ] = juego2;
		vJuegos [ 2 ] = juego3;
		vJuegos [ 3 ] =  new  Juego ( " Tetris " );
		
		vJuegos[2].setMultijugador(true);
		vJuegos[2].getRegistro(100);
		
		for(int i =0;i<vJuegos.length;i++) {
			if(vJuegos[i]!=null && vJuegos[i].isMultijugador()) {
				System.out.println(vJuegos[i].toString());
			}
		}
		
	}

}