import java.util.Locale;

public class Exercicio4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        int funcionario = 1;
        double horas = 200;
        double valor = 20.50;
        double resultado = ( horas * valor );
        System.out.printf("number = %d %nSalary = R$ %.2f", funcionario, resultado);
    }
}
