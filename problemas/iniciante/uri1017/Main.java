import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final double CONSUMO_AUTOMOVEL = 12.0;

        int tempo = Integer.parseInt(br.readLine());
        int velocidadeMedia = Integer.parseInt(br.readLine());

        int distanciaPercorrida = velocidadeMedia * tempo;
        double combustivelNecessario = distanciaPercorrida / CONSUMO_AUTOMOVEL;

        System.out.printf("%.3f%n", combustivelNecessario);
    }
}