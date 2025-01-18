import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String aux = sc.next();
		int diaInicio = sc.nextInt();
		int horasInicio = sc.nextInt();
		aux = sc.next();
		int minutosInicio = sc.nextInt();
		aux = sc.next();
		int segundosInicio = sc.nextInt();
		
		aux = sc.next();
		int diaFim = sc.nextInt();
		int horasFim = sc.nextInt();
		aux = sc.next();
		int minutosFim = sc.nextInt();
		aux = sc.next();
		int segundosFim = sc.nextInt();
		
		int inicio = diaInicio * 86400 + horasInicio * 3600 + minutosInicio * 60 + segundosInicio;
		int fim = diaFim * 86400 + horasFim * 3600 + minutosFim * 60 + segundosFim;
		
		int tempo = fim - inicio;
		
		int dias = tempo / 86400;
		int resto = tempo % 86400;
		int horas = resto / 3600;
		resto = resto % 3600;
		int minutos = resto / 60;
		int segundos = resto % 60;
		
		System.out.println(dias + " dia(s)");
		System.out.println(horas + " hora(s)");
		System.out.println(minutos + " minuto(s)");
		System.out.println(segundos + " segundo(s)");
		
		sc.close();
	}

}
