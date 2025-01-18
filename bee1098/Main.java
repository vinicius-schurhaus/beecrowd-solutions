
public class Main {

	public static void main(String[] args) {

		for (double i = 0.0; i <= 2.0; i += 0.2) {
			for (int j = 1; j <= 3; j++) {
				double aux = Math.round(i * 10.0) / 10.0;
				if (aux % 1 == 0) {
					System.out.printf("I=%d J=%d%n", (int) aux, (int) (aux + j));
				} else {
					System.out.printf("I=%.1f J=%.1f%n", i, i + j);
				}
			}
		}

 	}

}
