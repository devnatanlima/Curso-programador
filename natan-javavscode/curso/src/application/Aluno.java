package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Aluno {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Digite o nome do aluno: ");
        student.name = sc.nextLine();
        System.out.print("Digite a nota do 1° trimestre: ");
        
        student.media1 = sc.nextDouble();
        System.out.print("Digite a nota do 2° trimestre: ");
        
        student.media2 = sc.nextDouble();
        System.out.print("Digite a nota do 3° trimestre: ");
        
        student.media3 = sc.nextDouble();
        System.out.printf("Aluno: " + student.name + " " + "%nFinal grade: %.2f%n %s", student.mediaAluno(),
                student.resultado());

        sc.close();
    }
}
