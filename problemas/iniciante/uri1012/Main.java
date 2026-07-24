import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final double PI = 3.14159;

        String[] entrada = br.readLine().trim().split(" ");
        double A =  Double.parseDouble(entrada[0]);
        double B =  Double.parseDouble(entrada[1]);
        double C =  Double.parseDouble(entrada[2]);

        double areaTrianguloRetangulo = (A * C) / 2.0;
        double areaCirculo = PI * C * C;
        double areaTrapezio = ((A + B) * C) / 2.0;
        double areaQuadrado = B * B;
        double areaRetangulo = A * B;

        System.out.printf("TRIANGULO: %.3f%n", areaTrianguloRetangulo);
        System.out.printf("CIRCULO: %.3f%n", areaCirculo);
        System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
        System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
        System.out.printf("RETANGULO: %.3f%n", areaRetangulo);
    }
}
