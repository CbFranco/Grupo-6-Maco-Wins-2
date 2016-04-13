package tpMacowins2.tpMacowins2;

public class Saco extends Prenda {
	private int cantidadDeBotones;

	public Saco(boolean esNacional, Marca unaMarca) {
		super(esNacional, unaMarca);

	}

	public double precioBase() {
		this.precioBase = 300 + (10 * this.cantidadDeBotones);
		return this.precioBase;
	}

	public void setCantidadDeBotones(int cantidadDeBotones) {
		this.cantidadDeBotones = cantidadDeBotones;
	}

}
