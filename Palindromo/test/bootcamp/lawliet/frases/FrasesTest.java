package bootcamp.lawliet.frases;

import static org.junit.Assert.assertThat;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class FrasesTest {

	@Test
	public void unStringVacioEsPalindromo() {
		assertThat(Frases.isPalindromo(""), is(true));
	}
	
	@Test
	public void unaSolaLetraEsPalindromo() {
		assertThat(Frases.isPalindromo("a"), is(true));
	}
	
	@Test
	public void abNoEsUnPalindromo() {
		assertThat(Frases.isPalindromo("ab"), is(false));
	}
	
	@Test
	public void abaEsUnPalindromo() {
		assertThat(Frases.isPalindromo("aba"), is(true));
	}
	
	@Test
	public void readerNoEsUnPalindromo() {
		assertThat(Frases.isPalindromo("reader"), is(false));
	}
	
	@Test
	public void radarEsUnPalindromo() {
		assertThat(Frases.isPalindromo("radar"), is(true));
	}
	
	@Test
	public void unStringConEspaciosTambienPuedeSerUnPalindromo() {
		assertThat(Frases.isPalindromo("anita lava la tina"), is(true));
	}
	
	@Test
	public void unStringConEspaciosYCaracteresNoLetrasTambienPuedeSerUnPalindromo() {
		assertThat(Frases.isPalindromo("¡anita, lava la tina!"), is(true));
	}
	
	@Test
	public void unStringConMayusculaTambienPuedeSerUnPalindromo() {
		assertThat(Frases.isPalindromo("¡Anita, lava la Tina!"), is(true));
	}
}
