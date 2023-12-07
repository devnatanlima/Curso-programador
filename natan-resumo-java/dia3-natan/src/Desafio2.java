import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        // Scanner num = new Scanner(System.in);
        // System.out.println("Digite um numero com 3 digitos");

        // int valor = num.nextInt();

        // if (valor < 100 || valor > 999)
        //     System.out.println("O valor esta incorreto");

        //     else
        //     System.out.println("Valor aceito");
Scanner valor = new Scanner(System.in);
System.out.println("Digite um valor");
        int ingresso = valor.nextInt();
        int fixo = 500;
        int troco = ingresso - fixo; 

        String terAcesso = ingresso >= 500 ? "Aceito" : "Recusado";
        System.out.println(terAcesso);
        System.out.println("voce tem um saldo de:" + troco);

    }
}
