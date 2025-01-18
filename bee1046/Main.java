import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		int duracao = 0;

		if (b > a) {
			duracao = b - a;
		} else if (b < a) {
			duracao = 24 - a + b;
		} else {
			duracao = 24;
		}

		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

		sc.close();
	}

}
