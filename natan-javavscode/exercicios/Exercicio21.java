
import java.util.Locale;
import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, par=0;
        System.out.println("Quantos numereros vão ser digitados?");
        n = sc.nextInt();

        int[] number = new int[n];
        int[] numPar = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Digite um numero: ");
            number[i] = sc.nextInt();
            if (number[i] % 2 == 0) {
                numPar[i] = number[i];
            }
        }

        System.out.println("Numeros pares: ");
        for (int i = 0; i < numPar.length; i++) {
            if (numPar[i] != 0) {
                par += 1;
                System.out.print(numPar[i] + " ");

            }

        }
        System.out.println("\nQuantidade de Pares = " + par);
        

        sc.close();

        //o do professor foi esse abaixo 
        //Scanner sc = new Scanner(System.in);
		
		// int n, qtdpares;

	    // System.out.print("Quantos numeros voce vai digitar? ");
	    // n = sc.nextInt();

	    // int[] vetor = new int[n];

	    // for (int i=0; i<n; i++) {
	    // 	System.out.print("Digite um numero: ");
	    //     vetor[i] = sc.nextInt();
	    // }

	    // System.out.println("\nNUMEROS PARES:");

		// qtdpares = 0;
	    // for (int i=0; i<n; i++) {
	    //     if (vetor[i] % 2 == 0) {
	    //     	System.out.printf("%d  ", vetor[i]);
	    //         qtdpares++;
	    //     }
	    // }

	    // System.out.printf("\n\nQUANTIDADE DE PARES = %d\n", qtdpares);

		// sc.close();
    }
}
