import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		char O = sc.next().charAt(0);

		double[][] mat = new double[12][12];

		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 12; j++) {
				mat[i][j] = sc.nextDouble();
			}
		}

		double soma = 0.0;
		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 12; j++) {
				if (i > j) {
					soma += mat[i][j];
				}
			}
		}

		if (O == 'S') {
			System.out.printf("%.1f%n", soma);
		} else if (O == 'M') {
			double media = soma / 66.0;
			System.out.printf("%.1f%n", media);
		}

		sc.close();
	}

}
