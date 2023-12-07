public class Main2 {
    public static void main(String[] args) {
        System.out.println("Retorne os numeros pares de 0 a 20");
        number(20);
    }

    public static void number (int num) {
        for(int i = 0; i <= num; i++)
        if(i % 2 == 0)
        System.out.print(i + " ");
    }
}
