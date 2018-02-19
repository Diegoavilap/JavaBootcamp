package bootcamp.lawliet.fracciones;

public final class Operaciones {

	private Operaciones() {
		throw new AssertionError("Esta clase no debe ser instanciada");
	}
	
	public static int mcd(int a, int b) {
	   return b == 0 ? a : mcd(b, a % b);
	} 
	
	public static int mcm(int a, int b) {
	   return (a * b) / mcd(a, b);
	}

}
