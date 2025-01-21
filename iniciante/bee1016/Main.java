import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int distancia, tempo;
		
		distancia = sc.nextInt();
		
		tempo = 2 * distancia;
		
		System.out.println(tempo + " minutos");
		
		sc.close();
	}

}
