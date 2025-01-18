import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int idade = sc.nextInt();
		int soma = 0;
		int count = 0;

		while (idade > 0) {
			soma += idade;
			count++;
			idade = sc.nextInt();
		}

		if (count > 0) {
			double media = (double) soma / count;
			System.out.printf("%.2f%n", media);
		}

		sc.close();
	}

}
