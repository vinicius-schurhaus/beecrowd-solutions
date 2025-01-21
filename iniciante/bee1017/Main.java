import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tempo, velocidadeMedia, distancia;
		double combustivel;
		
		tempo = sc.nextInt();
		velocidadeMedia = sc.nextInt();
		
		distancia = tempo * velocidadeMedia;
		combustivel = (double) distancia / 12;
		
		System.out.printf("%.3f%n", combustivel);
		
		sc.close();
	}

}
