import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			int maior, menor;
			if (x > y) {
				maior = x;
				menor = y;
			} else {
				maior = y;
				menor = x;
			}

			int soma = 0;
			for (int j = menor + 1; j < maior; j++) {
				if (j % 2 != 0) {
					soma += j;
				}
			}

			System.out.println(soma);
		}

		sc.close();
	}

}
