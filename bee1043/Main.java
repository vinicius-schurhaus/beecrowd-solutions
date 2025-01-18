import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();

		double x = a;
		double y = b;
		double z = c;

		if (b > a) {
			if (c > b) {
				double temp = a;
				a = c;
				c = temp;
			} else {
				double temp = a;
				a = b;
				b = temp;
			}
		} else if (c > a) {
			double temp = a;
			a = c;
			c = temp;
		}

		if (b + c > a) {
			double perimetro = a + b + c;
			System.out.printf("Perimetro = %.1f%n", perimetro);
		} else {
			double area = ((x + y) * z) / 2;
			System.out.printf("Area = %.1f%n", area);
		}

		sc.close();
	}

}
