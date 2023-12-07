import java.util.Locale;
import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double salario = sc.nextDouble();
        double imposto;

        if (salario <= 2000.00) {
            imposto = 0;
            System.out.println("isento");
        }
         else if (salario > 2000.00 && salario <= 3000.00) {
            imposto = (salario -2000.00) * .08;
            System.out.printf("R$ %.2f", imposto);
        } 
        else if (salario > 3000.00 && salario <= 4500.00) {
            imposto = (salario - 3000) * 0.18 + 1000.0 * 0.08 ;
            System.out.printf("R$ %.2f", imposto);
        } 
        else {
            imposto = (salario - 4500.00) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
            System.out.printf("R$ %.2f", imposto);
        }
        sc.close();

    }
}
