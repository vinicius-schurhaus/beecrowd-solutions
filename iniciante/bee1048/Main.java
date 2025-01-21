import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double salario = sc.nextDouble();

		double reajuste = 0.00;

		if (salario <= 400.00) {
			reajuste = 0.15;
		} else if (salario <= 800.00) {
			reajuste = 0.12;
		} else if (salario <= 1200.00) {
			reajuste = 0.10;
		} else if (salario <= 2000.00) {
			reajuste = 0.07;
		} else {
			reajuste = 0.04;
		}

		double novoSalario = salario * (1 + reajuste);
		double diferenca = novoSalario - salario;
		double percentual = reajuste * 100;

		System.out.printf("Novo salario: %.2f%n", novoSalario);
		System.out.printf("Reajuste ganho: %.2f%n", diferenca);
		System.out.printf("Em percentual: %.0f %%%n", percentual);

		sc.close();
	}

}
