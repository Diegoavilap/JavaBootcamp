package bootcamp.lawliet.fracciones;

import java.util.Objects;

import com.google.common.base.Preconditions;

public final class Fraccion {
	
	private final int numerador;
	private final int denominador;
	
	private Fraccion(final Builder builder) {
		
		this.numerador = builder.numerador;
		this.denominador = builder.denominador;
	}
	
	
	public static class Builder{
		private int numerador;
		private int denominador = 1;
		
		public Builder withNumerador(final int numerador) {
			this.numerador = Objects.requireNonNull(numerador);
			return this;
		}
		
		public Builder withDenominador(final int denominador) {
			Preconditions.checkArgument(denominador != 0, "Denominador no puede ser 0");
			this.denominador = Objects.requireNonNull(denominador);
			return this;
		}
		public Fraccion build() {
			return new Fraccion(this);
		}
		
	}
	
	/**
	 * Funcion que sirve para simplificar una fraccion
	 * @param 	
	 * @return {@code Fraccion} 
	 * 			 Objeto tipo Fraccion con la fraccion simplificada 
	 */
	public Fraccion simplificar() {
		final int mcd = Operaciones.mcd(this.numerador, this.denominador);
		final int nuevoNumerador = this.numerador / mcd;
		final int nuevoDenominador = this.denominador / mcd;
		return new Fraccion.Builder()
							.withNumerador(nuevoNumerador)
							.withDenominador(nuevoDenominador)
							.build();
	}
	
	/**
	 * Funcion que sirve para sumar dos fracciones
	 * @param 	fraccion 
	 * 			{@code Fraccion}
	 * @return {@code Fraccion} 
	 * 			 Objeto tipo Fraccion que es el resultado de la suma de las fracciones
	 */
	public Fraccion mas(final Fraccion fraccion) {
		final int mcm = Operaciones.mcm(this.denominador, fraccion.denominador);
		final int a = (mcm / this.denominador ) * (this.numerador);
		final int b = (mcm / fraccion.denominador) * (fraccion.numerador);
		final int nuevoNumerador = a + b;
		
		return new Fraccion.Builder()
							.withNumerador(nuevoNumerador)
							.withDenominador(mcm)
							.build()
							.simplificar();
	}
	/**
	 * Funcion que sirve para restar dos fracciones
	 * @param 	fraccion 
	 * 			{@code Fraccion}
	 * @return {@code Fraccion} 
	 * 			 Objeto tipo Fraccion que es el resultado de la resta de las dos fracciones
	 */
	public Fraccion menos(final Fraccion fraccion) {
		return this.mas(fraccion.inverso());
	}
	
	/**
	 * Funcion que sirve para multiplicar dos fracciones
	 * @param 	Fraccion 
	 * 			{@code Fraccion}
	 * @return {@code Fraccion} 
	 * 			 Objeto tipo Fraccion que es el resultado de la multiplicación de las dos Fracciones
	 */
	public Fraccion por(final Fraccion fraccion) {
		final int nuevoNumerador = this.numerador * fraccion.numerador ;
		final int nuevoDenominador = this.denominador * fraccion.denominador;
		
		return new Fraccion.Builder()
				.withNumerador(nuevoNumerador)
				.withDenominador(nuevoDenominador)
				.build()
				.simplificar();
	}
	
	/**
	 * Funcion que sirve para dividir dos fracciones
	 * @param 	Fraccion 
	 * 			{@code Fraccion}
	 * @return {@code Fraccion} 
	 * 			 Objeto tipo Fraccion que es el resultado de la division de las dos Fracciones
	 */
	public Fraccion dividoEn(final Fraccion fraccion) {
		return this.por(fraccion.opuesto());
	}
	
	/**
	 * Funcion que sirve para hallar el inverso de la fraccion
	 * El Inverso de una fraccion es, si fraccion es a/b, su inverso es -a/b 
	 * 
	 * @return {@code Fraccion} 
	 * 			 Objeto tipo Fraccion que es el inverso de la fraccion 
	 */
	public Fraccion inverso() {
		Fraccion fraccion = new Fraccion.Builder()
								.withNumerador(-1)
								.withDenominador(1)
								.build();
		return this.por(fraccion);
	}
	/**
	 * Funcion que sirve para hallar el opuesto de la fraccion
	 * El opuesto de una fraccion es, si fraccion es a/b, su opuesto es b/a
	 * 
	 * @return {@code Fraccion} 
	 * 			 Objeto tipo Fraccion que es el opuesto de la fraccion
	 */
	public Fraccion opuesto() {
		final int nuevoNumerador = this.denominador;
		final int nuevoDenominador = this.numerador;
		
		return new Fraccion.Builder()
				.withNumerador(nuevoNumerador)
				.withDenominador(nuevoDenominador)
				.build();
	}
	
	@Override
	public String toString() {
		return String.format("%d/%d", numerador, denominador);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + denominador;
		result = prime * result + numerador;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fraccion other = (Fraccion) obj;
		if (denominador != other.denominador)
			return false;
		if (numerador != other.numerador)
			return false;
		return true;
	}
}
