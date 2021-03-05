import java.io.IOException;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);
        double A = leitor.nextDouble();
        double B = leitor.nextDouble();
        double C = leitor.nextDouble();

        double delta = (B * B) - (4 * A * C);
        double division = 2 * A;

        if (delta < 0 || division == 0) {
            System.out.println("Impossivel calcular");
        } else {
            double R1 = (-B + Math.sqrt(delta))/division;
            double R2 = (-B - Math.sqrt(delta))/division;
            System.out.println("R1 = " + String.format("%,.5f", R1));
            System.out.println("R2 = " + String.format("%,.5f", R2));
        }
    }
}
