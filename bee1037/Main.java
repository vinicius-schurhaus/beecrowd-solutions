import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		float n = sc.nextFloat();

		if (n >= 0 && n <= 25) {
			System.out.println("Intervalo [0,25]");
		} else if (n > 25 && n <= 50) {
			System.out.println("Intervalo (25,50]");
		} else if (n > 50 && n <= 75) {
			System.out.println("Intervalo (50,75]");
		} else if (n > 75 && n <= 100) {
			System.out.println("Intervalo (75,100]");
		} else {
			System.out.println("Fora de intervalo");
		}

		sc.close();
	}

}
