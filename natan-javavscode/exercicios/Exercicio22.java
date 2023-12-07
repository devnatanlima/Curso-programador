import java.util.Locale;
import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, posMaior;
        double maior;

        System.out.println("Quantos valores você vai digitar? ");
        n = sc.nextInt();
        double[] real = new double[n];

        for(int i = 0; i < n; i++) {
            System.out.println("Digite um número real: ");
            real[i] = sc.nextDouble();
           
        }

        posMaior = 0;
        maior=0;
        for(int i = 0; i<n; i++) {
            if(real[i] > maior){
                maior = real[i];
                posMaior = i;
            }
        }

        System.out.printf("Maior valor = %.1f%n", maior);
        System.out.printf("Posição do maior valor = %d", posMaior);





        sc.close();
    }
}
