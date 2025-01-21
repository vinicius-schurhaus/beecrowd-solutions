public class Main {

	public static void main(String[] args) {
		
		double s = 0;
		for (double i = 1.00; i <= 100.00; i++) {
			s += 1 / i;
		}
		
		System.out.printf("%.2f%n", s);
	}

}
