import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int distancia;
		double combustivel, consumo;
		
		distancia = sc.nextInt();
		combustivel = sc.nextDouble();
		
		consumo = distancia / combustivel;
		
		System.out.printf("%.3f km/l%n", consumo);
		
		sc.close();
	}

}
