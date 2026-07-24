import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numeroFuncionario = Integer.parseInt(br.readLine());
        int horasTrabalhadas = Integer.parseInt(br.readLine());
        double valorHora = Double.parseDouble(br.readLine());

        double salario = valorHora * horasTrabalhadas;

        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.printf("SALARY = U$ %.2f%n", salario);
    }
}
