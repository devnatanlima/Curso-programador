import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        System.out.println("Digite um numero inteiro:");

        int n = num.nextInt();

        if (n % 2 == 1)
            System.out.println("Este numero é impar");

        else if (n >= 2 && n <= 5)
            System.out.println("N = A");

        else if (n >= 6 && n <= 20)
            System.out.println("N = B");

        else if (n < 0)
            System.out.println("este numero é invalido");

        else
            System.out.println("N = C");

    }

}
