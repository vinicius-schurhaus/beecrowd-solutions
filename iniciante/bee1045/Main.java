import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		double n3 = sc.nextDouble();

		double a, b, c;

		if (n1 > n2 && n1 > n3) {
			a = n1;
			if (n2 >= n3) {
				b = n2;
				c = n3;
			} else {
				b = n3;
				c = n2;
			}

		} else if (n2 > n1 && n2 > n3) {
			a = n2;
			if (n1 >= n3) {
				b = n1;
				c = n3;
			} else {
				b = n3;
				c = n1;
			}
		} else {
			a = n3;
			if (n1 > n2) {
				b = n1;
				c = n2;
			} else {
				b = n2;
				c = n1;
			}
		}

		boolean triangulo = true;

		if (a >= b + c) {
			System.out.println("NAO FORMA TRIANGULO");
			triangulo = false;
		}

		if (triangulo == true) {
			if ((a * a) == (b * b) + (c * c)) {
				System.out.println("TRIANGULO RETANGULO");
			} else if ((a * a) > (b * b) + (c * c)) {
				System.out.println("TRIANGULO OBTUSANGULO");
			} else {
				System.out.println("TRIANGULO ACUTANGULO");
			}

			if (a == b && b == c) {
				System.out.println("TRIANGULO EQUILATERO");
			} else if (a == b || b == c) {
				System.out.println("TRIANGULO ISOSCELES");
			}
		}

		sc.close();
	}

}
