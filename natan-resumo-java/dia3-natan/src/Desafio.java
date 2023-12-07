import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        //O imput
        Scanner lerNumeros = new Scanner(System.in);
        System.out.println("Digite um numero");
        int num = lerNumeros.nextInt();

        //codigo

        if(num < 9 && num >= 1)
        System.out.println("este numero possui 1 digito");

        else if (num < 100 && num >= 10)
        System.out.println("Esse numero possui 2 digitos");

        else if (num < 1000 && num >= 100)
        System.out.println("Esse numero possui 3 digitos");

        else if (num < 10000 && num >=1000)
        System.out.println("Esse numero possui 4 digitos");

        else
        System.out.println("Esse numero possui 5 ou mais digitos");


    
        

    }
}
