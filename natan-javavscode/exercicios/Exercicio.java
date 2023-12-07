import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("digite uma fruta disponivel no estoque: \n Pera, Uva, Maçã");
        String fruta = sc.next().toLowerCase();

        // System.out.println("digite o primeiro numero:");
        // int x = sc.nextInt();

        // System.out.println("digite o segundo numero:");
        // int y = sc.nextInt();

        // int soma = x + y;
        // System.out.println("soma = " + soma);

        switch(fruta){
            case "pera":
            System.out.println("10");
            break;
            case "uva":
            System.out.println("5");
            break;
            case "maçã" :
            System.out.println("50");
            break;
            default:
            System.out.println("digite uma fruta valida! Opcoes: Pera, uva ou maçã.");

        }



        sc.close();
    }

}
