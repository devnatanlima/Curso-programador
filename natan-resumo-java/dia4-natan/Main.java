import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //coletar o nome do produto
        System.out.print("Digite o nome do produto: ");
        Scanner s = new Scanner(System.in);
        String nomeProduto = s.next().toLowerCase();

        //retornar o valor do produto

        switch (nomeProduto) {
            case "banana":
            System.out.println("R$ 9,50");
            break;
            
            case "manga":
            System.out.println("R$ 10,50");
            break;

            case "laranja":
            System.out.println("R$ 16,50");
            
        }
    }
}