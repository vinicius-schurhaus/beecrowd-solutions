
public class Main {

	public static void main(String[] args) {

		for (int i = 1; i <= 9; i += 2) {
			int x = 6 + i;
			for (int j = x; j >= (x - 2); j--) {
				System.out.println("I=" + i + " J=" + j);
			}
		}

	}

}
