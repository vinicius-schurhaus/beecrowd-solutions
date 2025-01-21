import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int horaInicio = sc.nextInt();
		int minutoInicio = sc.nextInt();
		int horaFim = sc.nextInt();
		int minutoFim = sc.nextInt();

		int horas, minutos;

		// 20 18
		if (horaFim > horaInicio) {
			// 30 20
			if (minutoInicio > minutoFim) {
				horas = horaFim - horaInicio - 1;
			} else {
				horas = horaFim - horaInicio;
			}
		} else if (horaInicio > horaFim) {
			if (minutoInicio > minutoFim) {
				horas = 23 - horaInicio + horaFim;
			} else {
				horas = 24 - horaInicio + horaFim;
			}
		} else {
			if (minutoInicio == minutoFim) {
				horas = 24;
			} else if (minutoInicio > minutoFim) {
				horas = 23;
			} else {
				horas = 0;
			}
		}

		if (minutoFim > minutoInicio) {
			minutos = minutoFim - minutoInicio;
		} else if (minutoInicio > minutoFim) {
			minutos = 60 - minutoInicio + minutoFim;
		} else {

			minutos = 0;
		}

		System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", horas, minutos);

		sc.close();
	}

}
