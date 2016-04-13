package tpMacowins2.tpMacowins2;

public class Sombrero extends Prenda {
	private int coeficienteDeMetrosexualidad;

	public Sombrero(boolean esNacional, Marca unaMarca) {
		super(esNacional, unaMarca);

	}

	public double precioBase() {
		this.precioBase = 150 * (1 + this.coeficienteDeMetrosexualidad);
		return this.precioBase;
	}

	public void setCoeficienteDeMetrosexualidad(int coeficienteDeMetrosexualidad) {
		this.coeficienteDeMetrosexualidad = coeficienteDeMetrosexualidad;
	}

}
