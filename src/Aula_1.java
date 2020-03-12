import java.util.Locale;
import java.util.Scanner;

import entities.Triangulo;

public class Aula_1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();

		System.out.println("Entre com as medidas do triangulo x: ");
		x.a = scanner.nextDouble();
		x.b = scanner.nextDouble();
		x.c = scanner.nextDouble();

		System.out.println("Entre com as medidas do triangulo y : ");
		y.a = scanner.nextDouble();
		y.b = scanner.nextDouble();
		y.c = scanner.nextDouble();

		double areax = x.area();

		double areay = y.area();

		System.out.printf("triangulo x area: %.4f%n", areax);
		System.out.printf("triangulo y area: %.4f%n", areay);

		if (areax > areay) {

			System.out.println("Area maior :  X");

		} else {
			System.out.println("Area maior : Y ");
		}
		scanner.close();
 	}

}
