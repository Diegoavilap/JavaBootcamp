package bootcamp.lawliet.fracciones;

import static org.junit.Assert.assertThat;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class OperacionesTest {

	@Test
	public void mcmDe72Y50() {
		assertThat(Operaciones.mcm(72, 50), is(1800));
	}
	
	@Test
	public void mcdDe48Y60() {
		assertThat(Operaciones.mcd(48, 60), is(12));
	}
	
	@Test (expected = ArithmeticException.class)
	public void mcmDeCeroYCero() {
		Operaciones.mcm(0, 0);
	}
	
}
