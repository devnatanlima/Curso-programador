package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class ProgramaArea {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Rectangle retangulo = new Rectangle();

        System.out.println("Enter rectangle width e height: ");
        retangulo.width = sc.nextDouble();
        retangulo.height = sc.nextDouble();
        System.out.println();

        System.out.println(retangulo.valorArea());
        System.out.println();
        System.out.println(retangulo.valorPerimeter());
        System.out.println();
        System.out.println(retangulo.valorDiagonal());

        sc.close();

    }
}
