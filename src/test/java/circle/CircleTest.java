package circle;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

public class CircleTest {

	private Circle actualCircle;

	@Before
	public void inicializar() {
		this.actualCircle = new Circle(new BigDecimal(String.valueOf(2.00)));
	}

	@Test
	public void areaDeveriaSerDozeVirgulaCincoSeisSeisTresSeis() {
		BigDecimal expected = new BigDecimal("12.56636");
		BigDecimal actual = actualCircle.getArea();
		assertEquals(actual.compareTo(expected), 0);
	}
	
	

	
}