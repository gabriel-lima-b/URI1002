package circle;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		Circle circ = new Circle(new BigDecimal(leitor.next()));
		leitor.close();

		System.out.println("A=" + String.format("%.4f", circ.getArea()));
	}
}
