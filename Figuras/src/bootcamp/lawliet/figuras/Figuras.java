package bootcamp.lawliet.figuras;

public class Figuras {
	
	public static String cuadrado(int size) {
		StringBuilder cuadrado = new StringBuilder();
		
		for(int filas = 1; filas <= size; ++ filas) {
			for(int columnas = 1; columnas <= size; ++columnas) {
				cuadrado.append("*");
			}
			cuadrado.append(saltoDeLinea());	
		}
		return cuadrado.toString();
	}
	
	public static String cuadrado() {
		return cuadrado(3);
	}
	
	public static String triangulo(int size) {
		StringBuilder triangulo = new StringBuilder();
		
		
		
		return triangulo.toString();
		
	}

	public static String saltoDeLinea() {
		return String.format("%n");
	}
}
