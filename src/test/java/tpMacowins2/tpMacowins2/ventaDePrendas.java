package tpMacowins2.tpMacowins2;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class ventaDePrendas {
	private Pantalon unPantalon;
	private Camisa unaCamisa;
	private Armani armani;
	private Sarkany sarkany;
	private Zapato unZapato;
	private Sombrero unSombrero;
	private Saco unSaco;

	@Before
	public void initialize() {
		armani = new Armani();
		sarkany = new Sarkany();
		unPantalon = new Pantalon(true, armani);
		unPantalon.setCmTela(5);
		unPantalon.precioBase();
		unaCamisa = new Camisa(false, armani);
		unaCamisa.precioBase();
		unZapato = new Zapato(false, sarkany);
		unZapato.setTalle(40);
		unZapato.precioBase();
		unSombrero = new Sombrero(true, sarkany);
		unSombrero.setCoeficienteDeMetrosexualidad(5);
		unSombrero.precioBase();
		unSaco = new Saco(true, armani);
		unSaco.setCantidadDeBotones(6);
		unSaco.precioBase();

	}

	@Test
	public void precioBasePantalonTest() {
		Assert.assertEquals(255.0, unPantalon.getPrecioBase());
	}

	@Test
	public void precioBaseCamisaTest() {
		Assert.assertEquals(200.0, unaCamisa.getPrecioBase());
	}

	@Test
	public void precioBaseSombreroTest() {
		Assert.assertEquals(900.0, unSombrero.getPrecioBase());
	}

	@Test
	public void precioBaseSacoTest() {
		Assert.assertEquals(360.0, unSaco.getPrecioBase());
	}

	@Test
	public void precioFinalCamisaImportadaMarcaArmani() {
		unaCamisa.precioFinal();
		Assert.assertEquals(643.5, unaCamisa.getPrecioFinal());
	}

	@Test
	public void precioFinalPantalonNacionalMarcaArmani() {
		unPantalon.precioFinal();
		Assert.assertEquals(585.75, unPantalon.getPrecioFinal());
	}

	@Test
	public void precioFinalZapatosImportadosMarcaSarkany() {
		unZapato.precioFinal();
		Assert.assertEquals(1228.5, unZapato.getPrecioFinal());
	}

	@Test
	public void precioFinalSombreroNacionalMarcaSarkany() {
		unSombrero.precioFinal();
		Assert.assertEquals(1350.0, unSombrero.getPrecioFinal());
	}

	@Test
	public void precioFinalSacoNacionalMarcaArmani() {
		unSaco.precioFinal();
		Assert.assertEquals(759.0, unSaco.getPrecioFinal());
	}
}
