import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] par = new int[5];
		int[] impar = new int[5];
		int indicePar = 0, indiceImpar = 0;

		for (int i = 0; i < 15; i++) {
			int n = sc.nextInt();

			if (n % 2 == 0) {
				if (indicePar == 5) {
					for (int j = 0; j < 5; j++) {
						System.out.printf("par[%d] = %d%n", j, par[j]);
					}
					indicePar = 0;
				}
				par[indicePar++] = n;
			} else {
				if (indiceImpar == 5) {
					for (int j = 0; j < 5; j++) {
						System.out.printf("impar[%d] = %d%n", j, impar[j]);
					}
					indiceImpar = 0;
				}
				impar[indiceImpar++] = n;
			}
		}

		if (indiceImpar > 0) {
			for (int i = 0; i < indiceImpar; i++) {
				System.out.printf("impar[%d] = %d%n", i, impar[i]);
			}
		}

		if (indicePar > 0) {
			for (int i = 0; i < indicePar; i++) {
				System.out.printf("par[%d] = %d%n", i, par[i]);
			}
		}

		sc.close();
	}
}
