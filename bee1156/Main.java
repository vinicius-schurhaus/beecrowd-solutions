
public class Main {

	public static void main(String[] args) {

		double s = 1;
		int count = 1;

		for (double i = 3.00; i <= 40.00; i += 2.00) {
			count *= 2;
			s += i / count;
		}

		System.out.printf("%.2f%n", s);
	}

}
