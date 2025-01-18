import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int[] vet = new int[20];
		
		for (int i = 0; i < 20; i++) {
			vet[i] = sc.nextInt();
		}
		
		int[] vetAlterado = new int[20];
		for (int i = 0; i < 10; i++) {
			vetAlterado[i] = vet[19 - i];
			vetAlterado[19 - i] = vet [i];
		}
		
		for (int i = 0; i < 20; i++) {
			System.out.println("N[" + i + "] = " + vetAlterado[i]);
		}
		
		sc.close();
	}

}
