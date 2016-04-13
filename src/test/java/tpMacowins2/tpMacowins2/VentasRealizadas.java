package tpMacowins2.tpMacowins2;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class VentasRealizadas {
	private Saco sacoDeLana;
	private Zapato tacos;
	private Sombrero boina;
	private Negocio macowins;
	private Ventas primeraVenta, segundaVenta, terceraVenta;
	private Armani armani;
	private Sarkany sarkany;

	@Before
	public void initialize() {
		armani = new Armani();
		sarkany = new Sarkany();
		sacoDeLana = new Saco(true, armani);
		tacos = new Zapato(false, sarkany);
		boina = new Sombrero(true, armani);
		sacoDeLana.setCantidadDeBotones(4);
		tacos.setTalle(38);
		boina.setCoeficienteDeMetrosexualidad(0);
		tacos.precioBase();
		sacoDeLana.precioBase();
		boina.precioBase();
		tacos.precioFinal();
		sacoDeLana.precioFinal();
		boina.precioFinal();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			primeraVenta = new Ventas(sacoDeLana, 5, sdf.parse("12/04/2016"));
			segundaVenta = new Ventas(tacos, 8, sdf.parse("12/04/2016"));
			terceraVenta = new Ventas(boina, 2, sdf.parse("11/04/2016"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		macowins = new Negocio();
		macowins.vender(primeraVenta);
		macowins.vender(segundaVenta);
		macowins.vender(terceraVenta);

	}

	@Test
	public void totalVendido12DeAbril() {
		macowins.sumaTotalDeVentas(terceraVenta);
		Assert.assertEquals(825.0, macowins.getSum());

	}

	@Test
	public void totalVendido11DeAbril() {
		macowins.sumaTotalDeVentas(segundaVenta);
		Assert.assertEquals(13317.6, macowins.getSum());
	}

}
