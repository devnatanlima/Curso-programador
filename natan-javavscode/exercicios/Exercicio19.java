import java.util.Locale;
import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Quantos numeros você vai digitar? ");
        n = sc.nextInt();
        double[] vect = new double[n];
        for (int i=0; i < vect.length; i++) {
            System.out.println("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }

        System.out.print("VALORES = ");

	    for (int i=0; i<n; i++) {
	    	System.out.printf("%.1f  ", vect[i]);
	    }

        System.out.println();
        

        double resul = 0.0;
        for (int i=0; i< vect.length; i++) {
            resul += vect[i];
        }
        System.out.println("soma = " + resul);
        
        double media = resul / vect.length;
        System.out.println("Media = " + media);


sc.close();
    }
}
