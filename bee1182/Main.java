import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double[][] mat = new double[12][12];

		int col = sc.nextInt();
		char T = sc.next().charAt(0);

		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 12; j++) {
				mat[i][j] = sc.nextDouble();
			}
		}

		double soma = 0.0;
		for (int i = 0; i < 12; i++) {
			soma += mat[i][col];
		}

		if (T == 'S') {
			System.out.printf("%.1f%n", soma);
		} else if (T == 'M') {
			double media = soma / 12.0;
			System.out.printf("%.1f%n", media);
		}

		sc.close();
	}

}
