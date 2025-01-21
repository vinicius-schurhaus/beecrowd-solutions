import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] vet = new int[10];

		for (int i = 0; i < 10; i++) {
			int n = sc.nextInt();
			if (n <= 0) {
				vet[i] = 1;
			} else {
				vet[i] = n;
			}
		}

		for (int i = 0; i < 10; i++) {
			System.out.println("X[" + i + "] = " + vet[i]);
		}

		sc.close();
	}

}
