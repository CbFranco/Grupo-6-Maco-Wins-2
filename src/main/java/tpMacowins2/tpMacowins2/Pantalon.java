package tpMacowins2.tpMacowins2;

public class Pantalon extends Prenda {
	private int cmTela;

	public Pantalon(boolean esNacional, Marca unaMarca) {
		super(esNacional, unaMarca);

	}

	public double precioBase() {
		this.precioBase = 250 + this.cmTela;
		return this.precioBase;
	}

	public void setCmTela(int cmTela) {
		this.cmTela = cmTela;
	}

}
