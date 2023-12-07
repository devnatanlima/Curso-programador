import java.util.Locale;
import java.util.Scanner;

public class Exercico11 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
    

        System.out.println("Digite um numero de entre 1 e 5:");

        int n1, n2;
        double v1, v2, v3, v4, v5, total;
        v1 = 4.00;
        v2 = 4.50;
        v3 = 5.00;
        v4 = 2.00;
        v5 = 1.50;

        n1 = sc.nextInt();
        n2 = sc.nextInt();
        if (n1 == 1) {
            total = v1 * n2;
            System.out.printf("Total: R$ %.2f", total);

        }
        else if (n1 == 2) {
            total = v2 * n2;
            System.out.printf("Total: R$ %.2f", total);

        }
        else if (n1 == 3) {
            total = v3 * n2;
            System.out.printf("Total: R$ %.2f", total);

        }
        else if (n1 == 4) {
            total = v4 * n2;
            System.out.printf("Total: R$ %.2f", total);

        }
        else {
            total = v5 * n2;
            System.out.printf("Total: R$ %.2f", total);

        }
        sc.close();
        
    }
}
