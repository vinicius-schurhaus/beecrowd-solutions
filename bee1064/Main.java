import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		double n3 = sc.nextDouble();
		double n4 = sc.nextDouble();
		double n5 = sc.nextDouble();
		double n6 = sc.nextDouble();

		int count = 0;
		double soma = 0;

		if (n1 > 0) {
			count++;
			soma += n1;
		}

		if (n2 > 0) {
			count++;
			soma += n2;
		}

		if (n3 > 0) {
			count++;
			soma += n3;
		}

		if (n4 > 0) {
			count++;
			soma += n4;
		}

		if (n5 > 0) {
			count++;
			soma += n5;
		}

		if (n6 > 0) {
			count++;
			soma += n6;
		}

		System.out.println(count + " valores positivos");

		double media = (double) soma / count;
		System.out.printf("%.1f%n", media);

		sc.close();
	}

}
