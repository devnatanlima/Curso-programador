import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        //  Locale.setDefault(Locale.US);
        // Scanner sc = new Scanner(System.in);
        // double cod1, peca1, valor1, cod2, peca2, valor2;
        
        // cod1 = sc.nextDouble();
        // sc.nextLine();
        // peca1 = sc.nextDouble();
        // sc.nextLine();
        // valor1 = sc.nextDouble();
        // sc.nextLine();
        // cod2 = sc.nextDouble();
        // sc.nextLine();
        // peca2 = sc.nextDouble();
        // sc.nextLine();
        // valor2 = sc.nextDouble();

        // double soma = ((peca1 * valor1) + (peca2 * valor2));
        
        // System.out.printf("o valor a ser pago é de R$ %.2f", soma);
        // sc.close();

        

            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);
    
            int qte1, qte2;
            double preco1, preco2, total;
    
           
            qte1 = sc.nextInt();
            preco1 = sc.nextDouble();
            
        
            qte2 = sc.nextInt();
            preco2 = sc.nextDouble();
    
            total = preco1 * qte1 + preco2 * qte2;
    
            System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
            
            sc.close();

    }
}
