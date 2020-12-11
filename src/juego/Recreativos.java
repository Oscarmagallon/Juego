package juego;

public class Recreativos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String vNombre[]= new String[100];
		Juego vJuegos[]= new Juego[100];
		
		Juego juego1 = new Juego("Ciberpunk");
		Juego juego2 = new Juego("Los Sims");
		Juego juego3 = new Juego("Fifa");
		
		vJuegos[0]=juego1;
		vJuegos[1] = juego2;
		vJuegos[2] = juego3;
		for (int i = 0; i <vJuegos.length;i++) {
			System.out.println(vJuegos[i].toString());
		}
	}

}