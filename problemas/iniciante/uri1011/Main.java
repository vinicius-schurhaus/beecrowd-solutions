import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final double PI = 3.14159;

        double raio = Double.parseDouble(br.readLine());

        double volume = (4.00 / 3.00) * PI * Math.pow(raio, 3);

        System.out.printf("VOLUME = %.3f%n", volume);
    }
}