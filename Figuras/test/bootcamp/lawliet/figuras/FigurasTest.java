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
	
	//Test Cuadrado
	@Test
	public void cuadradoSizeCero() {
		assertThat(Figuras.cuadrado(0), is(""));
	}
	
	@Test 
	public void cuadradoSizeUno() {
		
		builder.append("*").append(Figuras.SALTO_DE_LINEA);
		assertThat(Figuras.cuadrado(1), is(builder.toString()));
	}
	
	@Test
	public void cuadradoSizeDos() {
		builder.append("**").append(Figuras.SALTO_DE_LINEA);
		builder.append("**").append(Figuras.SALTO_DE_LINEA);
		assertThat(Figuras.cuadrado(2),is(builder.toString()));
	}
	@Test
	public void cuadradoSizeCinco() {
		builder.append("*****").append(Figuras.SALTO_DE_LINEA);
		builder.append("*****").append(Figuras.SALTO_DE_LINEA);
		builder.append("*****").append(Figuras.SALTO_DE_LINEA);
		builder.append("*****").append(Figuras.SALTO_DE_LINEA);
		builder.append("*****").append(Figuras.SALTO_DE_LINEA);
		assertThat(Figuras.cuadrado(5),is(builder.toString()));
	}
	
	@Test
	public void cuadradoEstandar() {
		builder.append("***").append(Figuras.SALTO_DE_LINEA);
		builder.append("***").append(Figuras.SALTO_DE_LINEA);
		builder.append("***").append(Figuras.SALTO_DE_LINEA);
		assertThat(Figuras.cuadrado(), is(builder.toString()));
		
	}
	
	// Test Triangulo
	@Test
	public void trianguloSizeCero() {
		assertThat(Figuras.triangulo(0), is(""));
	}
	
	@Test 
	public void trianguloSizeUno() {
		builder.append("*").append(Figuras.SALTO_DE_LINEA);
		assertThat(Figuras.triangulo(1), is(builder.toString()));
	}
	
	@Test 
	public void trianguloSizeDos() {
		builder.append(" *").append(Figuras.SALTO_DE_LINEA);
		builder.append("***").append(Figuras.SALTO_DE_LINEA);
		assertThat(Figuras.triangulo(2), is(builder.toString()));
	}
	
	@Test 
	public void trianguloSizeCinco() {
		builder.append("    *").append(Figuras.SALTO_DE_LINEA);
		builder.append("   ***").append(Figuras.SALTO_DE_LINEA);
		builder.append("  *****").append(Figuras.SALTO_DE_LINEA);
		builder.append(" *******").append(Figuras.SALTO_DE_LINEA);
		builder.append("*********").append(Figuras.SALTO_DE_LINEA);
		assertThat(Figuras.triangulo(5), is(builder.toString()));
	}
	
	@Test 
	public void trianguloEstandar() {
		builder.append("  *").append(Figuras.SALTO_DE_LINEA);
		builder.append(" ***").append(Figuras.SALTO_DE_LINEA);
		builder.append("*****").append(Figuras.SALTO_DE_LINEA);
		assertThat(Figuras.triangulo(3), is(builder.toString()));
	}
	
	//Test Rombo
	@Test
	public void romboSizeCero() {
		assertThat(Figuras.rombo(0), is(""));
	}
	
	@Test 
	public void romboSizeUno() {
		builder.append("*").append(Figuras.SALTO_DE_LINEA);
		assertThat(Figuras.rombo(1), is(builder.toString()));
	}
	
	@Test 
	public void romboSizeDos() {
		builder.append(" *").append(Figuras.SALTO_DE_LINEA);
		builder.append("***").append(Figuras.SALTO_DE_LINEA);
		builder.append(" *").append(Figuras.SALTO_DE_LINEA);
		assertThat(Figuras.rombo(2), is(builder.toString()));
	}
	
	@Test 
	public void romboSizeCinco() {
		builder.append("    *").append(Figuras.SALTO_DE_LINEA);
		builder.append("   ***").append(Figuras.SALTO_DE_LINEA);
		builder.append("  *****").append(Figuras.SALTO_DE_LINEA);
		builder.append(" *******").append(Figuras.SALTO_DE_LINEA);
		builder.append("*********").append(Figuras.SALTO_DE_LINEA);
		builder.append(" *******").append(Figuras.SALTO_DE_LINEA);
		builder.append("  *****").append(Figuras.SALTO_DE_LINEA);
		builder.append("   ***").append(Figuras.SALTO_DE_LINEA);
		builder.append("    *").append(Figuras.SALTO_DE_LINEA);
		
		assertThat(Figuras.rombo(5), is(builder.toString()));
	}
	
	@Test 
	public void romboEstandar() {
		builder.append("  *").append(Figuras.SALTO_DE_LINEA);
		builder.append(" ***").append(Figuras.SALTO_DE_LINEA);
		builder.append("*****").append(Figuras.SALTO_DE_LINEA);
		builder.append(" ***").append(Figuras.SALTO_DE_LINEA);
		builder.append("  *").append(Figuras.SALTO_DE_LINEA);
		
		assertThat(Figuras.rombo(3), is(builder.toString()));
	}
	
}
