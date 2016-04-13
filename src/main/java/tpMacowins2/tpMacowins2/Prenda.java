package tpMacowins2.tpMacowins2;

public abstract class Prenda {
	public boolean esNacional;
	public double precioBase;
	public double precioFinal;
	public Marca marca;

	public Prenda(boolean esNacional, Marca unaMarca) {
		this.esNacional = esNacional;
		this.marca = unaMarca;
	}

	protected double precioFinal() {
		this.precioFinal = this.getPrecioBase() + Negocio.ValorFijo;
		if (!this.esNacional) {
			this.precioFinal = this.precioFinal * 1.3;
		}
		this.precioFinal = this.precioFinal * (marca.coeficiente(getPrecioBase()));
		return this.precioFinal;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public double getPrecioFinal() {
		return precioFinal;
	}

	public abstract double precioBase();

}
