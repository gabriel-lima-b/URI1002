package circle;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

public class MainTest {


	@Test
	public void circuloDeRaioDois() {
		BigDecimal area = new BigDecimal(String.valueOf(12.5664));
		Circle circ = new Circle(new BigDecimal(String.valueOf(2.00)));

		String expected = "A=" + String.format("%.4f", area);
		String actual = "A=" + String.format("%.4f", circ.getArea());
		assertEquals(expected, actual);
	}

	@Test
	public void circuloDeRaioCemVirgulaSessentaEQuatro() {
		BigDecimal area = new BigDecimal(String.valueOf(31819.3103));
		Circle circ = new Circle(new BigDecimal(String.valueOf(100.64)));

		String expected = "A=" + String.format("%.4f", area);
		String actual = "A=" + String.format("%.4f", circ.getArea());
		assertEquals(expected, actual);
	}

	@Test
	public void circuloDeRaioCentoECinquenta() {
		BigDecimal area = new BigDecimal(String.valueOf(70685.7750));
		Circle circ = new Circle(new BigDecimal(String.valueOf(150.00)));
		
		String expected = "A=" + String.format("%.4f", area);
		String actual = "A=" + String.format("%.4f", circ.getArea());
		assertEquals(expected, actual);
	}

}