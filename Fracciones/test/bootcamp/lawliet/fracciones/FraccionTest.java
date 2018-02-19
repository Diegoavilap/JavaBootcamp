package bootcamp.lawliet.fracciones;

import static org.junit.Assert.assertThat;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class FraccionTest {

	@Test
	public void simplificarCincuentaYCuatroTreintavos() {
		Fraccion fraccion = new Fraccion.Builder()
										.withNumerador(54)
										.withDenominador(30)
										.build();
		assertThat(fraccion.simplificar().toString(), is("9/5"));
	}
	
	@Test
	public void unMedioMasUnMedio() {
		Fraccion unMedio = new Fraccion.Builder()
									.withNumerador(1)
									.withDenominador(2)
									.build();
		
		
		assertThat(unMedio.mas(unMedio).toString(), is("1/1"));
	}
	
	@Test
	public void inversoDeTresCuartos() {
		Fraccion fraccion = new Fraccion.Builder()
										.withNumerador(3)
										.withDenominador(4)
										.build();
		assertThat(fraccion.inverso().toString(), is("-3/4"));
	}
	
	@Test
	public void tresMediosMenosUnMedio() {
		Fraccion tresMedios = new Fraccion.Builder()
									.withNumerador(3)
									.withDenominador(2)
									.build();
		Fraccion unMedio = new Fraccion.Builder()
											.withNumerador(1)
											.withDenominador(2)
											.build();
		assertThat(tresMedios.menos(unMedio).toString(), is("1/1"));
	}
	
	@Test
	public void TresMediosPorCuatroQuintos() {
		Fraccion tresMedios = new Fraccion.Builder()
											.withNumerador(3)
											.withDenominador(2)
											.build();
		Fraccion cuatroQuintos = new Fraccion.Builder()
											.withNumerador(4)
											.withDenominador(5)
											.build();
		assertThat(tresMedios.por(cuatroQuintos).toString(), is("6/5"));
	}


	@Test
	public void opuestoDeTresMedios() {
		Fraccion tresMedios = new Fraccion.Builder()
				.withNumerador(3)
				.withDenominador(2)
				.build();
		assertThat(tresMedios.opuesto().toString(), is("2/3"));
	}
	
	@Test
	public void tresMediosDivididoEnCincoCuartos() {
		Fraccion tresMedios = new Fraccion.Builder()
				.withNumerador(3)
				.withDenominador(2)
				.build();
		Fraccion cincoCuartos = new Fraccion.Builder()
				.withNumerador(5)
				.withDenominador(4)
				.build();
		
		assertThat(tresMedios.dividoEn(cincoCuartos).toString(), is("6/5"));
	}
	
}
