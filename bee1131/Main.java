import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int vitoriasInter = 0;
		int vitoriasGremio = 0;
		int empates = 0;
		int quantidadeGrenais = 0;
		int continuar = 1;

		while (continuar != 2) {
			if (continuar == 1) {
				int golsInter = sc.nextInt();
				int golsGremio = sc.nextInt();
				if (golsInter > golsGremio) {
					vitoriasInter++;
				} else if (golsGremio > golsInter) {
					vitoriasGremio++;
				} else {
					empates++;
				}
				quantidadeGrenais++;
			}
			System.out.println("Novo grenal (1-sim 2-nao)");
			continuar = sc.nextInt();
		}

		System.out.println(quantidadeGrenais + " grenais");
		System.out.println("Inter:" + vitoriasInter);
		System.out.println("Gremio:" + vitoriasGremio);
		System.out.println("Empates:" + empates);

		if (vitoriasInter > vitoriasGremio) {
			System.out.println("Inter venceu mais");
		} else if (vitoriasGremio > vitoriasInter) {
			System.out.println("Gremio venceu mais");
		} else {
			System.out.println("Nao houve vencedor");
		}

		sc.close();
	}

}
