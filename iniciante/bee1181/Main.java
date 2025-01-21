import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double[][] mat = new double[12][12];
		int linha = sc.nextInt();
		char operacao = sc.next().charAt(0);

		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 12; j++) {
				mat[i][j] = sc.nextDouble();
			}
		}

		double soma = 0.0;
		if (operacao == 'S') {
			for (int j = 0; j < 12; j++) {
				soma += mat[linha][j];
			}
			System.out.println(soma);
		}

		if (operacao == 'M') {
			for (int j = 0; j < 12; j++) {
				soma += mat[linha][j];
			}
			double media = soma / 12.0;
			System.out.println(media);
		}

		sc.close();
	}

}
