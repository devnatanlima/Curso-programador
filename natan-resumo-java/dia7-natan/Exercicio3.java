import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        System.out.println("Digite o num1 op num2 ex( 2 * 4):");
        Scanner cal = new Scanner (System.in);

        double a = cal.nextInt();
        char op = cal.next().charAt(0);
        double b = cal.nextInt();

        if(op == '+')
        System.out.println((int)a + b);

         else if(op == '-')
         System.out.println((int)a - b);

         else if(op == '*')
         System.out.println ((int)Math.round(a * b));

         else if(op == '/')
         System.out.println(a / b);

         else
         System.out.println("formato invalido!");
         
         

    


    }
}
