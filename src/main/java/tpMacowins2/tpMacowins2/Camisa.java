package tpMacowins2.tpMacowins2;

public class Camisa extends Prenda {

	public Camisa(boolean esNacional, Marca unaMarca) {
		super(esNacional, unaMarca);
	}

	public double precioBase() {
		this.precioBase = 200.0;
		return this.precioBase;
	}

}
