package bootcamp.lawliet.figuras;

public class Figuras {
	
	public static final char ESPACIO = ' ';
	public static final String SALTO_DE_LINEA = String.format("%n");
	public static final char CARACTER = '*';

	/**
	 * Funcion que sirve para generar un cuadrado
	 * @param 	size 
	 * 			{@code int}
	 * @return {@code String} 
	 * 			 Cadena que representa un cuadrado del tamano proporcionado
	 */
	public static String cuadrado(int size) {
		return figura(size, 0, size, 0, 0);
	}

	/**
	 * Funcion que sirve para generar un triangulo
	 * @param 	size 
	 * 			{@code int}
	 * @return {@code String} 
	 * 			 Cadena que representa un triangulo del tamano proporcionado
	 */
	public static String triangulo(int size) {
		return figura(size, size - 1, 1, -1, 2);
	}
	
	/**
	 * Funcion que sirve para generar un rombo
	 * @param 	size 
	 * 			{@code int} Representa la la cantidad de filas que tendra el rombo hasta la mitad
	 * @return {@code String} 
	 * 			 Cadena que representa un rombo del tamano proporcionado
	 */
	public static String rombo(int size) {
		StringBuilder builder = new StringBuilder(Figuras.triangulo(size));
		int caracteres = ((size - 1) * 2) - 1;
		
		builder.append(figura(size - 1 , 1, caracteres, 1, -2));
		return builder.toString();
	}
	
	/**
	 * Funcion que sirve para generar un triangulo
	 * @param 	size 
	 * 			{@code int} Tamano de la figura
	 * @param	espacios
	 * 			{@code int} Cantidad de espacios que tendra la figura en su primera fila
	 * @param	caracteres
	 * 			{@code int} Cantidad de caracteres que tendra la figura en su primera fila
	 * @param	modificarEspacios
	 * 			{@code int} Cuanto se va a modificar la cantidad de espacios en cada fila de la figura
	 * @param	modificarCaracteres
	 * 			{@code int} Cuanto se va a modificar la cantidad de caracteres en cada fila de la figura
	 * 			
	 * @return {@code String} 
	 * 			 Cadena que representa una figura
	 */
	private static String figura(int size, int espacios, int caracteres, int modificarEspacios, int modificarCaracteres) {
		StringBuilder builder = new StringBuilder();
		
		for(int filas = 1; filas <= size; ++filas) {
			builder.append(columnas(ESPACIO, espacios))
					.append(columnas(CARACTER, caracteres))
					.append(SALTO_DE_LINEA);	
			espacios += modificarEspacios;
			caracteres += modificarCaracteres;
		}
		return builder.toString();
	}
	
	
	/**
	 * Funcion que sirve para generar las columnas de una fila
	 * @param 	c 
	 * 			{@code char} Caracter que se va a agregar en cada columna
	 * @param 	n 
	 * 			{@code int} Cantidad de columnas
	 * @return {@code String} 
	 * 			 Cadena con un caracter por la cantidad de columnas dada  
	 */
	private static String columnas(char c, int n) {
		StringBuilder builder = new StringBuilder();
		for(int columnas = 1; columnas <= n; ++columnas) {
			builder.append(c);
		}
		return builder.toString();
	}
	
	/**
	 * Funcion que sirve para generar un cuadrado estandar
	 * @return {@code String} 
	 * 			 Cadena que representa un cuadrado estandar que es del tamano 3
	 */
	public static String cuadrado() {
		return cuadrado(3);
	}
	/**
	 * Funcion que sirve para generar un triangulo estandar
	 * @return {@code String} 
	 * 			 Cadena que representa un triangulo estandar que es del tamano 3
	 */
	public static String triangulo() {
		return triangulo(3);
	}
	
	/**
	 * Funcion que sirve para generar un rombo estandar
	 * @return {@code String} 
	 * 			 Cadena que representa un rombo estandar que es del tamano 3
	 */
	public static String rombo() {
		return rombo(3);
	}
	

	
}
