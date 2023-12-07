package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Salario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Employee salario = new Employee();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do funcionario: ");
        salario.name = sc.next();
        System.out.println("Digite o valor do salario bruto: ");
        salario.salarioBruto = sc.nextDouble();
        System.out.println("Digite o valor do imposto: ");
        salario.imposto = sc.nextDouble();
        System.out.println();
        System.out.println("Employee: " + salario);

       
        System.out.println();
        System.out.println("Which percentage to increase salary?");
        double percentage = sc.nextDouble();
        salario.aumentoSalario(percentage);

        System.out.println();
        System.out.println("Updated data: " + salario);

        

    

        



        sc.close();
        
    }
}
