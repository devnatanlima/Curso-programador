import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B, valor, dia = 24;
        A = sc.nextInt();
        B = sc.nextInt();
        if(A < B) {
            valor = B - A;

        }

        else {
           valor = dia - A + B;
        }
        
        System.out.printf("o jogo durou %d hora(s)", valor);

        sc.close();
    }
}
