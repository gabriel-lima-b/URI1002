package circle;

import java.math.BigDecimal;

public class Circle {
	private final BigDecimal PI = new BigDecimal(String.valueOf(3.14159));
	private BigDecimal area;
	private BigDecimal radius;

	public Circle(BigDecimal radius) {
		super();
		this.radius = radius;
		setArea();
	}

	public BigDecimal getArea() {
		return area;
	}

	public void setArea() {
		BigDecimal poweredRadius = radius.pow(2);
		area = poweredRadius.multiply(PI);
		
	}

	public BigDecimal getRadius() {
		return radius;
	}

	public void setRadius(BigDecimal radius) {
		this.radius = radius;
	}

	public BigDecimal getPI() {
		return PI;
	}

}
