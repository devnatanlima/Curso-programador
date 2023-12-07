import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num < 0 ){
            System.out.println("este número é negativo");
        }
        else {
            System.out.println("Este número é par");
        }
        sc.close();
    }
}
