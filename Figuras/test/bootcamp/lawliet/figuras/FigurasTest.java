package bootcamp.lawliet.figuras;

import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;


import static org.hamcrest.CoreMatchers.is;

public class FigurasTest {

	private StringBuilder builder;
	
	@Before
	public void init() {
		this.builder = new StringBuilder(); 
	}
	@Test
	public void cuadradoSizeCero() {
		assertThat(Figuras.cuadrado(0), is(""));
	}
	
	@Test 
	public void cuadradoSizeUno() {
		
		builder.append("*").append(Figuras.saltoDeLinea());
		assertThat(Figuras.cuadrado(1), is(builder.toString()));
	}
	
	@Test
	public void cuadradoSizeDos() {
		builder.append("**").append(Figuras.saltoDeLinea());
		builder.append("**").append(Figuras.saltoDeLinea());
		assertThat(Figuras.cuadrado(2),is(builder.toString()));
	}
	@Test
	public void cuadradoSizeCinco() {
		builder.append("*****").append(Figuras.saltoDeLinea());
		builder.append("*****").append(Figuras.saltoDeLinea());
		builder.append("*****").append(Figuras.saltoDeLinea());
		builder.append("*****").append(Figuras.saltoDeLinea());
		builder.append("*****").append(Figuras.saltoDeLinea());
		assertThat(Figuras.cuadrado(5),is(builder.toString()));
	}
	
	@Test
	public void cuadradoEstandar() {
		builder.append("***").append(Figuras.saltoDeLinea());
		builder.append("***").append(Figuras.saltoDeLinea());
		builder.append("***").append(Figuras.saltoDeLinea());
		assertThat(Figuras.cuadrado(), is(builder.toString()));
		
	}
	
	@Test
	public void trianguloSizeCero() {
		assertThat(Figuras.triangulo(0), is(""));
	}
	
	@Test 
	public void trianguloSizeUno() {
		
		builder.append("*").append(Figuras.saltoDeLinea());
		assertThat(Figuras.triangulo(1), is(builder.toString()));
	}
}
