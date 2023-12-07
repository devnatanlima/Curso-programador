import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite quatro numeros inteiros:");
        

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        
        int soma = ((a * b)-(c * d));
        System.out.println("a diferença é igual a:" + soma);
        sc.close();
    }
}
