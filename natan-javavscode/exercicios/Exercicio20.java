import java.util.Locale;
import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n, nmenores;
        double alturaTotal, alturaMedia, percentualMenores;
        System.out.println("Quantas pessoas serao digitadas? ");
        n = sc.nextInt();

        String[] nomes = new String[n];
        double[] idades = new double[n];
        double[] alturas = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite o nome da " + (i + 1) + "° pessoa: ");
            nomes[i] = sc.next();
            System.out.println("Digite a idade: ");
            idades[i] = sc.nextDouble();
            System.out.println("Digite a altura: ");
            alturas[i] = sc.nextDouble();
        }

        alturaMedia=0;
        alturaTotal=0;
        nmenores=0;

        for (int i = 0; i < n; i++) {
            if (idades[i] < 16){
                nmenores++;
            }
            alturaTotal += alturas[i];
        }
        percentualMenores = ((double)nmenores / n) * 100;

        alturaMedia = alturaTotal / n;

        System.out.printf("ALtura media: %.2f\n", alturaMedia);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenores);

         for (int i = 0; i < n; i++) {
            if (idades[i] < 16){
                System.out.printf("%s\n", nomes[i]);
            }
        }

        sc.close();
    }
}
