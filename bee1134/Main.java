import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int countAlcool = 0;
		int countGasolina = 0;
		int countDiesel = 0;

		while (n != 4) {
			if (n == 1) {
				countAlcool++;
				n = sc.nextInt();
			} else if (n == 2) {
				countGasolina++;
				n = sc.nextInt();
			} else if (n == 3) {
				countDiesel++;
				n = sc.nextInt();
			} else {
				n = sc.nextInt();
			}
		}

		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + countAlcool);
		System.out.println("Gasolina: " + countGasolina);
		System.out.println("Diesel: " + countDiesel);

		sc.close();
	}

}
