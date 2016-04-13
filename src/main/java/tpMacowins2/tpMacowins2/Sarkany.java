package tpMacowins2.tpMacowins2;

public class Sarkany implements Marca {

	@Override
	public double coeficiente(double precioBase) {
		if (precioBase > 500.0)
			return 1.35;
		else
			return 1.1;
	}

}
