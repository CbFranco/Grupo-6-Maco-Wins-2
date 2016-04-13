package tpMacowins2.tpMacowins2;

public class Zapato extends Prenda {
	private int talle;

	public Zapato(boolean esNacional, Marca unaMarca) {
		super(esNacional, unaMarca);

	}

	public double precioBase() {
		this.precioBase = 400 + (5 * this.talle);
		return this.precioBase;
	}

	public void setTalle(int talle) {
		this.talle = talle;
	}

}
