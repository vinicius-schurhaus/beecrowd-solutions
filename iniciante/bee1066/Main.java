import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int n4 = sc.nextInt();
		int n5 = sc.nextInt();

		int countPares = 0;
		int countImpares = 0;
		int countPositivos = 0;
		int countNegativos = 0;

		if (n1 % 2 == 0) {
			countPares++;
		} else {
			countImpares++;
		}

		if (n1 > 0) {
			countPositivos++;
		} else if (n1 < 0) {
			countNegativos++;
		}

		if (n2 % 2 == 0) {
			countPares++;
		} else {
			countImpares++;
		}

		if (n2 > 0) {
			countPositivos++;
		} else if (n2 < 0) {
			countNegativos++;
		}

		if (n3 % 2 == 0) {
			countPares++;
		} else {
			countImpares++;
		}

		if (n3 > 0) {
			countPositivos++;
		} else if (n3 < 0) {
			countNegativos++;
		}

		if (n4 % 2 == 0) {
			countPares++;
		} else {
			countImpares++;
		}

		if (n4 > 0) {
			countPositivos++;
		} else if (n4 < 0) {
			countNegativos++;
		}

		if (n5 % 2 == 0) {
			countPares++;
		} else {
			countImpares++;
		}

		if (n5 > 0) {
			countPositivos++;
		} else if (n5 < 0) {
			countNegativos++;
		}

		System.out.println(countPares + " valor(es) par(es)");
		System.out.println(countImpares + " valor(es) impar(es)");
		System.out.println(countPositivos + " valor(es) positivo(s)");
		System.out.println(countNegativos + " valor(es) negativo(s)");

		sc.close();
	}

}
