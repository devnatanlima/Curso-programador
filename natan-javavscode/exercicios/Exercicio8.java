import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num %2 == 0 ){
            System.out.println("este número é par");
        }
        else {
            System.out.println("Este número é impar");
        }
        sc.close();
    }
}
