package bootcamp.lawliet.frases;

/**
 * @author diego
 *
 */

public class Frases {

	/**
	 * Funcion que sirve para conocer si una frase es un Palindromo
	 * @param 	frase 
	 * 			{@code String}
	 * @return {@code true} si las letras de la frase representa la misma secuencia al derecho como al reves, de otra manera retorna {@code false}
	 */
	public static boolean isPalindromo(String frase) {
		boolean palindrome = false;
	
		String fraseSinEspaciosNiSignosEnMinuscula = quitarEspaciosYSignos(frase).toLowerCase();
		String fraseSinEspaciosNiSignosEnMinusculaAlreves = girarFrase(fraseSinEspaciosNiSignosEnMinuscula);
		
		if(fraseSinEspaciosNiSignosEnMinuscula.equals(fraseSinEspaciosNiSignosEnMinusculaAlreves)) {
			return palindrome = true;
		}
		
		return palindrome;
		
	}

	/**
	 * Función que sirve para girar una Frase
	 * @param 	frase 
	 * 			{@code String} 
	 * @return {@code String} La frase al reves
	 */
	private static String girarFrase(String frase) {
		StringBuilder builder = new StringBuilder(frase);
		builder.reverse();
		return builder.toString();
	}

	/**
	 * Funcion que sirve para quitar los espacios y signos de una Frase
	 * @param 	frase 
	 * 			{@code String}
	 * @return 	{@code String} Cadena compuesta solamente con los caracteres de la frase que son letras
	 */
	private static String quitarEspaciosYSignos(String frase) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < frase.length(); ++i) {
			char caracter = frase.charAt(i);
			boolean letra = Character.isLetter(caracter);
			if (letra) {
				builder.append(caracter);
			}
		}
		return builder.toString();
	}
}
