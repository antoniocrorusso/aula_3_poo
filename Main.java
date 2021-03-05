import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        int A, B, C, D;
        Scanner leitor = new Scanner(System.in);
        A = leitor.nextInt();
        B = leitor.nextInt();
        C = leitor.nextInt();
        D = leitor.nextInt();
        if (B > C && D > A && C + D > A + B && C >= 0 && D >= 0 && A % 2 == 0) {
            // print ("Valores aceitos")
            System.out.print("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }
    }
}
