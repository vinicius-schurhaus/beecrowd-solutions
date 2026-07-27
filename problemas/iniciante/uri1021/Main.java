import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double entrada = Double.parseDouble(br.readLine());
        int valor = (int) Math.round(entrada * 100);

        int qtdNotas100 = valor / 10000;
        valor %= 10000;
        int qtdNotas50 = valor / 5000;
        valor %= 5000;
        int qtdNotas20 = valor / 2000;
        valor %= 2000;
        int qtdNotas10 = valor / 1000;
        valor %= 1000;
        int qtdNotas5 = valor / 500;
        valor %= 500;
        int qtdNotas2 = valor / 200;
        valor %= 200;

        System.out.println("NOTAS:");
        System.out.println(qtdNotas100 + " nota(s) de R$ 100.00");
        System.out.println(qtdNotas50 + " nota(s) de R$ 50.00");
        System.out.println(qtdNotas20 + " nota(s) de R$ 20.00");
        System.out.println(qtdNotas10 + " nota(s) de R$ 10.00");
        System.out.println(qtdNotas5 + " nota(s) de R$ 5.00");
        System.out.println(qtdNotas2 + " nota(s) de R$ 2.00");

        int qtdMoedas1Real = valor / 100;
        valor %= 100;
        int qtdMoedas50 = valor / 50;
        valor %= 50;
        int qtdMoedas25 = valor / 25;
        valor %= 25;
        int qtdMoedas10 = valor / 10;
        valor %= 10;
        int qtdMoedas5 = valor / 5;
        valor %= 5;
        int qtdMoedas1Centavo = valor;

        System.out.println("MOEDAS:");
        System.out.println(qtdMoedas1Real + " moeda(s) de R$ 1.00");
        System.out.println(qtdMoedas50 + " moeda(s) de R$ 0.50");
        System.out.println(qtdMoedas25 + " moeda(s) de R$ 0.25");
        System.out.println(qtdMoedas10 + " moeda(s) de R$ 0.10");
        System.out.println(qtdMoedas5 + " moeda(s) de R$ 0.05");
        System.out.println(qtdMoedas1Centavo + " moeda(s) de R$ 0.01");
    }
}